package net.rocketplatform.game.client.mod.ui.template.element;

import com.google.gson.JsonObject;

public class OptionalTooltipTemplate extends ElementTemplate {
    public String tooltip;
    public OptionalTooltipTemplate(JsonObject data) {
        this.data = data;
    }
}