package net.rocketplatform.game.client.mod.ui;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class FTBWorldsButton extends Button {
    public FTBWorldsButton(int x, int y, int w, int h, OnPress onPress) {
        super(x, y, w, h, Component.literal("FTB Worlds"), onPress, DEFAULT_NARRATION);
    }

    public static FTBWorldsButton createVanilla(int x, int y, int w, int h) {
        return new FTBWorldsButton(x, y, w, h, btn -> {
            // Handled by KubeJS action
        });
    }

    public void buttonPressed(Screen screen) {
        // Open FTB Worlds screen
    }
}