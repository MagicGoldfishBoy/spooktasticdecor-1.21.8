package com.goldfish.spooktasticdecor.registry;

import java.rmi.registry.Registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.EnderLog;
import com.goldfish.spooktasticdecor.block.GhastLog;
import com.goldfish.spooktasticdecor.block.SkeletonLog;
import com.goldfish.spooktasticdecor.block.SpiderLog;
import com.goldfish.spooktasticdecor.block.WitherSkeletonLog;
import com.goldfish.spooktasticdecor.block.ZombieLog;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;

public class simpleblockregistry {

    public static DeferredBlock<Block> ZOMBIE_LAMP;
    public static DeferredBlock<Block> ZOMBIE_STONE_LAMP;

    public static DeferredBlock<Block> SKELETON_LAMP;
    public static DeferredBlock<Block> WITHER_SKELETON_LAMP;
    public static DeferredBlock<Block> GHAST_LAMP;
    public static DeferredBlock<Block> CREAKING_LAMP;
    public static DeferredBlock<Block> EYEBALL_LAMP;
    public static DeferredBlock<Block> SPIDER_LAMP;
    public static DeferredBlock<Block> ENDER_LAMP;


    public static DeferredBlock<ZombieLog> ZOMBIE_LOG;
    public static DeferredBlock<RotatedPillarBlock> ZOMBIE_LOG_STRIPPED;
    public static DeferredBlock<Block> ZOMBIE_WOOD_PLANKS;
    public static DeferredBlock<SlabBlock> ZOMBIE_WOOD_PLANKS_SLAB;
    public static DeferredBlock<StairBlock> ZOMBIE_WOOD_PLANKS_STAIRS;
    public static DeferredBlock<ButtonBlock> ZOMBIE_WOOD_PLANKS_BUTTON;
    public static DeferredBlock<FenceBlock> ZOMBIE_WOOD_PLANKS_FENCE;
    public static DeferredBlock<FenceGateBlock> ZOMBIE_WOOD_PLANKS_FENCE_GATE;
    public static DeferredBlock<PressurePlateBlock> ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE;
    public static DeferredBlock<TrapDoorBlock> ZOMBIE_WOOD_PLANKS_TRAPDOOR;
    public static DeferredBlock<DoorBlock> ZOMBIE_WOOD_PLANKS_DOOR;

    public static DeferredBlock<SkeletonLog> SKELETON_LOG;
    public static DeferredBlock<RotatedPillarBlock> SKELETON_LOG_STRIPPED;
    public static DeferredBlock<Block> SKELETON_WOOD_PLANKS;
    public static DeferredBlock<SlabBlock> SKELETON_WOOD_PLANKS_SLAB;
    public static DeferredBlock<StairBlock> SKELETON_WOOD_PLANKS_STAIRS;
    public static DeferredBlock<ButtonBlock> SKELETON_WOOD_PLANKS_BUTTON;
    public static DeferredBlock<FenceBlock> SKELETON_WOOD_PLANKS_FENCE;
    public static DeferredBlock<FenceGateBlock> SKELETON_WOOD_PLANKS_FENCE_GATE;
    public static DeferredBlock<PressurePlateBlock> SKELETON_WOOD_PLANKS_PRESSURE_PLATE;
    public static DeferredBlock<TrapDoorBlock> SKELETON_WOOD_PLANKS_TRAPDOOR;
    public static DeferredBlock<DoorBlock> SKELETON_WOOD_PLANKS_DOOR;

    public static DeferredBlock<WitherSkeletonLog> WITHER_SKELETON_LOG;
    public static DeferredBlock<RotatedPillarBlock> WITHER_SKELETON_LOG_STRIPPED;
    public static DeferredBlock<Block> WITHER_SKELETON_WOOD_PLANKS;
    public static DeferredBlock<SlabBlock> WITHER_SKELETON_WOOD_PLANKS_SLAB;
    public static DeferredBlock<StairBlock> WITHER_SKELETON_WOOD_PLANKS_STAIRS;
    public static DeferredBlock<ButtonBlock> WITHER_SKELETON_WOOD_PLANKS_BUTTON;
    public static DeferredBlock<FenceBlock> WITHER_SKELETON_WOOD_PLANKS_FENCE;
    public static DeferredBlock<FenceGateBlock> WITHER_SKELETON_WOOD_PLANKS_FENCE_GATE;
    public static DeferredBlock<PressurePlateBlock> WITHER_SKELETON_WOOD_PLANKS_PRESSURE_PLATE;
    public static DeferredBlock<TrapDoorBlock> WITHER_SKELETON_WOOD_PLANKS_TRAPDOOR;
    public static DeferredBlock<DoorBlock> WITHER_SKELETON_WOOD_PLANKS_DOOR;

