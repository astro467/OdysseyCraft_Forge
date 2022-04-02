package net.astro367.odysseycraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ODYSSEY_TAB = new CreativeModeTab("odyssey_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BOULDER_OPAL.get());
        }
    };
}
