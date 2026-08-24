package net.rocketplatform.game.client.mod.platform;

public class ModPlatform {
    public static boolean isModLoaded(String modId) {
        return net.minecraftforge.fml.ModList.get().isLoaded(modId);
    }
}