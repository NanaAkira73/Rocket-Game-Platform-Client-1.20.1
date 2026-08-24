package net.rocketplatform.game.client.mod.ui.template.callback;

import com.google.gson.JsonObject;

public class CallbackHolder {
    public String type;
    public JsonObject data;
    public CallbackHolder(String type, JsonObject data) {
        this.type = type;
        this.data = data;
    }
}