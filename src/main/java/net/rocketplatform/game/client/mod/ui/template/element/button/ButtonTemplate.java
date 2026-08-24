package net.rocketplatform.game.client.mod.ui.template.element.button;

import com.google.gson.JsonObject;
import net.rocketplatform.game.client.mod.ui.template.element.ElementTemplate;

public class ButtonTemplate extends ElementTemplate {
    public String label;
    public String callback;

    public ButtonTemplate(JsonObject data) {
        this.data = data;
    }
}