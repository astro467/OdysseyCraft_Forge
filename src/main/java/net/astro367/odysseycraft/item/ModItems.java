package net.astro367.odysseycraft.item;

import net.astro367.odysseycraft.OdysseyCraft;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OdysseyCraft.MOD_ID);

    public static final RegistryObject<Item> CYAN_INCIDIUM_DUST = ITEMS.register("cyan_incidium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> LIME_INCIDIUM_DUST = ITEMS.register("lime_incidium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_INGOT = ITEMS.register("incidium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_SWORD = ITEMS.register("incidium_sword",
            () -> new SwordItem(ModTiers.INCIDIUM, 10, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_PICKAXE = ITEMS.register("incidium_pickaxe",
            () -> new PickaxeItem(ModTiers.INCIDIUM, 6, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_AXE = ITEMS.register("incidium_axe",
            () -> new AxeItem(ModTiers.INCIDIUM, 12, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_SHOVEL = ITEMS.register("incidium_shovel",
            () -> new ShovelItem(ModTiers.INCIDIUM, 4.5f, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static final RegistryObject<Item> INCIDIUM_HOE = ITEMS.register("incidium_hoe",
            () -> new HoeItem(ModTiers.INCIDIUM, 0, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.ODYSSEY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
