package net.blyrium.stonecrusher.emi;

import dev.emi.emi.api.recipe.BasicEmiRecipe;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.blyrium.stonecrusher.recipe.CrusherRecipe;

public class CrusherEmiRecipe extends BasicEmiRecipe {

    public CrusherEmiRecipe(CrusherRecipe recipe) {
        super(StoneCrusherEmiPlugin.MY_CATEGORY, recipe.getId(), 70, 18);
        this.inputs.add(EmiIngredient.of(recipe.getIngredients().get(0)));
        this.outputs.add(EmiStack.of(recipe.getOutput(null)));
    }

    @Override
    public void addWidgets(WidgetHolder widgets) {
        // Add an arrow texture to indicate processing
        widgets.addTexture(EmiTexture.EMPTY_ARROW, 23, 1);

        // Adds an input slot on the left
        widgets.addSlot(inputs.get(0), 0, 0);

        // Adds an output slot on the right
        widgets.addSlot(outputs.get(0), 52, 0).recipeContext(this);
    }
}