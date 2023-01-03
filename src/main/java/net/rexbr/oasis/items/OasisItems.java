package net.rexbr.oasis.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.oasis.oasis;

public class OasisItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, oasis.MODID);

    // items
    public static final RegistryObject<Item> OASIS_CRYSTAL = ITEMS.register("oasis_crystal",
            () -> new Item(new Item.Properties().tab(OasisTabs.OASIS_LIB)));

    public static final RegistryObject<Item> FLUORINE = ITEMS.register("fluorine",
            () -> new Item(new Item.Properties().tab(OasisTabs.OASIS_LIB)));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(OasisTabs.OASIS_LIB)));

    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear",
            () -> new Item(new Item.Properties().tab(OasisTabs.OASIS_LIB)));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties().tab(OasisTabs.OASIS_LIB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
