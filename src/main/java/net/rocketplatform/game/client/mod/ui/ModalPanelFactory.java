package net.rocketplatform.game.client.mod.ui;

import net.minecraft.client.gui.screens.Screen;

public class ModalPanelFactory {
    public static ModalPanel create(Screen parent, int width, int height) {
        int x = (parent.width - width) / 2;
        int y = (parent.height - height) / 2;
        return new ModalPanel(parent, x, y, width, height);
    }
}