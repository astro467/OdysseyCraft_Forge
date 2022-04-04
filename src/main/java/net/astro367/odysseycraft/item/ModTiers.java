package net.astro367.odysseycraft.item;

import net.astro367.odysseycraft.util.ModTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INCIDIUM = new ForgeTier(5, 7000, 16.0f, 5.0f, 32,
            ModTags.Blocks.NEEDS_INCIDIUM_TOOL, () -> Ingredient.of(ModItems.INCIDIUM_INGOT.get()));
}