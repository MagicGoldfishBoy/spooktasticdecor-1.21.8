package com.goldfish.spooktasticdecor.datagen;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

public class familyRecipeHelper extends RecipeProvider {

        protected familyRecipeHelper(Provider registries, RecipeOutput output) {
        super(registries, output);
    }

        @Override
        protected void buildRecipes() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'buildRecipes'");
        }

        public void createSimpleBlockFamilyRecipes(Ingredient ingredient, ItemLike item, String prefix) {
            if (prefix + "_slab" != null) {
                    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_SLAB_ITEM.get(), 6)
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_ITEM.get())
                        .unlockedBy("has_zombie_cobblestone", has(SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_ITEM.get()))
                        .save(this.output);

            }
        }

    }

        // protected void registerPlanterModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        // LOGGER.info("Creating Planter Models");

        // for (DeferredHolder<Block, ? extends Block> holder : SpooktasticDecor.BLOCKS.getEntries()) {
        //     String rawName = holder.getId().getPath();
        //     if (rawName.contains("planter")) {
        //         String name = "block/" + rawName;

        //         LOGGER.info("Generating model for: {}", name);

        //         ResourceLocation planter = modLocation(name);
        //         Variant plantervariant = new Variant(planter);

        //         blockModels.blockStateOutput.accept(
        //             MultiVariantGenerator.dispatch(
        //                 holder.get(),
        //                 BlockModelGenerators.variant(plantervariant)
        //             )
        //         );
        //     }
        // }

