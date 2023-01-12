package net.rexbr.phantomcore.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.phantomcore.phantomcore;

public class PhantomcoreItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, phantomcore.MODID);

    // items



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
