package com.goldfish.spooktasticdecor.datagen;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;

public class ModelDatagen extends ModelProvider {

    public ModelDatagen(PackOutput output) {
        super(output, SpooktasticDecor.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        Block block = simpleblockregistry.ZOMBIE_LAMP.get();
        blockModels.createTrivialCube(block);
        blockModels.createTrivialCube(SpooktasticDecor.EXAMPLE_BLOCK.get()); 

        itemModels.generateFlatItem(SpooktasticDecor.ZOMBIE_LAMP_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SpooktasticDecor.EXAMPLE_ITEM.get(), ModelTemplates.FLAT_ITEM);
    }
}