package net.astro367.odysseycraft.util;

import net.astro367.odysseycraft.OdysseyCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_INCIDIUM_TOOL = tag("needs_incidium_tool");
        public static final TagKey<Block> END_ORE_REPLACEABLES = tag("end_ore_replaceables");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(OdysseyCraft.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        public static class Items {
        }
    }
}