    public static DeferredBlock<GhastLog> GHAST_LOG;
    public static DeferredBlock<RotatedPillarBlock> GHAST_LOG_STRIPPED;
    public static DeferredBlock<Block> GHAST_WOOD_PLANKS;
    public static DeferredBlock<SlabBlock> GHAST_WOOD_PLANKS_SLAB;
    public static DeferredBlock<StairBlock> GHAST_WOOD_PLANKS_STAIRS;
    public static DeferredBlock<ButtonBlock> GHAST_WOOD_PLANKS_BUTTON;
    public static DeferredBlock<FenceBlock> GHAST_WOOD_PLANKS_FENCE;
    public static DeferredBlock<FenceGateBlock> GHAST_WOOD_PLANKS_FENCE_GATE;
    public static DeferredBlock<PressurePlateBlock> GHAST_WOOD_PLANKS_PRESSURE_PLATE;
    public static DeferredBlock<TrapDoorBlock> GHAST_WOOD_PLANKS_TRAPDOOR;
    public static DeferredBlock<DoorBlock> GHAST_WOOD_PLANKS_DOOR;

    public static DeferredBlock<SpiderLog> SPIDER_LOG;
    public static DeferredBlock<RotatedPillarBlock> SPIDER_LOG_STRIPPED;
    public static DeferredBlock<Block> SPIDER_WOOD_PLANKS;
    public static DeferredBlock<SlabBlock> SPIDER_WOOD_PLANKS_SLAB;
    public static DeferredBlock<StairBlock> SPIDER_WOOD_PLANKS_STAIRS;
    public static DeferredBlock<ButtonBlock> SPIDER_WOOD_PLANKS_BUTTON;
    public static DeferredBlock<FenceBlock> SPIDER_WOOD_PLANKS_FENCE;
    public static DeferredBlock<FenceGateBlock> SPIDER_WOOD_PLANKS_FENCE_GATE;
    public static DeferredBlock<PressurePlateBlock> SPIDER_WOOD_PLANKS_PRESSURE_PLATE;
    public static DeferredBlock<TrapDoorBlock> SPIDER_WOOD_PLANKS_TRAPDOOR;
    public static DeferredBlock<DoorBlock> SPIDER_WOOD_PLANKS_DOOR;

    public static DeferredBlock<EnderLog> ENDER_LOG;
    public static DeferredBlock<RotatedPillarBlock> ENDER_LOG_STRIPPED;
    public static DeferredBlock<Block> ENDER_WOOD_PLANKS;
    public static DeferredBlock<SlabBlock> ENDER_WOOD_PLANKS_SLAB;
    public static DeferredBlock<StairBlock> ENDER_WOOD_PLANKS_STAIRS;
    public static DeferredBlock<ButtonBlock> ENDER_WOOD_PLANKS_BUTTON;
    public static DeferredBlock<FenceBlock> ENDER_WOOD_PLANKS_FENCE;
    public static DeferredBlock<FenceGateBlock> ENDER_WOOD_PLANKS_FENCE_GATE;
    public static DeferredBlock<PressurePlateBlock> ENDER_WOOD_PLANKS_PRESSURE_PLATE;
    public static DeferredBlock<TrapDoorBlock> ENDER_WOOD_PLANKS_TRAPDOOR;
    public static DeferredBlock<DoorBlock> ENDER_WOOD_PLANKS_DOOR;


    public static DeferredBlock<Block> ZOMBIE_COBBLESTONE;
    public static DeferredBlock<SlabBlock> ZOMBIE_COBBLESTONE_SLAB;
    public static DeferredBlock<StairBlock> ZOMBIE_COBBLESTONE_STAIRS;
    public static DeferredBlock<ButtonBlock> ZOMBIE_COBBLESTONE_BUTTON;
    public static DeferredBlock<WallBlock> ZOMBIE_COBBLESTONE_WALL;
    public static DeferredBlock<PressurePlateBlock> ZOMBIE_COBBLESTONE_PRESSURE_PLATE;

