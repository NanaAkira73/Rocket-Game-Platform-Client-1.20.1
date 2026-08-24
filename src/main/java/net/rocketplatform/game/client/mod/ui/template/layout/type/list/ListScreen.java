package net.rocketplatform.game.client.mod.ui.template.layout.type.list;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ListScreen extends Screen implements IListScreen {
    private final Screen parent;
    private final java.util.List<String> entries = new java.util.ArrayList<>();

    public ListScreen(Screen parent) {
        super(Component.literal("List"));
        this.parent = parent;
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        renderBackground(graphics);
        for (int i = 0; i < entries.size(); i++) {
            renderEntry(graphics, i, 10, 30 + i * 25, width - 20, 20, mouseX, mouseY, partialTicks);
        }
        super.render(graphics, mouseX, mouseY, partialTicks);
    }

    @Override
    public void renderEntry(GuiGraphics graphics, int index, int x, int y, int w, int h, int mouseX, int mouseY, float partialTicks) {
        if (index < entries.size()) {
            graphics.drawString(font, entries.get(index), x, y, 0xFFFFFF);
        }
    }

    @Override
    public int getEntryCount() { return entries.size(); }

    @Override
    public void onClose() {
        if (minecraft != null) minecraft.setScreen(parent);
    }
}