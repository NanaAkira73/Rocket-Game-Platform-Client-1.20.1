package net.rocketplatform.game.client.mod.ui.template.layout.type;

import com.google.gson.JsonObject;
import net.rocketplatform.game.client.mod.ui.template.layout.LayoutTemplate;

public class AbstractListLayoutTemplate extends LayoutTemplate {
    public AbstractListLayoutTemplate(JsonObject data) {
        this.data = data;
    }
}