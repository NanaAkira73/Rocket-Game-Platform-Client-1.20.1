package net.rocketplatform.game.client.mod;

import java.io.IOException;
import java.nio.file.*;

public class RocketClientLogging {
    public static void init() {
        try {
            Path logPath = Paths.get("logs", "rocket-client.log");
            Files.createDirectories(logPath.getParent());
            if (!Files.exists(logPath)) {
                Files.createFile(logPath);
            }
        } catch (IOException e) {
            RocketClientMod.LOGGER.warn("Failed to create rocket client log file", e);
        }
    }
}