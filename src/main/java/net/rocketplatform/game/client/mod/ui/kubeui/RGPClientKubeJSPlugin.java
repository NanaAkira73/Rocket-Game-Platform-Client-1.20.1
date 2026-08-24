package net.rocketplatform.game.client.mod.ui.kubeui;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.ui.UIData;

public class RGPClientKubeJSPlugin extends KubeJSPlugin {
    @Override
    public void init() {
        UIData.registerAction("rgp_client:ftb_worlds", KubeUIActions.FTB_WORLDS);
    }
}