package net.rocketplatform.game.client.mod.ui.template.layout;

import java.util.*;

public class LayoutTypes {
    private static final Map<String, LayoutType> TYPES = new HashMap<>();

    public static void register(LayoutType type) {
        TYPES.put(type.name, type);
    }

    public static LayoutType get(String name) {
        return TYPES.get(name);
    }
}