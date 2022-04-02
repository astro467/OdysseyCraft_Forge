package net.astro367.odysseycraft.item;

import net.astro367.odysseycraft.OdysseyCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OdysseyCraft.MOD_ID);

    public static final RegistryObject<Item> BOULDER_OPAL = ITEMS.register("boulder_opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
