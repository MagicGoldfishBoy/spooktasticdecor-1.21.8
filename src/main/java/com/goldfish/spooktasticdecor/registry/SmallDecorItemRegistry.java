package com.goldfish.spooktasticdecor.registry;

import java.util.function.Supplier;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.Doll;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class SmallDecorItemRegistry {

    public static Supplier<MapCodec<Doll>> SMALL_DECOR_ITEM_CODEC;

    public static DeferredBlock<Doll> PORCELAIN_PATTY_DOLL;
    public static DeferredItem<BlockItem> PORCELAIN_PATTY_DOLL_ITEM;

    public static DeferredBlock<Doll> PORCELAIN_POPPY_DOLL;
    public static DeferredItem<BlockItem> PORCELAIN_POPPY_DOLL_ITEM;

    public static DeferredBlock<Doll> PORCELAIN_PENELOPE_DOLL;
    public static DeferredItem<BlockItem> PORCELAIN_PENELOPE_DOLL_ITEM;

    public static void registerAll() {

        SMALL_DECOR_ITEM_CODEC = SpooktasticDecor.CODECS.register(
            "small_decor_codec",
                () -> BlockBehaviour.simpleCodec(Doll::new)
        );

        PORCELAIN_PATTY_DOLL = SpooktasticDecor.BLOCKS.register(
            "porcelain_patty_doll", 
                registryName -> new Doll(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, registryName))
                .noOcclusion()
                .destroyTime(0.5f)
                .explosionResistance(10.0f)
                .sound(SoundType.GLASS))
        );
        PORCELAIN_PATTY_DOLL_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            PORCELAIN_PATTY_DOLL,
            new Item.Properties()
        );

        PORCELAIN_POPPY_DOLL = SpooktasticDecor.BLOCKS.register(
            "porcelain_poppy_doll", 
            registryName -> new Doll(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .noOcclusion()
            .destroyTime(0.5f)
            .explosionResistance(10.0f)
            .sound(SoundType.GLASS)
            )
        );
        PORCELAIN_POPPY_DOLL_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            PORCELAIN_POPPY_DOLL,
            new Item.Properties()
        );

        PORCELAIN_PENELOPE_DOLL = SpooktasticDecor.BLOCKS.register(
            "porcelain_penelope_doll", 
            registryName -> new Doll(BlockBehaviour.Properties.of()
            .setId(ResourceKey.create(Registries.BLOCK, registryName))
            .noOcclusion()
            .destroyTime(0.5f)
            .explosionResistance(10.0f)
            .sound(SoundType.GLASS)
            )
        );
        PORCELAIN_PENELOPE_DOLL_ITEM = SpooktasticDecor.ITEMS.registerSimpleBlockItem(
            PORCELAIN_PENELOPE_DOLL,
            new Item.Properties()
        );
    }
    
}
