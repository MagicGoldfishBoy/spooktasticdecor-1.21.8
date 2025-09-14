package com.goldfish.spooktasticdecor.datagen;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.data.PackOutput;

public class ModelDatagen extends ModelProvider {

    public ModelDatagen(PackOutput output) {
        super(output, SpooktasticDecor.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        registerBlockModels(blockModels, itemModels);

        registerItemModels(blockModels, itemModels);

    }

    protected void registerBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_LAMP.get()); 

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.CREAKING_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.EYEBALL_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_LAMP.get());


        blockModels.woodProvider(simpleblockregistry.ZOMBIE_LOG.get()).log(simpleblockregistry.ZOMBIE_LOG.get());

        blockModels.woodProvider(simpleblockregistry.ZOMBIE_LOG_STRIPPED.get()).log(simpleblockregistry.ZOMBIE_LOG_STRIPPED.get());

        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_WOOD_PLANKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ZOMBIE_WOOD_PLANKS.get())
                   .slab(simpleblockregistry.ZOMBIE_WOOD_PLANKS_SLAB.get())
                   .stairs(simpleblockregistry.ZOMBIE_WOOD_PLANKS_STAIRS.get())
                   .button(simpleblockregistry.ZOMBIE_WOOD_PLANKS_BUTTON.get())
                   .fence(simpleblockregistry.ZOMBIE_WOOD_PLANKS_FENCE.get())
                   .fenceGate(simpleblockregistry.ZOMBIE_WOOD_PLANKS_FENCE_GATE.get())
                   .pressurePlate(simpleblockregistry.ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE.get())
                   .trapdoor(simpleblockregistry.ZOMBIE_WOOD_PLANKS_TRAPDOOR.get());

        blockModels.createDoor(simpleblockregistry.ZOMBIE_WOOD_PLANKS_DOOR.get());


        blockModels.woodProvider(simpleblockregistry.SKELETON_LOG.get()).log(simpleblockregistry.SKELETON_LOG.get());

        blockModels.woodProvider(simpleblockregistry.SKELETON_LOG_STRIPPED.get()).log(simpleblockregistry.SKELETON_LOG_STRIPPED.get());

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_WOOD_PLANKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SKELETON_WOOD_PLANKS.get())
                   .slab(simpleblockregistry.SKELETON_WOOD_PLANKS_SLAB.get())
                   .stairs(simpleblockregistry.SKELETON_WOOD_PLANKS_STAIRS.get())
                   .button(simpleblockregistry.SKELETON_WOOD_PLANKS_BUTTON.get())
                   .fence(simpleblockregistry.SKELETON_WOOD_PLANKS_FENCE.get())
                   .fenceGate(simpleblockregistry.SKELETON_WOOD_PLANKS_FENCE_GATE.get())
                   .pressurePlate(simpleblockregistry.SKELETON_WOOD_PLANKS_PRESSURE_PLATE.get())
                   .trapdoor(simpleblockregistry.SKELETON_WOOD_PLANKS_TRAPDOOR.get());

        blockModels.createDoor(simpleblockregistry.SKELETON_WOOD_PLANKS_DOOR.get());


        blockModels.woodProvider(simpleblockregistry.WITHER_SKELETON_LOG.get()).log(simpleblockregistry.WITHER_SKELETON_LOG.get());

        blockModels.woodProvider(simpleblockregistry.WITHER_SKELETON_LOG_STRIPPED.get()).log(simpleblockregistry.WITHER_SKELETON_LOG_STRIPPED.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS.get())
                   .slab(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_SLAB.get())
                   .stairs(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_STAIRS.get())
                   .button(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_BUTTON.get())
                   .fence(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_FENCE.get())
                   .fenceGate(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_FENCE_GATE.get())
                   .pressurePlate(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_PRESSURE_PLATE.get())
                   .trapdoor(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_TRAPDOOR.get());

        blockModels.createDoor(simpleblockregistry.WITHER_SKELETON_WOOD_PLANKS_DOOR.get());

    }

    protected void registerItemModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/zombie_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.SKELETON_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/skeleton_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.WITHER_SKELETON_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/wither_skeleton_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.GHAST_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/ghast_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.CREAKING_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/creaking_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.EYEBALL_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/eyeball_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.SPIDER_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/spider_lamp"))
        );
        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.ENDER_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/ender_lamp"))
        );

    }
}