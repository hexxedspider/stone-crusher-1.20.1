package net.blyrium.stonecrusher.screen;

import net.blyrium.stonecrusher.block.entity.CrusherBlockEntity;
import net.blyrium.stonecrusher.recipe.CrusherRecipe;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.*;

public class CrusherScreenHandler extends AbstractFurnaceScreenHandler {

    public CrusherScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.CRUSHER_SCREEN_HANDLER, CrusherRecipe.Type.INSTANCE, RecipeBookCategory.FURNACE, syncId, playerInventory);
    }

    public CrusherScreenHandler(int syncId, PlayerInventory playerInventory,
                                CrusherBlockEntity blockEntity, PropertyDelegate propertyDelegate) {
        super(ModScreenHandlers.CRUSHER_SCREEN_HANDLER, CrusherRecipe.Type.INSTANCE, RecipeBookCategory.FURNACE, syncId, playerInventory, blockEntity, propertyDelegate);
    }
}