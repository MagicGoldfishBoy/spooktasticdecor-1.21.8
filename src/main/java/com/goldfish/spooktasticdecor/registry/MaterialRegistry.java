package com.goldfish.spooktasticdecor.registry;

import java.rmi.registry.Registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class MaterialRegistry {

    public static DeferredItem<Item> PORCELAIN_CLAY;
    public static DeferredItem<Item> PORCELAIN_BRICK;

    public static DeferredBlock<Block> PORCELAIN_BLOCK;
    public static DeferredItem<BlockItem> PORCELAIN_BLOCK_ITEM;

    public static DeferredBlock<Block> GLAZED_PORCELAIN_BLOCK;
    public static DeferredItem<BlockItem> GLAZED_PORCELAIN_BLOCK_ITEM;

    public static DeferredItem<Item> SOUL_BRONZE_ALLOY;
    public static DeferredItem<Item> SOUL_BRONZE_INGOT;
    public static DeferredItem<Item> SOUL_BRONZE_NUGGET;

    public static void registerAll() {
        PORCELAIN_CLAY = SpooktasticDecor.ITEMS.registerItem(
            "porcelain_clay",
            Item::new,
            new Item.Properties()
            .fireResistant()
        );
        PORCELAIN_BRICK = SpooktasticDecor.ITEMS.registerItem(
            "porcelain_brick",
            Item::new,
            new Item.Properties()
            .fireResistant()
        );
        PORCELAIN_BLOCK = SpooktasticDecor.BLOCKS.register(
        "porcelain_block",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(1.5f)
                .explosionResistance(5.0f)
                .sound(SoundType.GLASS)
                .instrument(NoteBlockInstrument.CHIME)
            )
        );  
        PORCELAIN_BLOCK_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            MaterialRegistry.PORCELAIN_BLOCK,
            new Item.Properties()
            .fireResistant()
        );
        GLAZED_PORCELAIN_BLOCK = SpooktasticDecor.BLOCKS.register(
            "glazed_porcelain_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(1.0f)
                .explosionResistance(4.5f)
                .sound(SoundType.GLASS)
                .instrument(NoteBlockInstrument.BELL)
            )
        );
        GLAZED_PORCELAIN_BLOCK_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            MaterialRegistry.GLAZED_PORCELAIN_BLOCK,
            new Item.Properties()
            .fireResistant()
        );

        SOUL_BRONZE_ALLOY = SpooktasticDecor.ITEMS.registerItem(
            "soul_bronze_alloy", 
            Item::new,
            new Item.Properties()
        );
        SOUL_BRONZE_INGOT = SpooktasticDecor.ITEMS.registerItem(
            "soul_bronze_ingot", 
            Item::new,
            new Item.Properties()
        );
        SOUL_BRONZE_NUGGET = SpooktasticDecor.ITEMS.registerItem(
            "soul_bronze_nugget", 
            Item::new,
            new Item.Properties()
        );
    }
    
}
