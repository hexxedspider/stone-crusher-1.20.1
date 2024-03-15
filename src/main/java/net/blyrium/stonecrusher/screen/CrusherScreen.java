package net.blyrium.stonecrusher.screen;

import net.blyrium.stonecrusher.StoneCrusher;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CrusherScreen extends AbstractFurnaceScreen<CrusherScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(StoneCrusher.MOD_ID, "textures/gui/crusher_gui.png");
    /*private static final Identifier LIT_PROGRESS_TEXTURE = new Identifier("container/furnace/lit_progress");
    private static final Identifier BURN_PROGRESS_TEXTURE = new Identifier("container/furnace/burn_progress");*/

    public CrusherScreen(CrusherScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, new CrusherRecipeBookComponent(), inventory, title, TEXTURE);
    }
}