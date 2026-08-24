package net.rocketplatform.game.client.mod.config;

import com.google.gson.*;
import java.io.*;
import java.nio.file.*;

public class RocketClientModConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static ConfigData data = new ConfigData();

    public static class ConfigData {
        public boolean enabled = true;
        public String apiUrl = "https://api.rocketplatform.game";
        public boolean showFTBWorldsButton = true;
    }

    public static void load() {
        Path configFile = Paths.get("config", "rgp_client.json");
        if (Files.exists(configFile)) {
            try (Reader reader = new FileReader(configFile.toFile())) {
                data = GSON.fromJson(reader, ConfigData.class);
            } catch (Exception ignored) {}
        }
        save();
    }

    public static void save() {
        Path configFile = Paths.get("config", "rgp_client.json");
        try {
            Files.createDirectories(configFile.getParent());
            try (Writer writer = new FileWriter(configFile.toFile())) {
                GSON.toJson(data, writer);
            }
        } catch (Exception ignored) {}
    }

    public static ConfigData get() { return data; }
}