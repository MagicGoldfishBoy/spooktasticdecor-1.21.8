package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.entity.ChairEntity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EntityRegistry {

    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(SpooktasticDecor.MODID);
public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SpooktasticDecor.MODID);

    public static void init(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }            

    public static final Supplier<EntityType<ChairEntity>> CHAIR_ENTITY =
        ENTITY_TYPES.registerEntityType(
            "chair_entity",
            ChairEntity::new,
            MobCategory.MISC,
            builder -> builder
                .sized(0.8f, 0.8f)
                .clientTrackingRange(10)
                .updateInterval(10)
        );
}