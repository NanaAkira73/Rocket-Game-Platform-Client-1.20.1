package net.rocketplatform.game.client.mod.ui.template.layout.type.list;

import net.minecraft.client.gui.GuiGraphics;

public interface IListScreen {
    void renderEntry(GuiGraphics graphics, int index, int x, int y, int width, int height, int mouseX, int mouseY, float partialTicks);
    int getEntryCount();
}