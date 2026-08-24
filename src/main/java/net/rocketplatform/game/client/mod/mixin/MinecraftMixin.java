package net.rocketplatform.game.client.mod.mixin;

import net.minecraft.client.Minecraft;
import net.rocketplatform.game.client.mod.RocketClientMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "<init>", at = @At("RETURN"))
    private void onInit(CallbackInfo ci) {
        RocketClientMod.LOGGER.info("Minecraft client initialized with RGP Client");
    }
}