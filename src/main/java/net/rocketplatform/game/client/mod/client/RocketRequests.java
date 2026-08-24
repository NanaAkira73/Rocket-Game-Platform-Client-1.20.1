package net.rocketplatform.game.client.mod.client;

import com.google.gson.JsonObject;

public class RocketRequests {
    public static JsonObject switchPlayerServerWorld(String worldId) {
        JsonObject body = new JsonObject();
        body.addProperty("worldId", worldId);
        return body;
    }

    public static JsonObject worldUploadProgress(String worldId, long progress) {
        JsonObject body = new JsonObject();
        body.addProperty("worldId", worldId);
        body.addProperty("progress", progress);
        return body;
    }
}