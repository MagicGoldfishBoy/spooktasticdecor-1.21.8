package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.ZombieLog;

import net.minecraft.client.gui.components.Button;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BlockTypes;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
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
    }
}
