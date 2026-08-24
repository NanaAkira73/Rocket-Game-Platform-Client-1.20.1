package net.rocketplatform.game.client.mod.ui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ModalPanel {
    private final int x, y, width, height;
    private final Screen parent;
    private String title;
    private String message;

    public ModalPanel(Screen parent, int x, int y, int width, int height) {
        this.parent = parent;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setTitle(String title) { this.title = title; }
    public void setMessage(String message) { this.message = message; }

    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        graphics.fill(x, y, x + width, y + height, 0xCC000000);
        if (title != null) {
            graphics.drawCenteredString(Minecraft.getInstance().font, title, x + width / 2, y + 10, 0xFFFFFF);
        }
        if (message != null) {
            graphics.drawCenteredString(Minecraft.getInstance().font, message, x + width / 2, y + 30, 0xBBBBBB);
        }
    }
}