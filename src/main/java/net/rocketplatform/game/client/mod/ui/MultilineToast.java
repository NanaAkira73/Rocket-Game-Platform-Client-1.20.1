package net.rocketplatform.game.client.mod.ui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MultilineToast {
    public static void show(List<Component> messages) {
        // Simple toast implementation
        for (Component msg : messages) {
            if (net.minecraft.client.Minecraft.getInstance().player != null) {
                net.minecraft.client.Minecraft.getInstance().player.displayClientMessage(msg, false);
            }
        }
    }
}