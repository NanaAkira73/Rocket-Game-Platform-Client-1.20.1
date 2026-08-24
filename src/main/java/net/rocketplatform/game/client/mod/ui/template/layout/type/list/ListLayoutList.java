package net.rocketplatform.game.client.mod.ui.template.layout.type.list;

import net.minecraft.client.gui.GuiGraphics;

public class ListLayoutList {
    public static class ListEntry {
        public String id;
        public String title;
        public String subtitle;
    }

    public static class EmptyHeader {
        public void render(GuiGraphics graphics, int x, int y, int width) {}
    }

    public static class LoadingHeader {
        public void render(GuiGraphics graphics, int x, int y, int width) {}
    }
}