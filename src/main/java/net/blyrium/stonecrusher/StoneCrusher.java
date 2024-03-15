package net.blyrium.stonecrusher;

import net.blyrium.stonecrusher.block.ModBlocks;
import net.blyrium.stonecrusher.block.entity.ModBlockEntities;
import net.blyrium.stonecrusher.recipe.ModRecipes;
import net.blyrium.stonecrusher.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoneCrusher implements ModInitializer {
	public static final String MOD_ID = "stonecrusher";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.RegisterRecipes();
	}
}