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
    }
}