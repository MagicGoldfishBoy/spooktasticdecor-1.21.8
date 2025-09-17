package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class FurnitureBlockItemRegistry {
    
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANTER_ITEM;

    public static DeferredItem<BlockItem> ZOMBIE_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_TABLE_ITEM;


    public static DeferredItem<BlockItem> SKELETON_WOOD_PLANTER;

    public static DeferredItem<BlockItem> SKELETON_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> SKELETON_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> SKELETON_WOOD_PLANKS_TABLE_ITEM;

    public static DeferredItem<BlockItem> WITHER_SKELETON_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> WITHER_SKELETON_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> WITHER_SKELETON_WOOD_PLANKS_TABLE_ITEM;

    public static DeferredItem<BlockItem> GHAST_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> GHAST_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> GHAST_WOOD_PLANKS_TABLE_ITEM;

    public static DeferredItem<BlockItem> CREAKING_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> CREAKING_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> CREAKING_WOOD_PLANKS_TABLE_ITEM;

    public static DeferredItem<BlockItem> EYE_TABLE_ITEM;

    public static DeferredItem<BlockItem> SPIDER_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> SPIDER_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> SPIDER_WOOD_PLANKS_TABLE_ITEM;

    public static DeferredItem<BlockItem> ENDER_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> ENDER_STRIPPED_WOOD_TABLE_ITEM;
    public static DeferredItem<BlockItem> ENDER_WOOD_PLANKS_TABLE_ITEM;

    public static void registerAll() {

        registerZombieFurniture();
        registerSkeletonFurniture();
        registerWitherSkeletonFurniture();
        registerGhastFurniture();
        registerCreakingFurniture();
        registerEyeFurniture();
        registerSpiderFurniture();
        registerEnderFurniture();
    }
    public static void registerZombieFurniture() {
        ZOMBIE_WOOD_PLANTER_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ZOMBIE_WOOD_PLANTER,
            new Item.Properties()
        );
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
    public static void registerSkeletonFurniture() {
        SKELETON_WOOD_PLANTER = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SKELETON_WOOD_PLANTER,
            new Item.Properties()
        );
        SKELETON_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SKELETON_WOOD_TABLE,
            new Item.Properties()
        );
        SKELETON_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SKELETON_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        SKELETON_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SKELETON_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );

    }
    public static void registerWitherSkeletonFurniture() {
        WITHER_SKELETON_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.WITHER_SKELETON_WOOD_TABLE,
            new Item.Properties()
        );
        WITHER_SKELETON_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.WITHER_SKELETON_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        WITHER_SKELETON_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.WITHER_SKELETON_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );
    }
    public static void registerGhastFurniture() {
        GHAST_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.GHAST_WOOD_TABLE,
            new Item.Properties()
        );
        GHAST_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.GHAST_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        GHAST_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.GHAST_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );
    }
    public static void registerCreakingFurniture() {
        CREAKING_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.CREAKING_WOOD_TABLE,
            new Item.Properties()
        );
        CREAKING_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.CREAKING_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        CREAKING_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.CREAKING_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );
    }
    public static void registerEyeFurniture() {
        EYE_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.EYE_TABLE,
            new Item.Properties()
        );
    }
    public static void registerSpiderFurniture() {
        SPIDER_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SPIDER_WOOD_TABLE,
            new Item.Properties()
        );
        SPIDER_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SPIDER_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        SPIDER_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.SPIDER_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );
    }
    public static void registerEnderFurniture() {
        ENDER_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ENDER_WOOD_TABLE,
            new Item.Properties()
        );
        ENDER_STRIPPED_WOOD_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ENDER_STRIPPED_WOOD_TABLE,
            new Item.Properties()
        );
        ENDER_WOOD_PLANKS_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            FurnitureBlockRegistry.ENDER_WOOD_PLANKS_TABLE,
            new Item.Properties()
        );
    }
}
