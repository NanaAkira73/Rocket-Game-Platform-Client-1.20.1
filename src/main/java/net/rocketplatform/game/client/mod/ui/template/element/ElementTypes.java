package net.rocketplatform.game.client.mod.ui.template.element;

import java.util.*;

public class ElementTypes {
    private static final Map<String, ElementType> TYPES = new HashMap<>();

    public static void register(ElementType type) {
        TYPES.put(type.name, type);
    }

    public static ElementType get(String name) {
        return TYPES.get(name);
    }
}