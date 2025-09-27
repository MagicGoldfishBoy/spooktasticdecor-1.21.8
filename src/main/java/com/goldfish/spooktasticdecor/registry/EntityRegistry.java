package com.goldfish.spooktasticdecor.registry;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.entity.ChairEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EntityRegistry {

    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(SpooktasticDecor.MODID);

    public static void init(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }            

public static final Supplier<EntityType<ChairEntity>> CHAIR_ENTITY =
    ENTITY_TYPES.registerEntityType(
        "chair_entity",
        ChairEntity::new,
        MobCategory.MISC,
        builder -> builder
            .sized(0.8f, 0.8f)  // Slightly larger
            .clientTrackingRange(10)
            .updateInterval(10)  // More frequent updates
            // Remove .noSummon() and .noSave() - these might interfere with riding
    );
}
// public class EntityRegistry {

//     // 1. Create a DeferredRegister for EntityType
//     public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, SpooktasticDecor.MODID);

//     // 2. Register the DeferredRegister to the event bus in your main mod class
//     public static void init(IEventBus bus) {
//         ENTITY_TYPES.register(bus);
//     }

//     // 3. Define and register your custom entity type
//     public static final DeferredHolder<EntityType<?>, EntityType<ChairEntity>> CHAIR_ENTITY =
//         ENTITY_TYPES.register(
//             "chair_entity",
//             () -> EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
//                 .sized(0.5f, 0.5f)
//                 .noSummon()
//                 .noSave()
//                 .build("chair_entity")
//         );
// }


    // public static Supplier<EntityType<ChairEntity>> CHAIR_ENTITY = SpooktasticDecor.ENTITIES.register("chair_entity",
    // () -> EntityType.Builder.of(foodChairEntity::new, MobCategory.MISC).sized(0.6F, 0.5F).clientTrackingRange(8).build("chair_entity"));