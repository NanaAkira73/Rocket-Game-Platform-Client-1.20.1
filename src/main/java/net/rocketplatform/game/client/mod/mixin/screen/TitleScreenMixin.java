package net.rocketplatform.game.client.mod.mixin.screen;

import net.minecraft.client.gui.screens.TitleScreen;
import net.rocketplatform.game.client.mod.RocketClientMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(method = "init", at = @At("HEAD"))
    private void onInit(CallbackInfo ci) {
        RocketClientMod.isLoaded = true;
    }
}