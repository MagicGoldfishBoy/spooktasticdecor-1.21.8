package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class FurnitureBlockRegistry {

    public static DeferredBlock<Block> ZOMBIE_WOOD_PLANTER;
    public static DeferredBlock<Block> ZOMBIE_WOOD_TABLE;
    public static DeferredBlock<Block> ZOMBIE_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> ZOMBIE_WOOD_PLANKS_TABLE;


    public static DeferredBlock<Block> SKELETON_WOOD_PLANTER;
    public static DeferredBlock<Block> SKELETON_WOOD_TABLE;
    public static DeferredBlock<Block> SKELETON_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> SKELETON_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> WITHER_SKELETON_WOOD_TABLE;
    public static DeferredBlock<Block> WITHER_SKELETON_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> WITHER_SKELETON_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> GHAST_WOOD_TABLE;
    public static DeferredBlock<Block> GHAST_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> GHAST_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> CREAKING_WOOD_TABLE;
    public static DeferredBlock<Block> CREAKING_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> CREAKING_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> EYE_TABLE;

    public static DeferredBlock<Block> SPIDER_WOOD_TABLE;
    public static DeferredBlock<Block> SPIDER_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> SPIDER_WOOD_PLANKS_TABLE;

    public static DeferredBlock<Block> ENDER_WOOD_TABLE;
    public static DeferredBlock<Block> ENDER_STRIPPED_WOOD_TABLE;
    public static DeferredBlock<Block> ENDER_WOOD_PLANKS_TABLE;
    
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
        ZOMBIE_WOOD_PLANTER = SpooktasticDecor.BLOCKS.register(
            "zombie_wood_planter",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(1.5f)
            .explosionResistance(9.0f)
            .sound(SoundType.WOOD)
            .ignitedByLava()
            .noOcclusion()
            )
        );
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
        SKELETON_WOOD_PLANTER = SpooktasticDecor.BLOCKS.register(
            "skeleton_wood_planter",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(1.5f)
            .explosionResistance(9.0f)
            .sound(SoundType.WOOD)
            .ignitedByLava()
            .noOcclusion()
            )
        );
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
    public static void registerGhastFurniture() {
        GHAST_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.NETHER_WOOD)
            .noOcclusion()
            )
        );
        GHAST_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "ghast_stripped_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.NETHER_WOOD)
            .noOcclusion()
            )
        );
        GHAST_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "ghast_wood_planks_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.NETHER_WOOD)
            .noOcclusion()
            )
        );
    }
    public static void registerCreakingFurniture() {
        CREAKING_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "creaking_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.WOOD)
            .noOcclusion()
            )
        );
        CREAKING_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "creaking_stripped_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.WOOD)
            .noOcclusion()
            )
        );
        CREAKING_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "creaking_wood_planks_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.WOOD)
            .noOcclusion()
            )
        );
    }
    public static void registerEyeFurniture() {
        EYE_TABLE = SpooktasticDecor.BLOCKS.register(
            "eye_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.MUD)
            .noOcclusion()
            )
        );
    }
    public static void registerSpiderFurniture() {
        SPIDER_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "spider_wood_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.COBWEB)
            .noOcclusion()
            )
        );
        SPIDER_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "spider_stripped_wood_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.COBWEB)
            .noOcclusion()
            )
        );
        SPIDER_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "spider_wood_planks_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.COBWEB)
            .noOcclusion()
            )
        );
    }
    public static void registerEnderFurniture() {
        ENDER_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "ender_wood_table",
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.STONE)
            .noOcclusion()
            )
        );
        ENDER_STRIPPED_WOOD_TABLE = SpooktasticDecor.BLOCKS.register(
            "ender_stripped_wood_table", 
            registryName -> new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.STONE)
            .noOcclusion()
            )
        );
        ENDER_WOOD_PLANKS_TABLE = SpooktasticDecor.BLOCKS.register(
            "ender_wood_planks_table",
            registryName ->  new Block(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .destroyTime(2.0f)
            .explosionResistance(10.0f)
            .sound(SoundType.STONE)
            .noOcclusion()
            )
        );
    }
}
