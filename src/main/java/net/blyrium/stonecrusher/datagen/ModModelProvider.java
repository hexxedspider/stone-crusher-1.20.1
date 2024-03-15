package net.blyrium.stonecrusher.datagen;

import net.blyrium.stonecrusher.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerCustomLamp(blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    private void registerCustomLamp(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCooker(ModBlocks.CRUSHER, TexturedModel.ORIENTABLE);
    }
}
