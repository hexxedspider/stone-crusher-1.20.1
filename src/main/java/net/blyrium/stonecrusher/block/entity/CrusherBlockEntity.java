package net.blyrium.stonecrusher.block.entity;

import net.blyrium.stonecrusher.recipe.CrusherRecipe;
import net.blyrium.stonecrusher.screen.CrusherScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class CrusherBlockEntity extends AbstractFurnaceBlockEntity {
    public CrusherBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CRUSHER_BLOCK_ENTITY, pos, state, CrusherRecipe.Type.INSTANCE);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("block.stonecrusher.crusher");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new CrusherScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}