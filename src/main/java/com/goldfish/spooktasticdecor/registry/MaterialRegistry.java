package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class MaterialRegistry {

    public static DeferredItem<Item> PORCELAIN_CLAY;

    public static void registerAll() {
        PORCELAIN_CLAY = SpooktasticDecor.ITEMS.registerItem(
            "porcelain_clay",
            Item::new,
            new Item.Properties()
        );
    }
    
}
