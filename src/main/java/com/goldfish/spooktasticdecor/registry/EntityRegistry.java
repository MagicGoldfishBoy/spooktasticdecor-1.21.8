package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.entity.ChairEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EntityRegistry {

    public static final DeferredRegister.Entities ENTITY_TYPES =
            DeferredRegister.createEntities(SpooktasticDecor.MODID);

    public static final Supplier<EntityType<ChairEntity>> CHAIR_ENTITY =
        ENTITY_TYPES.registerEntityType(
            "chair_entity",
            ChairEntity::new,
            MobCategory.MISC,
            builder -> builder
                .sized(0.001f, 0.001f) // basically invisible hitbox
                .clientTrackingRange(5)
                .updateInterval(20)
                .noSummon()
                .noSave()
        );

    public static void init(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}


    // public static Supplier<EntityType<ChairEntity>> CHAIR_ENTITY = SpooktasticDecor.ENTITIES.register("chair_entity",
    // () -> EntityType.Builder.of(foodChairEntity::new, MobCategory.MISC).sized(0.6F, 0.5F).clientTrackingRange(8).build("chair_entity"));