package net.rocketplatform.game.client.mod.ui.variable;

import java.util.*;

public class GlobalVariables {
    private static final Map<String, String> VARIABLES = new HashMap<>();

    public static void set(String key, String value) {
        VARIABLES.put(key, value);
    }

    public static String get(String key) {
        return VARIABLES.getOrDefault(key, "");
    }

    public static void remove(String key) {
        VARIABLES.remove(key);
    }

    public static Map<String, String> getAll() {
        return new HashMap<>(VARIABLES);
    }
}