package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class FurnitureBlockRegistry {

    public static DeferredBlock<Block> ZOMBIE_WOOD_TABLE;
    public static DeferredBlock<Block> ZOMBIE_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> ZOMBIE_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> SKELETON_WOOD_TABLE;
    public static DeferredBlock<Block> SKELETON_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> SKELETON_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> WITHER_SKELETON_WOOD_TABLE;
    public static DeferredBlock<Block> WITHER_SKELETON_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> WITHER_SKELETON_WOOD_PLANKS_TABLE;
    
    public static void registerAll() {
        registerZombieFurniture();
        registerSkeletonFurniture();
        registerWitherSkeletonFurniture();
    }
    public static void registerZombieFurniture() {
        ZOMBIE_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noOcclusion()
            )
        );
        ZOMBIE_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "zombie_stripped_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noOcclusion()
            )
        );
        ZOMBIE_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planks_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.WOOD)
                .ignitedByLava()
                .noOcclusion()
            )
        );
    }
    public static void registerSkeletonFurniture() {
        SKELETON_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            .ignitedByLava()
            .noOcclusion()
            )
        );
        SKELETON_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "skeleton_stripped_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            .ignitedByLava()
            .noOcclusion()
            )
        );
        SKELETON_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planks_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            .ignitedByLava()
            .noOcclusion()
            )
        );
    }
    public static void registerWitherSkeletonFurniture() {
        WITHER_SKELETON_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            .noOcclusion()
            )
        );
        WITHER_SKELETON_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_stripped_wood_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            .noOcclusion()
            )
        );
        WITHER_SKELETON_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "wither_skeleton_wood_planks_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.BONE_BLOCK)
            .noOcclusion()
            )
        );
    }
}
