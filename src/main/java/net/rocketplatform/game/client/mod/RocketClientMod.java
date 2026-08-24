package net.rocketplatform.game.client.mod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Constants.MOD_ID)
public class RocketClientMod {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static RocketClientMod instance;

    public RocketClientMod() {
        instance = this;
        LOGGER.info("Rocket Game Platform Client loaded");
    }

    public static RocketClientMod getInstance() {
        return instance;
    }
}