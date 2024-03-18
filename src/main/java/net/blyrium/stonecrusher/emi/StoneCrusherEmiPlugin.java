package net.blyrium.stonecrusher.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import net.blyrium.stonecrusher.block.ModBlocks;
import net.blyrium.stonecrusher.recipe.CrusherRecipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.Identifier;

public class StoneCrusherEmiPlugin implements EmiPlugin {
    public static final Identifier MY_SPRITE_SHEET = new Identifier("stonecrusher", "textures/gui/crusher_gui.png");
    public static final EmiStack MY_WORKSTATION = EmiStack.of(ModBlocks.CRUSHER);
    public static final EmiRecipeCategory MY_CATEGORY
            = new EmiRecipeCategory(new Identifier("stonecrusher", "crusher"), MY_WORKSTATION, new EmiTexture(MY_SPRITE_SHEET, 0, 0, 16, 16));

    @Override
    public void register(EmiRegistry registry) {
        // Tell EMI to add a tab for your category
        registry.addCategory(MY_CATEGORY);

        // Add all the workstations your category uses
        registry.addWorkstation(MY_CATEGORY, MY_WORKSTATION);

        RecipeManager manager = registry.getRecipeManager();

        // Use vanilla's concept of your recipes and pass them to your EmiRecipe representation
        for (CrusherRecipe recipe : manager.listAllOfType(CrusherRecipe.Type.INSTANCE)) {
            registry.addRecipe(new CrusherEmiRecipe(recipe));
        }
    }
}