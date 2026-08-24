package net.rocketplatform.game.client.mod.ui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public class PromoServerEntry {
    private final String name;
    private final String description;
    private final String address;

    public PromoServerEntry(String name, String description, String address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public void render(GuiGraphics graphics, int x, int y, int width, int height) {
        graphics.drawString(net.minecraft.client.Minecraft.getInstance().font, name, x + 5, y + 5, 0xFFFFFF);
        graphics.drawString(net.minecraft.client.Minecraft.getInstance().font, description, x + 5, y + 20, 0xBBBBBB);
    }
}