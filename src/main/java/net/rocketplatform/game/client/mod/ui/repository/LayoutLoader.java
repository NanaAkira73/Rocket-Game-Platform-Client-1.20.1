package net.rocketplatform.game.client.mod.ui.repository;

import com.google.gson.JsonObject;

public class LayoutLoader {
    public static void load(LayoutRepository repo, String id, JsonObject data) {
        repo.loadLayout(id, data);
    }
}