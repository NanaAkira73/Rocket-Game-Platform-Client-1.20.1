package net.rocketplatform.game.client.mod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.ModList;
import org.slf4j.Logger;

public class RocketClientMod {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static RocketClientMod instance;
    public static boolean isLoaded = false;

    public RocketClientMod() {
        instance = this;
        isLoaded = true;
        LOGGER.info("Rocket Game Platform Client loaded");
    }

    public static RocketClientMod getInstance() {
        return instance;
    }
}