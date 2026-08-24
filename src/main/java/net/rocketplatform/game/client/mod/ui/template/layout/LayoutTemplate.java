package net.rocketplatform.game.client.mod.ui.template.layout;

import com.google.gson.JsonObject;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;

public class LayoutTemplate {
    public String id;
    public JsonObject data;

    public Screen createScreen(Screen parent) {
        return null;
    }

    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {}
}