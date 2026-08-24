package net.rocketplatform.game.client.mod.ui.template.layout;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class LayoutType {
    public interface Factory {
        LayoutTemplate create(JsonObject data);
    }
    public final String name;
    public final Function<JsonObject, Factory> factory;

    public LayoutType(String name, Function<JsonObject, Factory> factory) {
        this.name = name;
        this.factory = factory;
    }
}