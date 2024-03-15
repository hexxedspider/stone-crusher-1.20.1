package net.blyrium.stonecrusher.recipe;

import net.blyrium.stonecrusher.StoneCrusher;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void RegisterRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(StoneCrusher.MOD_ID, "stone_crusher"),
                CrusherRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(StoneCrusher.MOD_ID, "stone_crusher"),
                CrusherRecipe.Type.INSTANCE);
    }
}
