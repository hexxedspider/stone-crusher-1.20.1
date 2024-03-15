package net.blyrium.stonecrusher.block.entity;

import net.blyrium.stonecrusher.StoneCrusher;
import net.blyrium.stonecrusher.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CrusherBlockEntity> CRUSHER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(StoneCrusher.MOD_ID, "crusher_be"),
                    FabricBlockEntityTypeBuilder.create(CrusherBlockEntity::new,
                            ModBlocks.CRUSHER).build(null));

    public static void registerBlockEntities() {
        StoneCrusher.LOGGER.info("Registering Block Entities for " + StoneCrusher.MOD_ID);
    }
}