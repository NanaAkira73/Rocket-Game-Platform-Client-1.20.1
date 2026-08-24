package net.rocketplatform.game.client.mod.ui.repository;

import com.google.gson.*;
import java.util.*;

public class LayoutRepository {
    private final Map<String, JsonObject> layouts = new HashMap<>();

    public void loadLayout(String id, JsonObject data) {
        layouts.put(id, data);
    }

    public JsonObject getLayout(String id) {
        return layouts.get(id);
    }

    public boolean hasLayout(String id) {
        return layouts.containsKey(id);
    }
}