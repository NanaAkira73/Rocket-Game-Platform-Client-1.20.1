package net.rocketplatform.game.client.mod.ui.template.callback;

import com.google.gson.JsonObject;
import java.util.function.Function;

public class ElementCallbackType {
    public interface Factory {
        void execute(JsonObject data);
    }
    public final String name;
    public final Function<JsonObject, Factory> factory;

    public ElementCallbackType(String name, Function<JsonObject, Factory> factory) {
        this.name = name;
        this.factory = factory;
    }
}