package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.GhastLog;
import com.goldfish.spooktasticdecor.block.SkeletonLog;
import com.goldfish.spooktasticdecor.block.WitherSkeletonLog;
import com.goldfish.spooktasticdecor.block.ZombieLog;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.monster.WitherSkeleton;
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
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;

public class simpleblockregistry {

    public static DeferredBlock<Block> ZOMBIE_LAMP;
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

    public static void registerAll() {
        register_lamps();
        register_wood();
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
}
