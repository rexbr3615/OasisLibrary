package net.rexbr.oasis.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class OasisTabs {
    public static final CreativeModeTab OASIS_LIB = new CreativeModeTab("oasis_lib") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(OasisItems.OASIS_CRYSTAL.get());
        }
    };
}
