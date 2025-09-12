package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class SimpleBlockItemRegistry {

    public static DeferredItem<BlockItem> ZOMBIE_LAMP_ITEM;
    public static DeferredItem<BlockItem> SKELETON_LAMP_ITEM;
    public static DeferredItem<BlockItem> WITHER_SKELETON_LAMP_ITEM;
    public static DeferredItem<BlockItem> GHAST_LAMP_ITEM;
    public static DeferredItem<BlockItem> CREAKING_LAMP_ITEM;
    public static DeferredItem<BlockItem> EYEBALL_LAMP_ITEM;
    public static DeferredItem<BlockItem> SPIDER_LAMP_ITEM;
    public static DeferredItem<BlockItem> ENDER_LAMP_ITEM;

    public static DeferredItem<BlockItem> ZOMBIE_LOG_ITEM;
    public static DeferredItem<BlockItem> STRIPPED_ZOMBIE_LOG_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_SLAB_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_STAIRS_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_BUTTON_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_FENCE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_FENCE_GATE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_TRAPDOOR_ITEM;
    public static DeferredItem<BlockItem> ZOMBIE_WOOD_PLANKS_DOOR_ITEM;

    public static void registerAll() {
        register_lamps();
        register_wood();
    }
    public static void register_lamps() {

        ZOMBIE_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_LAMP,
        new Item.Properties());

        SKELETON_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.SKELETON_LAMP,
        new Item.Properties());

        WITHER_SKELETON_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.WITHER_SKELETON_LAMP,
        new Item.Properties());

        GHAST_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.GHAST_LAMP,
        new Item.Properties());

        CREAKING_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.CREAKING_LAMP,
        new Item.Properties());

        EYEBALL_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.EYEBALL_LAMP,
        new Item.Properties());

        SPIDER_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.SPIDER_LAMP,
        new Item.Properties());

        ENDER_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ENDER_LAMP,
        new Item.Properties());    

    }
    public static void register_wood() {

        ZOMBIE_LOG_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_LOG,
        new Item.Properties());

        STRIPPED_ZOMBIE_LOG_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_LOG_STRIPPED,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_SLAB_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_SLAB,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_STAIRS_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_STAIRS,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_BUTTON_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_BUTTON,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_FENCE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_FENCE,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_FENCE_GATE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_FENCE_GATE,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_TRAPDOOR_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_TRAPDOOR,
        new Item.Properties());

        ZOMBIE_WOOD_PLANKS_DOOR_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
        simpleblockregistry.ZOMBIE_WOOD_PLANKS_DOOR,
        new Item.Properties());

    }

}
