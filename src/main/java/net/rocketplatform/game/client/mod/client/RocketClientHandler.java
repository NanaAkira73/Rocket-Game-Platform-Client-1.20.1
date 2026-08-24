package net.rocketplatform.game.client.mod.client;

import com.google.gson.*;
import net.rocketplatform.game.client.mod.RocketClientMod;
import net.rocketplatform.game.client.mod.config.RocketClientModConfig;
import net.rocketplatform.game.client.mod.keypair.KeypairManager;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

public class RocketClientHandler {
    private final KeypairManager keypairManager;
    private final String apiUrl;

    public RocketClientHandler() {
        this.keypairManager = new KeypairManager();
        this.apiUrl = RocketClientModConfig.get().apiUrl;
    }

    public CompletableFuture<JsonObject> request(String endpoint, JsonObject body) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                String url = apiUrl + endpoint;
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.setConnectTimeout(10000);
                conn.setReadTimeout(10000);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("User-Agent", "RGP-Client/1.0");

                String json = new Gson().toJson(body != null ? body : new JsonObject());
                try (OutputStream os = conn.getOutputStream()) {
                    os.write(json.getBytes(StandardCharsets.UTF_8));
                }

                if (conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) {
                    try (InputStream is = conn.getInputStream()) {
                        return JsonParser.parseString(new String(is.readAllBytes(), StandardCharsets.UTF_8)).getAsJsonObject();
                    }
                }
            } catch (Exception e) {
                RocketClientMod.LOGGER.warn("RGP API request failed: {}", e.getMessage());
            }
            return null;
        });
    }

    public KeypairManager getKeypairManager() {
        return keypairManager;
    }
}