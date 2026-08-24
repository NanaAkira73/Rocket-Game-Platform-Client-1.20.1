package net.rocketplatform.game.client.mod.ui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MultilineErrorScreen extends Screen {
    private final Screen parent;
    private final List<String> errors;

    public MultilineErrorScreen(Screen parent, List<String> errors) {
        super(Component.literal("Error"));
        this.parent = parent;
        this.errors = errors;
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        renderBackground(graphics);
        int y = 20;
        for (String error : errors) {
            graphics.drawCenteredString(font, error, width / 2, y, 0xFF5555);
            y += 15;
        }
        super.render(graphics, mouseX, mouseY, partialTicks);
    }

    @Override
    public void onClose() {
        if (minecraft != null) minecraft.setScreen(parent);
    }
}