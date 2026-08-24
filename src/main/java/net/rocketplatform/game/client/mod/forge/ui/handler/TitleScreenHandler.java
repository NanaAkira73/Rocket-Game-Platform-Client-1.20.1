package net.rocketplatform.game.client.mod.forge.ui.handler;

import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraftforge.client.event.ScreenEvent;
import net.rocketplatform.game.client.mod.RocketClientMod;
import net.rocketplatform.game.client.mod.config.RocketClientModConfig;
import net.rocketplatform.game.client.mod.ui.FTBWorldsButton;

public class TitleScreenHandler {
    public static void onTitleScreenInit(ScreenEvent.Init.Post event) {
        if (!(event.getScreen() instanceof TitleScreen)) return;
        if (!RocketClientModConfig.get().showFTBWorldsButton) return;

        int x = event.getScreen().width / 2 - 100;
        int y = event.getScreen().height / 4 + 48;
        FTBWorldsButton button = FTBWorldsButton.createVanilla(x, y, 200, 20);
        event.addListener(button);
    }
}