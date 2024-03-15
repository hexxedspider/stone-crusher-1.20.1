package net.blyrium.stonecrusher;

import net.blyrium.stonecrusher.screen.CrusherScreen;
import net.blyrium.stonecrusher.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class StoneCrusherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.CRUSHER_SCREEN_HANDLER, CrusherScreen::new);
    }
}
