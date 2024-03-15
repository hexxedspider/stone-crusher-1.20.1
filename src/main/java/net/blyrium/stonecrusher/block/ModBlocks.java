package net.blyrium.stonecrusher.block;

import net.blyrium.stonecrusher.StoneCrusher;
import net.blyrium.stonecrusher.block.custom.Crusher;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CRUSHER = registerBlock("crusher",
            new Crusher(FabricBlockSettings.copyOf(Blocks.BLAST_FURNACE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StoneCrusher.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.add(block);
        });
        return Registry.register(Registries.ITEM, new Identifier(StoneCrusher.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        StoneCrusher.LOGGER.info("Registering mod items for " + StoneCrusher.MOD_ID);
    }
}
