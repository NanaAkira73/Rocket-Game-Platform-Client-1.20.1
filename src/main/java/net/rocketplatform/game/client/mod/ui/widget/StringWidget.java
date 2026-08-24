package net.rocketplatform.game.client.mod.ui.widget;

import net.minecraft.client.gui.GuiGraphics;

public class StringWidget {
    public String text;
    public int x, y;
    public int color = 0xFFFFFF;

    public void render(GuiGraphics graphics) {
        graphics.drawString(net.minecraft.client.Minecraft.getInstance().font, text, x, y, color);
    }
}