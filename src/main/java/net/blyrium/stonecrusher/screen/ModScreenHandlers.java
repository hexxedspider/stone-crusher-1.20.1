package net.blyrium.stonecrusher.screen;

import net.blyrium.stonecrusher.StoneCrusher;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CrusherScreenHandler> CRUSHER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(StoneCrusher.MOD_ID, "crusher"),
                    new ScreenHandlerType<>(CrusherScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static void registerScreenHandlers() {
        StoneCrusher.LOGGER.info("Registering Screen Handlers for " + StoneCrusher.MOD_ID);
    }
}