    public static DeferredBlock<Block> ZOMBIE_STONE;
    public static DeferredBlock<SlabBlock> ZOMBIE_STONE_SLAB;
    public static DeferredBlock<StairBlock> ZOMBIE_STONE_STAIRS;
    public static DeferredBlock<ButtonBlock> ZOMBIE_STONE_BUTTON;
    public static DeferredBlock<WallBlock> ZOMBIE_STONE_WALL;
    public static DeferredBlock<PressurePlateBlock> ZOMBIE_STONE_PRESSURE_PLATE;

    public static DeferredBlock<Block> ZOMBIE_SMOOTH_STONE;
    public static DeferredBlock<SlabBlock> ZOMBIE_SMOOTH_STONE_SLAB;
    public static DeferredBlock<StairBlock> ZOMBIE_SMOOTH_STONE_STAIRS;
    public static DeferredBlock<ButtonBlock> ZOMBIE_SMOOTH_STONE_BUTTON;
    public static DeferredBlock<WallBlock> ZOMBIE_SMOOTH_STONE_WALL;
    public static DeferredBlock<PressurePlateBlock> ZOMBIE_SMOOTH_STONE_PRESSURE_PLATE;

    public static DeferredBlock<Block> ZOMBIE_STONE_BRICKS;
    public static DeferredBlock<SlabBlock> ZOMBIE_STONE_BRICKS_SLAB;
    public static DeferredBlock<StairBlock> ZOMBIE_STONE_BRICKS_STAIRS;
    public static DeferredBlock<ButtonBlock> ZOMBIE_STONE_BRICKS_BUTTON;
    public static DeferredBlock<WallBlock> ZOMBIE_STONE_BRICKS_WALL;
    public static DeferredBlock<PressurePlateBlock> ZOMBIE_STONE_BRICKS_PRESSURE_PLATE;
    
    public static DeferredBlock<Block> ZOMBIE_CHISELED_STONE_BRICKS;


    public static DeferredBlock<Block> SKELETON_COBBLESTONE;
    public static DeferredBlock<SlabBlock> SKELETON_COBBLESTONE_SLAB;
    public static DeferredBlock<StairBlock> SKELETON_COBBLESTONE_STAIRS;
    public static DeferredBlock<ButtonBlock> SKELETON_COBBLESTONE_BUTTON;
    public static DeferredBlock<WallBlock> SKELETON_COBBLESTONE_WALL;
    public static DeferredBlock<PressurePlateBlock> SKELETON_COBBLESTONE_PRESSURE_PLATE;

    public static DeferredBlock<Block> SKELETON_STONE;
    public static DeferredBlock<SlabBlock> SKELETON_STONE_SLAB;
    public static DeferredBlock<StairBlock> SKELETON_STONE_STAIRS;
    public static DeferredBlock<ButtonBlock> SKELETON_STONE_BUTTON;
    public static DeferredBlock<WallBlock> SKELETON_STONE_WALL;
    public static DeferredBlock<PressurePlateBlock> SKELETON_STONE_PRESSURE_PLATE;

    public static DeferredBlock<Block> SKELETON_SMOOTH_STONE;
    public static DeferredBlock<SlabBlock> SKELETON_SMOOTH_STONE_SLAB;
    public static DeferredBlock<StairBlock> SKELETON_SMOOTH_STONE_STAIRS;
    public static DeferredBlock<ButtonBlock> SKELETON_SMOOTH_STONE_BUTTON;
    public static DeferredBlock<WallBlock> SKELETON_SMOOTH_STONE_WALL;
    public static DeferredBlock<PressurePlateBlock> SKELETON_SMOOTH_STONE_PRESSURE_PLATE;

    public static void registerAll() {
        register_lamps();
        register_wood();
        registerCobblestone();
        registerStone();
    }

