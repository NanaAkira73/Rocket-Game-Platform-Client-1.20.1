package net.rocketplatform.game.client.mod.ui.template.callback;

import java.util.*;

public class ElementCallbackTypes {
    private static final Map<String, ElementCallbackType> TYPES = new HashMap<>();

    public static void register(ElementCallbackType type) {
        TYPES.put(type.name, type);
    }

    public static ElementCallbackType get(String name) {
        return TYPES.get(name);
    }
}