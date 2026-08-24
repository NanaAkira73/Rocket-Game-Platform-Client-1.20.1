package net.rocketplatform.game.client.mod.util.gson;

import com.google.gson.*;
import java.lang.reflect.Type;

public class PolymorphicTypeReader implements JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return null;
    }
}