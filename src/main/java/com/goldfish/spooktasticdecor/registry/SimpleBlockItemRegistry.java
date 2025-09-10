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

    public static void registerAll() {

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

    };


}
