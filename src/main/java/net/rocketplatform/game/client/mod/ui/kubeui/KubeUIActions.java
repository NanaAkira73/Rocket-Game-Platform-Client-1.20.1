package net.rocketplatform.game.client.mod.ui.kubeui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ConfirmScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class KubeUIActions {
    public static final Consumer<Screen> FTB_WORLDS = screen -> {
        Minecraft.getInstance().setScreen(new ConfirmScreen(
            accepted -> {
                if (accepted) {
                    // Open FTB Worlds
                }
                Minecraft.getInstance().setScreen(screen);
            },
            Component.literal("FTB Worlds"),
            Component.literal("FTB Worlds feature is being ported to 1.20.1"),
            Component.literal("Open"),
            Component.literal("Cancel")
        ));
    };
}