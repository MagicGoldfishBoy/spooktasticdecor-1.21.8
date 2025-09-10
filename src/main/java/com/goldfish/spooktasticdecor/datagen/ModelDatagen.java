package com.goldfish.spooktasticdecor.datagen;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;

public class ModelDatagen extends ModelProvider {

    public ModelDatagen(PackOutput output) {
        super(output, SpooktasticDecor.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_LAMP.get()); 

        itemModels.itemModelOutput.accept(
            SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get(),
            ItemModelUtils.plainModel(modLocation("block/zombie_lamp"))
        );
        itemModels.generateFlatItem(SpooktasticDecor.EXAMPLE_ITEM.get(), ModelTemplates.FLAT_ITEM);
    }
}