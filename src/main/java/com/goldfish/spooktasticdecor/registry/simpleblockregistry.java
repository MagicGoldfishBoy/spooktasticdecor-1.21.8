package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class simpleblockregistry {

    
    public static DeferredBlock<Block> ZOMBIE_LAMP;

    public static void registerAll() {
        ZOMBIE_LAMP = SpooktasticDecor.BLOCKS.register(
            "zombie_lamp",
            registryName -> new Block(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.GRAVEL)
                .lightLevel(state -> 7)
            )
        );
    }
}
