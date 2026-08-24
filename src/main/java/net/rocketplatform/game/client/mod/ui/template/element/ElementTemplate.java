package net.rocketplatform.game.client.mod.ui.template.element;

import com.google.gson.JsonObject;
import net.minecraft.client.gui.GuiGraphics;

public class ElementTemplate {
    public enum Position { LEFT, CENTER, RIGHT }
    public enum Pivot { TOP_LEFT, CENTER }

    public String id;
    public int x, y, width, height;
    public Position position = Position.LEFT;
    public Pivot pivot = Pivot.TOP_LEFT;
    public JsonObject data;

    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {}
    public void onClick(double mouseX, double mouseY) {}
}