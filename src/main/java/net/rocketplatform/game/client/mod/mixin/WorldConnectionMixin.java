package net.rocketplatform.game.client.mod.mixin;

import net.minecraft.client.multiplayer.ClientPacketListener;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientPacketListener.class)
public class WorldConnectionMixin {
    // Hook for world connection events
}