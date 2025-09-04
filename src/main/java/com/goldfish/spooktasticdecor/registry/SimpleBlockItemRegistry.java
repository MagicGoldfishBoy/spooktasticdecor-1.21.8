package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class SimpleBlockItemRegistry {
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
    simpleblockregistry.MY_BETTER_BLOCK,
    new Item.Properties()
);
}
