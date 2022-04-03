package net.astro367.odysseycraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INCIDIUM = new ForgeTier(5, 7000, 16.0f, 5.0f, 32,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.INCIDIUM_INGOT.get()));
}