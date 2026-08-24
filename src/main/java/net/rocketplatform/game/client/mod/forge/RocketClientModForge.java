package net.rocketplatform.game.client.mod.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.rocketplatform.game.client.mod.Constants;
import net.rocketplatform.game.client.mod.RocketClientMod;
import net.rocketplatform.game.client.mod.forge.ui.handler.TitleScreenHandler;

@Mod(Constants.MOD_ID)
public class RocketClientModForge {
    public RocketClientModForge() {
        if (FMLEnvironment.dist == Dist.CLIENT) {
            MinecraftForge.EVENT_BUS.register(this);
        }
        new RocketClientMod();
    }

    @SubscribeEvent
    public void onScreenInit(ScreenEvent.Init.Post event) {
        TitleScreenHandler.onTitleScreenInit(event);
    }
}