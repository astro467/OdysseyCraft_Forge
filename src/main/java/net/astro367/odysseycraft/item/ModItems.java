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

    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("fire_opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> ETERNAL_CRYSTAL = ITEMS.register("eternal_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> CYAN_INCIDIUM_DUST = ITEMS.register("cyan_incidium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> LIME_INCIDIUM_DUST = ITEMS.register("lime_incidium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> CORRUPT_ESSENCE = ITEMS.register("corrupt_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_INGOT = ITEMS.register("incidium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
