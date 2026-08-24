package net.rocketplatform.game.client.mod.ui.repository;

import com.google.gson.JsonObject;

public class LayoutParser {
    public static JsonObject parse(String json) {
        return new com.google.gson.JsonParser().parse(json).getAsJsonObject();
    }
}