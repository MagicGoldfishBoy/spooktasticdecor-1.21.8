package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class FurnitureBlockItemRegistry {
    
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_TABLE_ITEM;

    public static void registerAll() {

        registerZombieFurniture();
    }
    public static void registerZombieFurniture() {
        ZOMBIE_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ZOMBIE_WOOD_TABLE,
            new Item.Properties()
        );
        ZOMBIE_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ZOMBIE_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        ZOMBIE_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ZOMBIE_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );

    }
}
