package com.goldfish.spooktasticdecor.datagen;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModelDatagen extends ModelProvider {

    public ModelDatagen(PackOutput output) {
        super(output, SpooktasticDecor.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        registerBlockModels(blockModels, itemModels);

        registerItemModels(blockModels, itemModels);

        registerTableModels(blockModels, itemModels);

        registerPlanterModels(blockModels, itemModels);

    }

    protected void registerBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_LAMP.get()); 
        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_STONE_LAMP.get()); 

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.SKELETON_STONE_LAMP.get());

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


        blockModels.woodProvider(simpleblockregistry.GHAST_LOG.get()).log(simpleblockregistry.GHAST_LOG.get());

        blockModels.woodProvider(simpleblockregistry.GHAST_LOG_STRIPPED.get()).log(simpleblockregistry.GHAST_LOG_STRIPPED.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_WOOD_PLANKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.GHAST_WOOD_PLANKS.get())
                   .slab(simpleblockregistry.GHAST_WOOD_PLANKS_SLAB.get())
                   .stairs(simpleblockregistry.GHAST_WOOD_PLANKS_STAIRS.get())
                   .button(simpleblockregistry.GHAST_WOOD_PLANKS_BUTTON.get())
                   .fence(simpleblockregistry.GHAST_WOOD_PLANKS_FENCE.get())
                   .fenceGate(simpleblockregistry.GHAST_WOOD_PLANKS_FENCE_GATE.get())
                   .pressurePlate(simpleblockregistry.GHAST_WOOD_PLANKS_PRESSURE_PLATE.get())
                   .trapdoor(simpleblockregistry.GHAST_WOOD_PLANKS_TRAPDOOR.get());

        blockModels.createDoor(simpleblockregistry.GHAST_WOOD_PLANKS_DOOR.get());


        blockModels.woodProvider(simpleblockregistry.SPIDER_LOG.get()).log(simpleblockregistry.SPIDER_LOG.get());

        blockModels.woodProvider(simpleblockregistry.SPIDER_LOG_STRIPPED.get()).log(simpleblockregistry.SPIDER_LOG_STRIPPED.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_WOOD_PLANKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SPIDER_WOOD_PLANKS.get())
                   .slab(simpleblockregistry.SPIDER_WOOD_PLANKS_SLAB.get())
                   .stairs(simpleblockregistry.SPIDER_WOOD_PLANKS_STAIRS.get())
                   .button(simpleblockregistry.SPIDER_WOOD_PLANKS_BUTTON.get())
                   .fence(simpleblockregistry.SPIDER_WOOD_PLANKS_FENCE.get())
                   .fenceGate(simpleblockregistry.SPIDER_WOOD_PLANKS_FENCE_GATE.get())
                   .pressurePlate(simpleblockregistry.SPIDER_WOOD_PLANKS_PRESSURE_PLATE.get())
                   .trapdoor(simpleblockregistry.SPIDER_WOOD_PLANKS_TRAPDOOR.get());

        blockModels.createDoor(simpleblockregistry.SPIDER_WOOD_PLANKS_DOOR.get());


        blockModels.woodProvider(simpleblockregistry.ENDER_LOG.get()).log(simpleblockregistry.ENDER_LOG.get());

        blockModels.woodProvider(simpleblockregistry.ENDER_LOG_STRIPPED.get()).log(simpleblockregistry.ENDER_LOG_STRIPPED.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_WOOD_PLANKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ENDER_WOOD_PLANKS.get())
                   .slab(simpleblockregistry.ENDER_WOOD_PLANKS_SLAB.get())
                   .stairs(simpleblockregistry.ENDER_WOOD_PLANKS_STAIRS.get())
                   .button(simpleblockregistry.ENDER_WOOD_PLANKS_BUTTON.get())
                   .fence(simpleblockregistry.ENDER_WOOD_PLANKS_FENCE.get())
                   .fenceGate(simpleblockregistry.ENDER_WOOD_PLANKS_FENCE_GATE.get())
                   .pressurePlate(simpleblockregistry.ENDER_WOOD_PLANKS_PRESSURE_PLATE.get())
                   .trapdoor(simpleblockregistry.ENDER_WOOD_PLANKS_TRAPDOOR.get());

        blockModels.createDoor(simpleblockregistry.ENDER_WOOD_PLANKS_DOOR.get());


        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ZOMBIE_COBBLESTONE.get())
                   .slab(simpleblockregistry.ZOMBIE_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.ZOMBIE_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.ZOMBIE_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.ZOMBIE_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.ZOMBIE_COBBLESTONE_PRESSURE_PLATE.get());


        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ZOMBIE_STONE.get())
                    .slab(simpleblockregistry.ZOMBIE_STONE_SLAB.get())
                    .stairs(simpleblockregistry.ZOMBIE_STONE_STAIRS.get())
                    .button(simpleblockregistry.ZOMBIE_STONE_BUTTON.get())
                    .wall(simpleblockregistry.ZOMBIE_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.ZOMBIE_STONE_PRESSURE_PLATE.get());

                    
        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ZOMBIE_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.ZOMBIE_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.ZOMBIE_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.ZOMBIE_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.ZOMBIE_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.ZOMBIE_SMOOTH_STONE_PRESSURE_PLATE.get());


        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ZOMBIE_STONE_BRICKS.get())
                    .slab(simpleblockregistry.ZOMBIE_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.ZOMBIE_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.ZOMBIE_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.ZOMBIE_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.ZOMBIE_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_CHISELED_STONE_BRICKS.get());


        blockModels.createTrivialCube(simpleblockregistry.SKELETON_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SKELETON_COBBLESTONE.get())
                   .slab(simpleblockregistry.SKELETON_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.SKELETON_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.SKELETON_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.SKELETON_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.SKELETON_COBBLESTONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SKELETON_STONE.get())
                    .slab(simpleblockregistry.SKELETON_STONE_SLAB.get())
                    .stairs(simpleblockregistry.SKELETON_STONE_STAIRS.get())
                    .button(simpleblockregistry.SKELETON_STONE_BUTTON.get())
                    .wall(simpleblockregistry.SKELETON_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.SKELETON_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SKELETON_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.SKELETON_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.SKELETON_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.SKELETON_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.SKELETON_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.SKELETON_SMOOTH_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SKELETON_STONE_BRICKS.get())
                    .slab(simpleblockregistry.SKELETON_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.SKELETON_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.SKELETON_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.SKELETON_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.SKELETON_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_CHISELED_STONE_BRICKS.get());


        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.WITHER_SKELETON_COBBLESTONE.get())
                   .slab(simpleblockregistry.WITHER_SKELETON_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.WITHER_SKELETON_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.WITHER_SKELETON_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.WITHER_SKELETON_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.WITHER_SKELETON_COBBLESTONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.WITHER_SKELETON_STONE.get())
                    .slab(simpleblockregistry.WITHER_SKELETON_STONE_SLAB.get())
                    .stairs(simpleblockregistry.WITHER_SKELETON_STONE_STAIRS.get())
                    .button(simpleblockregistry.WITHER_SKELETON_STONE_BUTTON.get())
                    .wall(simpleblockregistry.WITHER_SKELETON_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.WITHER_SKELETON_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS.get())
                    .slab(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_CHISELED_STONE_BRICKS.get());

    }

    ResourceLocation woodtable;
    Variant woodtablevariant;

    protected void registerTableModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        LOGGER.info("Creating Table Models");

        for (DeferredHolder<Block, ? extends Block> holder : SpooktasticDecor.BLOCKS.getEntries()) {
            String rawName = holder.getId().getPath();
            if (rawName.contains("table")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                ResourceLocation woodtable = modLocation(name);
                Variant woodtablevariant = new Variant(woodtable);

                blockModels.blockStateOutput.accept(
                    MultiVariantGenerator.dispatch(
                        holder.get(),
                        BlockModelGenerators.variant(woodtablevariant)
                    )
                );
            }
        }

        for (DeferredHolder<Item, ? extends Item> holder : SpooktasticDecor.ITEMS.getEntries()) {
            String rawName = holder.getId().getPath();
            if (rawName.contains("table")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                itemModels.itemModelOutput.accept(
                holder.get(),
                ItemModelUtils.plainModel(modLocation(name))
            );
            }
        }
            // Block table = FurnitureBlockRegistry.ZOMBIE_WOOD_TABLE.get();

            // ResourceLocation modelLoc = modLocation("block/zombie_wood_table");

            // Variant variant = new Variant(modelLoc);

            // blockModels.blockStateOutput.accept(
            //     MultiVariantGenerator.dispatch(
            //         table,
            //         BlockModelGenerators.variant(variant)
            //     )
            // );
    }

    ResourceLocation planter;
    Variant plantervariant;

    protected void registerPlanterModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        LOGGER.info("Creating Planter Models");

        for (DeferredHolder<Block, ? extends Block> holder : SpooktasticDecor.BLOCKS.getEntries()) {
            String rawName = holder.getId().getPath();
            if (rawName.contains("planter")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                ResourceLocation planter = modLocation(name);
                Variant plantervariant = new Variant(planter);

                blockModels.blockStateOutput.accept(
                    MultiVariantGenerator.dispatch(
                        holder.get(),
                        BlockModelGenerators.variant(plantervariant)
                    )
                );
            }
        }

        for (DeferredHolder<Item, ? extends Item> holder : SpooktasticDecor.ITEMS.getEntries()) {
            String rawName = holder.getId().getPath();
            if (rawName.contains("planter")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                itemModels.itemModelOutput.accept(
                holder.get(),
                ItemModelUtils.plainModel(modLocation(name))
            );
            }
        }
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