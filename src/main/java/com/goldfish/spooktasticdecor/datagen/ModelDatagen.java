package com.goldfish.spooktasticdecor.datagen;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
//import java.util.List;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.Barrel;
import com.goldfish.spooktasticdecor.block.Doll;
import com.goldfish.spooktasticdecor.block.Path;
import com.goldfish.spooktasticdecor.block.Skull;
import com.goldfish.spooktasticdecor.block.TallStatue;
import com.goldfish.spooktasticdecor.registry.PorcelainRegistry;
import com.goldfish.spooktasticdecor.registry.MetalRegistry;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.SmallDecorItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;
import com.google.gson.JsonElement;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.BlockModelGenerators.PlantType;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.client.renderer.block.model.multipart.CombinedCondition;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.Weighted;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplate;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModelDatagen extends ModelProvider {

    public ModelDatagen(PackOutput output) {
        super(output, SpooktasticDecor.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        registerMaterialModels(blockModels, itemModels);

        registerBlockModels(blockModels, itemModels);

        registerSoulBronzeModels(blockModels, itemModels);

        registerItemModels(blockModels, itemModels);

        registerTableModels(blockModels, itemModels);

        registerChairModels(blockModels, itemModels);

        registerPlanterModels(blockModels, itemModels);

        registerSmallDecorModels(blockModels, itemModels);

    }

    protected void registerMaterialModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(PorcelainRegistry.PORCELAIN_CLAY.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(PorcelainRegistry.PORCELAIN_BRICK.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(PorcelainRegistry.PORCELAIN_BLOCK.get());

        itemModels.itemModelOutput.accept(
            PorcelainRegistry.PORCELAIN_BLOCK_ITEM.get(), 
            ItemModelUtils.plainModel(modLocation("block/porcelain_block"))
        );

        blockModels.createTrivialCube(PorcelainRegistry.GLAZED_PORCELAIN_BLOCK.get());

        itemModels.itemModelOutput.accept(
            PorcelainRegistry.GLAZED_PORCELAIN_BLOCK_ITEM.get(), 
            ItemModelUtils.plainModel(modLocation("block/glazed_porcelain_block"))
        );

        itemModels.generateFlatItem(MetalRegistry.SOUL_BRONZE_ALLOY.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(MetalRegistry.SOUL_BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        
        itemModels.generateFlatItem(MetalRegistry.SOUL_BRONZE_NUGGET.get(), ModelTemplates.FLAT_ITEM);
    }

    protected void registerBlockModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_LAMP.get()); 
        blockModels.createTrivialCube(simpleblockregistry.ZOMBIE_STONE_LAMP.get()); 

        blockModels.createTrivialCube(simpleblockregistry.SKELETON_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.SKELETON_STONE_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.WITHER_SKELETON_STONE_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.GHAST_STONE_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.CREAKING_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.CREAKING_STONE_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.EYEBALL_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.SPIDER_STONE_LAMP.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_LAMP.get());
        blockModels.createTrivialCube(simpleblockregistry.ENDER_STONE_LAMP.get());


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


        blockModels.createTrivialCube(simpleblockregistry.GHAST_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.GHAST_COBBLESTONE.get())
                   .slab(simpleblockregistry.GHAST_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.GHAST_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.GHAST_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.GHAST_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.GHAST_COBBLESTONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.GHAST_STONE.get())
                    .slab(simpleblockregistry.GHAST_STONE_SLAB.get())
                    .stairs(simpleblockregistry.GHAST_STONE_STAIRS.get())
                    .button(simpleblockregistry.GHAST_STONE_BUTTON.get())
                    .wall(simpleblockregistry.GHAST_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.GHAST_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.GHAST_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.GHAST_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.GHAST_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.GHAST_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.GHAST_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.GHAST_SMOOTH_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.GHAST_STONE_BRICKS.get())
                    .slab(simpleblockregistry.GHAST_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.GHAST_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.GHAST_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.GHAST_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.GHAST_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.GHAST_CHISELED_STONE_BRICKS.get());


        blockModels.createTrivialCube(simpleblockregistry.CREAKING_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.CREAKING_COBBLESTONE.get())
                   .slab(simpleblockregistry.CREAKING_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.CREAKING_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.CREAKING_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.CREAKING_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.CREAKING_COBBLESTONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.CREAKING_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.CREAKING_STONE.get())
                    .slab(simpleblockregistry.CREAKING_STONE_SLAB.get())
                    .stairs(simpleblockregistry.CREAKING_STONE_STAIRS.get())
                    .button(simpleblockregistry.CREAKING_STONE_BUTTON.get())
                    .wall(simpleblockregistry.CREAKING_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.CREAKING_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.CREAKING_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.CREAKING_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.CREAKING_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.CREAKING_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.CREAKING_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.CREAKING_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.CREAKING_SMOOTH_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.CREAKING_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.CREAKING_STONE_BRICKS.get())
                    .slab(simpleblockregistry.CREAKING_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.CREAKING_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.CREAKING_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.CREAKING_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.CREAKING_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.CREAKING_CHISELED_STONE_BRICKS.get());


        blockModels.createTrivialCube(simpleblockregistry.SPIDER_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SPIDER_COBBLESTONE.get())
                   .slab(simpleblockregistry.SPIDER_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.SPIDER_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.SPIDER_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.SPIDER_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.SPIDER_COBBLESTONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SPIDER_STONE.get())
                    .slab(simpleblockregistry.SPIDER_STONE_SLAB.get())
                    .stairs(simpleblockregistry.SPIDER_STONE_STAIRS.get())
                    .button(simpleblockregistry.SPIDER_STONE_BUTTON.get())
                    .wall(simpleblockregistry.SPIDER_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.SPIDER_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SPIDER_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.SPIDER_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.SPIDER_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.SPIDER_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.SPIDER_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.SPIDER_SMOOTH_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.SPIDER_STONE_BRICKS.get())
                    .slab(simpleblockregistry.SPIDER_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.SPIDER_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.SPIDER_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.SPIDER_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.SPIDER_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.SPIDER_CHISELED_STONE_BRICKS.get());


        blockModels.createTrivialCube(simpleblockregistry.ENDER_COBBLESTONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ENDER_COBBLESTONE.get())
                   .slab(simpleblockregistry.ENDER_COBBLESTONE_SLAB.get())
                   .stairs(simpleblockregistry.ENDER_COBBLESTONE_STAIRS.get())
                   .button(simpleblockregistry.ENDER_COBBLESTONE_BUTTON.get())
                   .wall(simpleblockregistry.ENDER_COBBLESTONE_WALL.get())
                   .pressurePlate(simpleblockregistry.ENDER_COBBLESTONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ENDER_STONE.get())
                    .slab(simpleblockregistry.ENDER_STONE_SLAB.get())
                    .stairs(simpleblockregistry.ENDER_STONE_STAIRS.get())
                    .button(simpleblockregistry.ENDER_STONE_BUTTON.get())
                    .wall(simpleblockregistry.ENDER_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.ENDER_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_SMOOTH_STONE.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ENDER_SMOOTH_STONE.get())
                    .slab(simpleblockregistry.ENDER_SMOOTH_STONE_SLAB.get())
                    .stairs(simpleblockregistry.ENDER_SMOOTH_STONE_STAIRS.get())
                    .button(simpleblockregistry.ENDER_SMOOTH_STONE_BUTTON.get())
                    .wall(simpleblockregistry.ENDER_SMOOTH_STONE_WALL.get())
                    .pressurePlate(simpleblockregistry.ENDER_SMOOTH_STONE_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_STONE_BRICKS.get());

        blockModels.familyWithExistingFullBlock(simpleblockregistry.ENDER_STONE_BRICKS.get())
                    .slab(simpleblockregistry.ENDER_STONE_BRICKS_SLAB.get())
                    .stairs(simpleblockregistry.ENDER_STONE_BRICKS_STAIRS.get())
                    .button(simpleblockregistry.ENDER_STONE_BRICKS_BUTTON.get())
                    .wall(simpleblockregistry.ENDER_STONE_BRICKS_WALL.get())
                    .pressurePlate(simpleblockregistry.ENDER_STONE_BRICKS_PRESSURE_PLATE.get());

        blockModels.createTrivialCube(simpleblockregistry.ENDER_CHISELED_STONE_BRICKS.get());
    }

    protected void registerSoulBronzeModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        blockModels.createTrivialCube(MetalRegistry.SOUL_BRONZE_BLOCK.get());

        blockModels.createTrivialCube(MetalRegistry.SOUL_BRONZE_BRICKS_BLOCK.get());

        blockModels.createTrivialCube(MetalRegistry.SOUL_BRONZE_CHISELED_BLOCK.get());


        blockModels.familyWithExistingFullBlock(MetalRegistry.SOUL_BRONZE_BLOCK.get())
                    .slab(MetalRegistry.SOUL_BRONZE_SLAB.get())
                    .stairs(MetalRegistry.SOUL_BRONZE_STAIRS.get())
                    .button(MetalRegistry.SOUL_BRONZE_BUTTON.get())
                    .wall(MetalRegistry.SOUL_BRONZE_WALL.get())
                    .fence(MetalRegistry.SOUL_BRONZE_FENCE.get())
                    .fenceGate(MetalRegistry.SOUL_BRONZE_GATE.get())
                    .pressurePlate(MetalRegistry.SOUL_BRONZE_PRESSURE_PLATE.get());

        blockModels.familyWithExistingFullBlock(MetalRegistry.SOUL_BRONZE_BRICKS_BLOCK.get())
                   .slab(MetalRegistry.SOUL_BRONZE_BRICKS_SLAB.get())
                   .stairs(MetalRegistry.SOUL_BRONZE_BRICKS_STAIRS.get());

        blockModels.createGlassBlocks(MetalRegistry.SOUL_BRONZE_BARS_BLOCK.get(), MetalRegistry.SOUL_BRONZE_BARS.get());

        blockModels.createDoor(MetalRegistry.SOUL_BRONZE_DOOR.get());

        ChainBlock soul_bronze_chain = MetalRegistry.SOUL_BRONZE_CHAIN.get();

        Variant soulBronzeChainVariant = new Variant(ModelLocationUtils.getModelLocation(soul_bronze_chain));

        blockModels.blockStateOutput.accept(
            MultiVariantGenerator.dispatch(
                soul_bronze_chain,
                BlockModelGenerators.variant(soulBronzeChainVariant)
            ).with(
                PropertyDispatch.modify(BlockStateProperties.AXIS)
                    .select(Direction.Axis.Y, BlockModelGenerators.NOP)
                    .select(Direction.Axis.Z, BlockModelGenerators.X_ROT_90)
                    .select(Direction.Axis.X, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_90))
            )
        );

        itemModels.generateFlatItem(MetalRegistry.SOUL_BRONZE_CHAIN_ITEM.get(), ModelTemplates.FLAT_ITEM);

        
        blockModels.createLantern(MetalRegistry.SOUL_BRONZE_LANTERN.get());

        blockModels.createLantern(MetalRegistry.SOUL_BRONZE_SOUL_LANTERN.get());

        blockModels.createTrivialCube(MetalRegistry.SOUL_BRONZE_LAMP_BLOCK.get());


        Path soul_bronze_path = MetalRegistry.SOUL_BRONZE_PATH.get();

        Variant soulPathVariant = new Variant(ModelLocationUtils.getModelLocation(soul_bronze_path));

        blockModels.blockStateOutput.accept(
            MultiVariantGenerator.dispatch(
                soul_bronze_path,
                BlockModelGenerators.variant(soulPathVariant)
            ).with(
                PropertyDispatch.modify(HorizontalDirectionalBlock.FACING)
                    .select(Direction.SOUTH, BlockModelGenerators.NOP)
                    .select(Direction.NORTH, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.EAST, BlockModelGenerators.Y_ROT_270)
            )
        );


        Skull soul_bronze_skull = MetalRegistry.SOUL_BRONZE_SKULL.get();

        Variant soul_bronze_skull_variant = new Variant(ModelLocationUtils.getModelLocation(soul_bronze_skull));

        blockModels.blockStateOutput.accept(
            MultiVariantGenerator.dispatch(
                soul_bronze_skull,
                BlockModelGenerators.variant(soul_bronze_skull_variant)
            ).with(
                PropertyDispatch.modify(HorizontalDirectionalBlock.FACING)
                    .select(Direction.SOUTH, BlockModelGenerators.NOP)
                    .select(Direction.NORTH, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.EAST, BlockModelGenerators.Y_ROT_270)
            )
        );


        TallStatue soul_bronze_skeleton_statue = MetalRegistry.SOUL_BRONZE_SKELETON_STATUE.get();

        Variant soul_bronze_skeleton_variant = new Variant(ModelLocationUtils.getModelLocation(soul_bronze_skeleton_statue));

        blockModels.blockStateOutput.accept(
            MultiVariantGenerator.dispatch(
                soul_bronze_skeleton_statue,
                BlockModelGenerators.variant(soul_bronze_skeleton_variant)
            ).with(
                PropertyDispatch.modify(HorizontalDirectionalBlock.FACING)
                    .select(Direction.SOUTH, BlockModelGenerators.NOP)
                    .select(Direction.NORTH, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.EAST, BlockModelGenerators.Y_ROT_270)
            )
        );

            Barrel soul_bronze_barrel = MetalRegistry.SOUL_BRONZE_BARREL.get();
            Variant soul_bronze_barrel_closed = new Variant(ModelLocationUtils.getModelLocation(soul_bronze_barrel));
            Variant soul_bronze_barrel_open = new Variant(modLocation("block/soul_bronze_barrel_open"));
            MultiVariant soul_bronze_barrel_closed_multi = new MultiVariant(WeightedList.of(soul_bronze_barrel_closed));
            MultiVariant soul_bronze_barrel_open_multi = new MultiVariant(WeightedList.of(soul_bronze_barrel_open));

            blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(soul_bronze_barrel).with(
                    PropertyDispatch.initial(BlockStateProperties.OPEN)
                        .select(false, soul_bronze_barrel_closed_multi)
                        .select(true, soul_bronze_barrel_open_multi)
                )
            .with(
                PropertyDispatch.modify(DirectionalBlock.FACING)
                    .select(Direction.SOUTH, BlockModelGenerators.NOP)
                    .select(Direction.NORTH, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.EAST, BlockModelGenerators.Y_ROT_270)
                    .select(Direction.UP, BlockModelGenerators.X_ROT_90)
                    .select(Direction.DOWN, BlockModelGenerators.X_ROT_270)
            )
        );
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
    }
    ResourceLocation chair;
    Variant chair_variant;

    protected void registerChairModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        LOGGER.info("Creating Chair Models");

        for (DeferredHolder<Block, ? extends Block> holder : SpooktasticDecor.BLOCKS.getEntries()) {
            String rawName = holder.getId().getPath();
            if (rawName.contains("chair")) {
                String name = "block/" + rawName;

                LOGGER.info("Generating model for: {}", name);

                ResourceLocation chair = modLocation(name);
                Variant chair_variant = new Variant(chair);

                blockModels.blockStateOutput.accept(
                    MultiVariantGenerator.dispatch(
                        holder.get(),
                        BlockModelGenerators.variant(chair_variant)
                    ).with(
                PropertyDispatch.modify(HorizontalDirectionalBlock.FACING)
                    .select(Direction.SOUTH, BlockModelGenerators.NOP)
                    .select(Direction.NORTH, BlockModelGenerators.Y_ROT_180)
                    .select(Direction.WEST, BlockModelGenerators.Y_ROT_90)
                    .select(Direction.EAST, BlockModelGenerators.Y_ROT_270)
                    )
                );
            }
        } 
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

    private void registerFacingModelsWithItem(
        BlockModelGenerators blockModels,
        ItemModelGenerators itemModels,
        Block block,
        Map<Direction, String> modelNames,
        Direction itemFacing
    ) {
        MultiPartGenerator generator = MultiPartGenerator.multiPart(block);

        for (Map.Entry<Direction, String> entry : modelNames.entrySet()) {
            Direction facing = entry.getKey();
            ResourceLocation modelLoc = modLocation("block/" + entry.getValue());

            generator = generator.with(
                BlockModelGenerators.condition().term(BlockStateProperties.FACING, facing),
                BlockModelGenerators.variant(new Variant(modelLoc))
            );
        }

        blockModels.blockStateOutput.accept(generator);

        String itemModelName = modelNames.get(itemFacing);
        if (itemModelName != null) {
            itemModels.itemModelOutput.accept(
                block.asItem(),
                ItemModelUtils.plainModel(modLocation("block/" + itemModelName))
            );
        }
    }


    protected void registerSmallDecorModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        
        Doll porcelainPatty = SmallDecorItemRegistry.PORCELAIN_PATTY_DOLL.get();

        registerFacingModelsWithItem(
            blockModels,
            itemModels,
            porcelainPatty,
            Map.of(
                Direction.NORTH, "porcelain_patty_north",
                Direction.SOUTH, "porcelain_patty_south",
                Direction.EAST,  "porcelain_patty_east",
                Direction.WEST,  "porcelain_patty_west"
            ),
            Direction.NORTH
        );
        
        Doll porcelainPoppy = SmallDecorItemRegistry.PORCELAIN_POPPY_DOLL.get();

        registerFacingModelsWithItem(
            blockModels,
            itemModels,
            porcelainPoppy,
            Map.of(
                Direction.NORTH, "porcelain_poppy_north",
                Direction.SOUTH, "porcelain_poppy_south",
                Direction.EAST,  "porcelain_poppy_east",
                Direction.WEST,  "porcelain_poppy_west"
            ),
            Direction.NORTH
        );
        
        Doll porcelainPenelope = SmallDecorItemRegistry.PORCELAIN_PENELOPE_DOLL.get();

        registerFacingModelsWithItem(
            blockModels,
            itemModels,
            porcelainPenelope,
            Map.of(
                Direction.NORTH, "porcelain_penelope_north",
                Direction.SOUTH, "porcelain_penelope_south",
                Direction.EAST,  "porcelain_penelope_east",
                Direction.WEST,  "porcelain_penelope_west"
            ),
            Direction.NORTH
        );
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