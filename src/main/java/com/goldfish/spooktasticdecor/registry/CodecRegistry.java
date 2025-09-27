package com.goldfish.spooktasticdecor.registry;

import java.util.function.Supplier;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.Chair;
import com.goldfish.spooktasticdecor.block.Path;
import com.goldfish.spooktasticdecor.block.Skull;
import com.goldfish.spooktasticdecor.block.TallStatue;
import com.mojang.serialization.MapCodec;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class CodecRegistry {

    public static Supplier<MapCodec<Path>> PATH_CODEC;

    public static Supplier<MapCodec<Skull>> SKULL_CODEC;

    public static Supplier<MapCodec<TallStatue>> TALL_STATUE_CODEC;

    public static Supplier<MapCodec<Chair>> CHAIR_CODEC;

    public static void registerAll() {
       PATH_CODEC = SpooktasticDecor.CODECS.register(
            "path_codec",
                () -> BlockBehaviour.simpleCodec(Path::new)
        );
        SKULL_CODEC = SpooktasticDecor.CODECS.register(
            "skull_codec", 
                () -> BlockBehaviour.simpleCodec(Skull::new)
        );
        TALL_STATUE_CODEC = SpooktasticDecor.CODECS.register(
            "tall_statue_codec", 
                () -> BlockBehaviour.simpleCodec(TallStatue::new)
        );
        CHAIR_CODEC = SpooktasticDecor.CODECS.register(
            "chair_codec", 
                () -> BlockBehaviour.simpleCodec(Chair::new)
        );
    }   
}
