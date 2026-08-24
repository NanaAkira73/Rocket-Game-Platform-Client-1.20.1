package net.rocketplatform.game.client.mod.ui.variable;

import java.util.*;

public class VariableStorage {
    private final Map<String, String> storage = new HashMap<>();

    public void store(String key, String value) { storage.put(key, value); }
    public String get(String key) { return storage.getOrDefault(key, ""); }
    public Map<String, String> getAll() { return new HashMap<>(storage); }
}