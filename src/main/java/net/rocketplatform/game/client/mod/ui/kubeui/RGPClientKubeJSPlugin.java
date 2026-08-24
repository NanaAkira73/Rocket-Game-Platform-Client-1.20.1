package net.rocketplatform.game.client.mod.ui.kubeui;

import net.minecraftforge.fml.ModList;
import net.rocketplatform.game.client.mod.RocketClientMod;

import java.util.function.Consumer;

public class RGPClientKubeJSPlugin {
    public static final String FTB_WORLDS_ACTION = "rgp_client:ftb_worlds";

    public static void init() {
        if (!ModList.get().isLoaded("kubejs")) {
            return;
        }

        try {
            Class<?> uiDataClass = Class.forName("dev.latvian.mods.kubejs.ui.UIData");
            java.lang.reflect.Method registerAction = uiDataClass.getMethod("registerAction", String.class, Consumer.class);

            Consumer<Object> action = screen -> {
                var mc = net.minecraft.client.Minecraft.getInstance();
                mc.setScreen(new net.minecraft.client.gui.screens.ConfirmScreen(
                    accepted -> {
                        mc.setScreen((net.minecraft.client.gui.screens.Screen) screen);
                    },
                    net.minecraft.network.chat.Component.literal("FTB Worlds"),
                    net.minecraft.network.chat.Component.literal("FTB Worlds is being ported to 1.20.1"),
                    net.minecraft.network.chat.Component.literal("OK"),
                    net.minecraft.network.chat.Component.literal("Cancel")
                ));
            };
            registerAction.invoke(null, FTB_WORLDS_ACTION, action);
            RocketClientMod.LOGGER.info("Registered KubeJS action: {}", FTB_WORLDS_ACTION);
        } catch (Exception e) {
            RocketClientMod.LOGGER.warn("Failed to register KubeJS action: {}", e.getMessage());
        }
    }
}