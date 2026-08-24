package net.rocketplatform.game.client.mod.bridge;

import net.minecraft.client.gui.screens.Screen;

public class BaseScreenBridge {
    public static boolean isMainMenu(Screen screen) {
        return screen instanceof net.minecraft.client.gui.screens.TitleScreen;
    }

    public static boolean isPauseScreen(Screen screen) {
        return screen instanceof net.minecraft.client.gui.screens.PauseScreen;
    }
}