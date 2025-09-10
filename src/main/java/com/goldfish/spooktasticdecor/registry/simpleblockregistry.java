package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;

public class simpleblockregistry {

    
    public static DeferredBlock<Block> ZOMBIE_LAMP;
    public static DeferredBlock<Block> SKELETON_LAMP;
    public static DeferredBlock<Block> WITHER_SKELETON_LAMP;
    public static DeferredBlock<Block> GHAST_LAMP;

    public static void registerAll() {

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
    }
}