    public static void register_lamps() {
        ZOMBIE_LAMP = SpooktasticDecor.BLOCKS.register(
            "zombie_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.MUD)
                .lightLevel(state -> 10)
            )
        );
        ZOMBIE_STONE_LAMP = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.MUD_BRICKS)
                .lightLevel(state -> 12)
            )
        );
        SKELETON_LAMP = SpooktasticDecor.BLOCKS.register(
            "skeleton_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .lightLevel(state -> 10)
            )
        );
        WITHER_SKELETON_LAMP = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(3.0f)
                .explosionResistance(15.0f)
                .sound(SoundType.BONE_BLOCK)
                .lightLevel(state -> 10)
            )
        );
        GHAST_LAMP = SpooktasticDecor.BLOCKS.register(
            "ghast_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(3.0f)
                .explosionResistance(15.0f)
                .sound(SoundType.NETHERRACK)
                .lightLevel(state -> 10)
            )
        );
        CREAKING_LAMP = SpooktasticDecor.BLOCKS.register(
            "creaking_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(3.0f)
                .explosionResistance(15.0f)
                .sound(SoundType.WOOD)
                .lightLevel(state -> 10)
            )
        );
        EYEBALL_LAMP = SpooktasticDecor.BLOCKS.register(
            "eyeball_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(3.0f)
                .explosionResistance(15.0f)
                .sound(SoundType.MUD)
                .lightLevel(state -> 10)
            )
        );
        SPIDER_LAMP = SpooktasticDecor.BLOCKS.register(
            "spider_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(3.0f)
                .explosionResistance(15.0f)
                .sound(SoundType.COBWEB)
                .lightLevel(state -> 10)
            )
        );
        ENDER_LAMP = SpooktasticDecor.BLOCKS.register(
            "ender_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(3.0f)
                .explosionResistance(15.0f)
                .sound(SoundType.GLASS)
                .lightLevel(state -> 10)
            )
        );    
    }

    public static void register_wood() {
        register_zombie_wood();
        registerSkeletonWood();
        registerWitherSkeletonWood();
        registerGhastWood();
        registerSpiderWood();
        registerEnderWood();
    }
    public static void register_zombie_wood() {
        ZOMBIE_LOG = SpooktasticDecor.BLOCKS.register(
            "zombie_log",
            registryName -> new ZombieLog(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_LOG_STRIPPED = SpooktasticDecor.BLOCKS.register(
            "zombie_log_stripped",
            registryName -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_stairs",
            registryName -> new StairBlock(ZOMBIE_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.WOOD)
            .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_button",
            registryName -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noCollission()
                .instabreak()
            )
        );
        ZOMBIE_WOOD_PLANKS_FENCE = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_fence",
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS_FENCE_GATE = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_fence_gate",
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noCollission()
                .instabreak()
            )
        );
        ZOMBIE_WOOD_PLANKS_TRAPDOOR = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_trapdoor",
            registryName -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
            )
        );
        ZOMBIE_WOOD_PLANKS_DOOR = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_door",
            registryName -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noOcclusion()
            )
        );       
    }
    public static void registerSkeletonWood() {
        SKELETON_LOG = SpooktasticDecor.BLOCKS.register(
            "skeleton_log",
            registryName -> new SkeletonLog(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_LOG_STRIPPED = SpooktasticDecor.BLOCKS.register(
            "skeleton_log_stripped",
            registryName -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_stairs",
            registryName -> new StairBlock(SKELETON_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_button",
            registryName -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .noCollission()
                .instabreak()
            )
        );
        SKELETON_WOOD_PLANKS_FENCE = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_fence",
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS_FENCE_GATE = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_fence_gate",
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .noCollission()
                .instabreak()
            )
        );
        SKELETON_WOOD_PLANKS_TRAPDOOR = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_trapdoor",
            registryName -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        SKELETON_WOOD_PLANKS_DOOR = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_door",
            registryName -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .noOcclusion()
            )
        );
    }
    public static void registerWitherSkeletonWood() {
        WITHER_SKELETON_LOG = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_log",
            registryName -> new WitherSkeletonLog(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_LOG_STRIPPED = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_log_stripped",
            registryName -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_stairs",
            registryName -> new StairBlock(WITHER_SKELETON_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_button",
            registryName -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .noCollission()
                .instabreak()
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_FENCE = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_fence",
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_FENCE_GATE = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_fence_gate",
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .noCollission()
                .instabreak()
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_TRAPDOOR = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_trapdoor",
            registryName -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_DOOR = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_door",
            registryName -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.BONE_BLOCK)
                .noOcclusion()
            )
        );

    }
    public static void registerGhastWood() {
        GHAST_LOG = SpooktasticDecor.BLOCKS.register(
            "ghast_log",
            registryName -> new GhastLog(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_LOG_STRIPPED = SpooktasticDecor.BLOCKS.register(
            "ghast_log_stripped",
            registryName -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_stairs",
            registryName -> new StairBlock(GHAST_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_button",
            registryName -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
                .noCollission()
                .instabreak()
            )
        );
        GHAST_WOOD_PLANKS_FENCE = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_fence",
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS_FENCE_GATE = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_fence_gate",
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
                .noCollission()
                .instabreak()
            )
        );
        GHAST_WOOD_PLANKS_TRAPDOOR = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_trapdoor",
            registryName -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
            )
        );
        GHAST_WOOD_PLANKS_DOOR = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_door",
            registryName -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.NETHER_WOOD)
                .noOcclusion()
            )
        );
    }
    public static void registerSpiderWood() {
        SPIDER_LOG = SpooktasticDecor.BLOCKS.register(
            "spider_log",
            registryName -> new SpiderLog(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_LOG_STRIPPED = SpooktasticDecor.BLOCKS.register(
            "spider_log_stripped",
            registryName -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_stairs",
            registryName -> new StairBlock(SPIDER_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_button",
            registryName -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
                .noCollission()
                .instabreak()
            )
        );
        SPIDER_WOOD_PLANKS_FENCE = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_fence",
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS_FENCE_GATE = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_fence_gate",
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
                .noCollission()
                .instabreak()
            )
        );
        SPIDER_WOOD_PLANKS_TRAPDOOR = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_trapdoor",
            registryName -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
            )
        );
        SPIDER_WOOD_PLANKS_DOOR = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_door",
            registryName -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.COBWEB)
                .noOcclusion()
            )
        );
    }
    public static void registerEnderWood() {
        ENDER_LOG = SpooktasticDecor.BLOCKS.register(
            "ender_log",
            registryName -> new EnderLog(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.WOOD)
            )
        );
        ENDER_LOG_STRIPPED = SpooktasticDecor.BLOCKS.register(
            "ender_log_stripped",
            registryName -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_stairs",
            registryName -> new StairBlock(
                ENDER_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_button",
            registryName -> new ButtonBlock(BlockSetType.WARPED, 20, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
                .noCollission()
                .instabreak()
            )
        );
        ENDER_WOOD_PLANKS_FENCE = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_fence",
            registryName -> new FenceBlock(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS_FENCE_GATE = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_fence_gate",
            registryName -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
                .noCollission()
                .instabreak()
            )
        );
        ENDER_WOOD_PLANKS_TRAPDOOR = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_trapdoor",
            registryName -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
            )
        );
        ENDER_WOOD_PLANKS_DOOR = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_door",
            registryName -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.STONE)
                .noOcclusion()
            )
        );
    }

    private static Float COBBLESTONE_DESTROY_TIME = 4.0f;
    private static Float COBBLESTONE_EXPLOSION_RESISTANCE = 30.0f;

    public static void registerCobblestone() {
        registerZombieCobblestone();
        registerSkeletonCobblestone();
    }
    public static void registerZombieCobblestone() {
        ZOMBIE_COBBLESTONE = SpooktasticDecor.BLOCKS.register(
            "zombie_cobblestone",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_COBBLESTONE_SLAB = SpooktasticDecor.BLOCKS.register(
            "zombie_cobblestone_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_COBBLESTONE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "zombie_cobblestone_stairs",
            registryName -> new StairBlock(ZOMBIE_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_COBBLESTONE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "zombie_cobblestone_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_COBBLESTONE_WALL = SpooktasticDecor.BLOCKS.register(
            "zombie_cobblestone_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_COBBLESTONE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "zombie_cobblestone_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
    }
    public static void registerSkeletonCobblestone() {
        SKELETON_COBBLESTONE = SpooktasticDecor.BLOCKS.register(
            "skeleton_cobblestone",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_COBBLESTONE_SLAB = SpooktasticDecor.BLOCKS.register(
            "skeleton_cobblestone_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_COBBLESTONE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "skeleton_cobblestone_stairs",
            registryName -> new StairBlock(SKELETON_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_COBBLESTONE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "skeleton_cobblestone_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_COBBLESTONE_WALL = SpooktasticDecor.BLOCKS.register(
            "skeleton_cobblestone_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_COBBLESTONE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "skeleton_cobblestone_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(COBBLESTONE_DESTROY_TIME)
            .explosionResistance(COBBLESTONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
    }

    private static Float STONE_DESTROY_TIME = 3.5f;
    private static Float STONE_EXPLOSION_RESISTANCE = COBBLESTONE_EXPLOSION_RESISTANCE;

    public static void registerStone() {
        registerZombieStone();
        registerSkeletonStone();
    }
    public static void registerZombieStone() {
        ZOMBIE_STONE = SpooktasticDecor.BLOCKS.register(
            "zombie_stone",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_SLAB = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_stairs",
            registryName -> new StairBlock(ZOMBIE_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_WALL = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );

        ZOMBIE_SMOOTH_STONE = SpooktasticDecor.BLOCKS.register(
            "zombie_smooth_stone",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_SMOOTH_STONE_SLAB = SpooktasticDecor.BLOCKS.register(
            "zombie_smooth_stone_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_SMOOTH_STONE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "zombie_smooth_stone_stairs",
            registryName -> new StairBlock(ZOMBIE_SMOOTH_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_SMOOTH_STONE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "zombie_smooth_stone_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_SMOOTH_STONE_WALL = SpooktasticDecor.BLOCKS.register(
            "zombie_smooth_stone_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_SMOOTH_STONE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "zombie_smooth_stone_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );

        ZOMBIE_STONE_BRICKS = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_bricks",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_BRICKS_SLAB = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_bricks_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_BRICKS_STAIRS = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_bricks_stairs",
            registryName -> new StairBlock(ZOMBIE_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_BRICKS_BUTTON = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_bricks_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_BRICKS_WALL = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_bricks_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_STONE_BRICKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "zombie_stone_bricks_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        ZOMBIE_CHISELED_STONE_BRICKS = SpooktasticDecor.BLOCKS.register(
            "zombie_chiseled_stone_bricks",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
    }
    public static void registerSkeletonStone() {
        SKELETON_STONE = SpooktasticDecor.BLOCKS.register(
            "skeleton_stone",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_STONE_SLAB = SpooktasticDecor.BLOCKS.register(
            "skeleton_stone_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_STONE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "skeleton_stone_stairs",
            registryName -> new StairBlock(SKELETON_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_STONE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "skeleton_stone_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_STONE_WALL = SpooktasticDecor.BLOCKS.register(
            "skeleton_stone_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_STONE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "skeleton_stone_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );

        SKELETON_SMOOTH_STONE = SpooktasticDecor.BLOCKS.register(
            "skeleton_smooth_stone",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_SMOOTH_STONE_SLAB = SpooktasticDecor.BLOCKS.register(
            "skeleton_smooth_stone_slab",
            registryName -> new SlabBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_SMOOTH_STONE_STAIRS = SpooktasticDecor.BLOCKS.register(
            "skeleton_smooth_stone_stairs",
            registryName -> new StairBlock(SKELETON_SMOOTH_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_SMOOTH_STONE_BUTTON = SpooktasticDecor.BLOCKS.register(
            "skeleton_smooth_stone_button",
            registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_SMOOTH_STONE_WALL = SpooktasticDecor.BLOCKS.register(
            "skeleton_smooth_stone_wall",
            registryName -> new WallBlock(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );
        SKELETON_SMOOTH_STONE_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
            "skeleton_smooth_stone_pressure_plate",
            registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(STONE_DESTROY_TIME)
            .explosionResistance(STONE_EXPLOSION_RESISTANCE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            )
        );

        // SKELETON_STONE_BRICKS = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_stone_bricks",
        //     registryName -> new Block(BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
        // SKELETON_STONE_BRICKS_SLAB = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_stone_bricks_slab",
        //     registryName -> new SlabBlock(BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
        // SKELETON_STONE_BRICKS_STAIRS = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_stone_bricks_stairs",
        //     registryName -> new StairBlock(SKELETON_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
        // SKELETON_STONE_BRICKS_BUTTON = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_stone_bricks_button",
        //     registryName -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
        // SKELETON_STONE_BRICKS_WALL = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_stone_bricks_wall",
        //     registryName -> new WallBlock(BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
        // SKELETON_STONE_BRICKS_PRESSURE_PLATE = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_stone_bricks_pressure_plate",
        //     registryName -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
        // SKELETON_CHISELED_STONE_BRICKS = SpooktasticDecor.BLOCKS.register(
        //     "skeleton_chiseled_stone_bricks",
        //     registryName -> new Block(BlockBehaviour.Properties.of()
        //     .setId(ResourceKey.create(Registries.BLOCK, registryName))
        //     .destroyTime(STONE_DESTROY_TIME)
        //     .explosionResistance(STONE_EXPLOSION_RESISTANCE)
        //     .requiresCorrectToolForDrops()
        //     .sound(SoundType.STONE)
        //     )
        // );
    }
}
