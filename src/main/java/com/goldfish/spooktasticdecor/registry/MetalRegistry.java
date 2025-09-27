package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class MetalRegistry {


    public static DeferredItem<Item> SOUL_BRONZE_ALLOY;
    public static DeferredItem<Item> SOUL_BRONZE_INGOT;
    public static DeferredItem<Item> SOUL_BRONZE_NUGGET;

    public static DeferredBlock<Block> SOUL_BRONZE_BLOCK;
    public static DeferredItem<BlockItem> SOUL_BRONZE_ITEM;

    public static DeferredBlock<Block> SOUL_BRONZE_BRICKS_BLOCK;
    public static DeferredItem<BlockItem> SOUL_BRONZE_BRICKS_ITEM;

    public static DeferredBlock<Block> SOUL_BRONZE_CHISELED_BLOCK;
    public static DeferredItem<BlockItem> SOUL_BRONZE_CHISELED_ITEM;


    public static DeferredBlock<SlabBlock> SOUL_BRONZE_SLAB;
    public static DeferredItem<BlockItem> SOUL_BRONZE_SLAB_ITEM;

    public static DeferredBlock<SlabBlock> SOUL_BRONZE_BRICKS_SLAB;
    public static DeferredItem<BlockItem> SOUL_BRONZE_BRICKS_SLAB_ITEM;


    public static DeferredBlock<StairBlock> SOUL_BRONZE_STAIRS;
    public static DeferredItem<BlockItem> SOUL_BRONZE_STAIRS_ITEM;

    public static DeferredBlock<StairBlock> SOUL_BRONZE_BRICKS_STAIRS;
    public static DeferredItem<BlockItem> SOUL_BRONZE_BRICKS_STAIRS_ITEM;


    public static DeferredBlock<ButtonBlock> SOUL_BRONZE_BUTTON;
    public static DeferredItem<BlockItem> SOUL_BRONZE_BUTTON_ITEM;

    public static DeferredBlock<WallBlock> SOUL_BRONZE_WALL;
    public static DeferredItem<BlockItem> SOUL_BRONZE_WALL_ITEM;

    public static DeferredBlock<FenceBlock> SOUL_BRONZE_FENCE;
    public static DeferredItem<BlockItem> SOUL_BRONZE_FENCE_ITEM;

    public static DeferredBlock<FenceGateBlock> SOUL_BRONZE_GATE;
    public static DeferredItem<BlockItem> SOUL_BRONZE_GATE_ITEM;

    public static DeferredBlock<PressurePlateBlock> SOUL_BRONZE_PRESSURE_PLATE;
    public static DeferredItem<BlockItem> SOUL_BRONZE_PRESSURE_PLATE_ITEM;

    public static DeferredBlock<IronBarsBlock> SOUL_BRONZE_BARS;
    public static DeferredBlock<Block> SOUL_BRONZE_BARS_BLOCK;
    public static DeferredItem<BlockItem> SOUL_BRONZE_BARS_ITEM;
    public static DeferredItem<BlockItem> SOUL_BRONZE_BARS_BLOCK_ITEM;

    public static DeferredBlock<DoorBlock> SOUL_BRONZE_DOOR;
    public static DeferredItem<BlockItem> SOUL_BRONZE_DOOR_ITEM;

    public static DeferredBlock<ChainBlock> SOUL_BRONZE_CHAIN;
    public static DeferredItem<BlockItem> SOUL_BRONZE_CHAIN_ITEM;

    public static DeferredBlock<LanternBlock> SOUL_BRONZE_LANTERN;
    public static DeferredItem<BlockItem> SOUL_BRONZE_LANTERN_ITEM;

    public static DeferredBlock<LanternBlock> SOUL_BRONZE_SOUL_LANTERN;
    public static DeferredItem<BlockItem> SOUL_BRONZE_SOUL_LANTERN_ITEM;

    public static DeferredBlock<Block> SOUL_BRONZE_LAMP_BLOCK;
    public static DeferredItem<BlockItem> SOUL_BRONZE_LAMP_ITEM;

    public static DeferredBlock<Block> SOUL_BRONZE_PLANTER;
    public static DeferredItem<BlockItem> SOUL_BRONZE_PLANTER_ITEM;

    public static DeferredBlock<Block> SOUL_BRONZE_TABLE;
    public static DeferredItem<BlockItem> SOUL_BRONZE_TABLE_ITEM;

    public static void registerAll() {
        registerSoulBronze();
    }

    private static Float SOUL_BRONZE_DESTROY_TIME = 3.25f;
    private static Float SOUL_BRONZE_EXPLOSION_RESISTANCE = 6.25f;

    public static void registerSoulBronze() {

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

        SOUL_BRONZE_BLOCK = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_block",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .sound(SoundType.COPPER)
                .instrument(NoteBlockInstrument.COW_BELL)
                .requiresCorrectToolForDrops()
            )
        );
        SOUL_BRONZE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BLOCK,
            new Item.Properties()
        );

        SOUL_BRONZE_BRICKS_BLOCK = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_bricks_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .sound(SoundType.COPPER)
                .instrument(NoteBlockInstrument.COW_BELL)
                .requiresCorrectToolForDrops()
            )
        );
        SOUL_BRONZE_BRICKS_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BRICKS_BLOCK,
            new Item.Properties()
        );

        SOUL_BRONZE_CHISELED_BLOCK = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_chiseled_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .sound(SoundType.COPPER)
                .instrument(NoteBlockInstrument.COW_BELL)
                .requiresCorrectToolForDrops()
            )
        );
        SOUL_BRONZE_CHISELED_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_CHISELED_BLOCK,
            new Item.Properties()
        );

        SOUL_BRONZE_SLAB = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .sound(SoundType.COPPER)
                .requiresCorrectToolForDrops()
            )
        );
        SOUL_BRONZE_SLAB_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_SLAB,
            new Item.Properties()
        );

        SOUL_BRONZE_BRICKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_bricks_slab", 
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .sound(SoundType.COPPER)
                .requiresCorrectToolForDrops()                
            )
        );
        SOUL_BRONZE_BRICKS_SLAB_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BRICKS_SLAB,
            new Item.Properties()
        );

        SOUL_BRONZE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_stairs",
            registryName -> new StairBlock(SOUL_BRONZE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
            )
        );
        SOUL_BRONZE_STAIRS_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_STAIRS,
            new Item.Properties()
        );

        SOUL_BRONZE_BRICKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_bricks_stairs", 
            registryName -> new StairBlock(SOUL_BRONZE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of() 
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
            )
        );
        SOUL_BRONZE_BRICKS_STAIRS_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BRICKS_STAIRS,
            new Item.Properties()
        );

        SOUL_BRONZE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_button",
            registryName -> new ButtonBlock(BlockSetType.COPPER, 25, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
            )
        );
        SOUL_BRONZE_BUTTON_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BUTTON,
            new Item.Properties()
        );

        SOUL_BRONZE_WALL = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
            )
        );
        SOUL_BRONZE_WALL_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_WALL,
            new Item.Properties()
        );

        SOUL_BRONZE_FENCE = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_fence", 
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
            )
        );
        SOUL_BRONZE_FENCE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_FENCE,
            new Item.Properties()
        );

        SOUL_BRONZE_GATE = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_gate", 
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
            )
        );
        SOUL_BRONZE_GATE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_GATE,
            new Item.Properties()
        );

        SOUL_BRONZE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_pressure_plate", 
            registryName -> new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .sound(SoundType.COPPER)
                .noCollission()
                .instabreak()
            )
        );
        SOUL_BRONZE_PRESSURE_PLATE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_PRESSURE_PLATE,
            new Item.Properties()
        );

        SOUL_BRONZE_BARS = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_bars", 
            registryName -> new IronBarsBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
                .noOcclusion()
            )
        );
        SOUL_BRONZE_BARS_BLOCK = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_bars_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
                .noOcclusion()
            )
        );
        SOUL_BRONZE_BARS_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BARS,
            new Item.Properties()
        );
        SOUL_BRONZE_BARS_BLOCK_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_BARS_BLOCK,
            new Item.Properties()
        );

        SOUL_BRONZE_DOOR = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_door", 
            registryName -> new DoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
                .noOcclusion()
            )
        );
        SOUL_BRONZE_DOOR_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_DOOR,
            new Item.Properties()
        );

        SOUL_BRONZE_CHAIN = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_chain", 
            registryName -> new ChainBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.CHAIN)
                .noOcclusion()
            )
        );
        SOUL_BRONZE_CHAIN_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_CHAIN,
            new Item.Properties()
        );

        SOUL_BRONZE_LANTERN = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_lantern", 
            registryName -> new LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.LANTERN)
                .noOcclusion()
                .lightLevel(state -> 15)
            )
        );
        SOUL_BRONZE_LANTERN_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_LANTERN,
            new Item.Properties()
        );

        SOUL_BRONZE_SOUL_LANTERN = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_soul_lantern", 
            registryName -> new LanternBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.LANTERN)
                .noOcclusion()
                .lightLevel(state -> 10)
            )
        );
        SOUL_BRONZE_SOUL_LANTERN_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_SOUL_LANTERN,
            new Item.Properties()
        );

        SOUL_BRONZE_LAMP_BLOCK = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_lamp_block", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER_BULB)
                .lightLevel(state -> 15)
            )
        );
        SOUL_BRONZE_LAMP_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_LAMP_BLOCK,
            new Item.Properties()
        );

        SOUL_BRONZE_PLANTER = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_planter", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
                .noOcclusion()
            )
        );
        SOUL_BRONZE_PLANTER_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_PLANTER,
            new Item.Properties()
        );

        SOUL_BRONZE_TABLE = SpooktasticDecor.BLOCKS.register(
            "soul_bronze_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(SOUL_BRONZE_DESTROY_TIME)
                .explosionResistance(SOUL_BRONZE_EXPLOSION_RESISTANCE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.COPPER)
                .noOcclusion()
            )
        );
        SOUL_BRONZE_TABLE_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            SOUL_BRONZE_TABLE,
            new Item.Properties()
        );
    }
    
}
