package net.rocketplatform.game.client.mod.ui.template.element;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class ElementType {
    public interface Factory {
        ElementTemplate create(JsonObject data);
    }
    public final String name;
    public final Function<JsonObject, Factory> factory;

    public ElementType(String name, Function<JsonObject, Factory> factory) {
        this.name = name;
        this.factory = factory;
    }
}