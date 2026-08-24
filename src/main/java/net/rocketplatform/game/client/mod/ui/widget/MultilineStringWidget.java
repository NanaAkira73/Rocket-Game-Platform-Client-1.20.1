package net.rocketplatform.game.client.mod.ui.widget;

import net.minecraft.client.gui.GuiGraphics;
import java.util.*;

public class MultilineStringWidget {
    public static class CacheKey {
        public String text;
        public int width;
    }

    public List<String> lines = new ArrayList<>();
    public int x, y, width;
    public int color = 0xFFFFFF;

    public void render(GuiGraphics graphics) {
        var font = net.minecraft.client.Minecraft.getInstance().font;
        for (int i = 0; i < lines.size(); i++) {
            graphics.drawString(font, lines.get(i), x, y + i * 12, color);
        }
    }
}