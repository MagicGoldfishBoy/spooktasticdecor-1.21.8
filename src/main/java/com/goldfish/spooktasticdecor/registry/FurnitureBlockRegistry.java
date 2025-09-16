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
    
    public static void registerAll() {
        registerZombieFurniture();
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
    }
}
