package com.goldfish.spooktasticdecor.datagen;

import java.util.concurrent.CompletableFuture;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class RecipeGenerator extends RecipeProvider {
    public RecipeGenerator(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

@Override
protected void buildRecipes() {

    System.out.println("Running RecipeGenerator#buildRecipes");

    registerLampRecipes();
    registerLogRecipes();

}
protected void registerLampRecipes() {
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.ROTTEN_FLESH)
            .define('B', Blocks.GLOWSTONE)
            .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SKELETON_LAMP_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.BONE)
            .define('B', Blocks.GLOWSTONE)
            .unlockedBy("has_bone", has(Items.BONE))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.WITHER_SKELETON_LAMP_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.NETHERRACK)
            .define('B', SimpleBlockItemRegistry.SKELETON_LAMP_ITEM.get())
            .unlockedBy("has_netherrack", has(Items.NETHERRACK))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.GHAST_LAMP_ITEM.get())
            .pattern("ACA")
            .pattern("ABA")
            .pattern("ACA")
            .define('A', Items.GHAST_TEAR)
            .define('B', Blocks.GLOWSTONE)
            .define('C', Items.GHAST_TEAR)
            .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.CREAKING_LAMP_ITEM.get())
            .pattern("ACA")
            .pattern("ABA")
            .pattern("ACA")
            .define('A', Items.PALE_OAK_PLANKS)
            .define('B', Blocks.GLOWSTONE)
            .define('C', Items.RESIN_CLUMP)
            .unlockedBy("has_pale_oak_planks", has(Items.PALE_OAK_PLANKS))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.EYEBALL_LAMP_ITEM.get())
            .pattern("ACA")
            .pattern("ABA")
            .pattern("ACA")
            .define('A', Items.SPIDER_EYE)
            .define('B', Blocks.GLOWSTONE)
            .define('C', Items.ENDER_EYE)
            .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SPIDER_LAMP_ITEM.get())
            .pattern("ACA")
            .pattern("ABA")
            .pattern("ACA")
            .define('A', Items.SPIDER_EYE)
            .define('B', Blocks.GLOWSTONE)
            .define('C', Items.FERMENTED_SPIDER_EYE)
            .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
            .save(this.output);
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ENDER_LAMP_ITEM.get())
            .pattern("ACA")
            .pattern("ABA")
            .pattern("ACA")
            .define('A', Items.ENDER_PEARL)
            .define('B', Blocks.GLOWSTONE)
            .define('C', Items.ENDER_EYE)
            .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
            .save(this.output); 
}
protected void registerLogRecipes() {
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.ROTTEN_FLESH)
            .define('B', this.tag(ItemTags.LOGS))
            .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
            .save(this.output);
}

    // The data provider class
    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(@javax.annotation.Nonnull HolderLookup.Provider registries, @javax.annotation.Nonnull RecipeOutput output) {
            return new RecipeGenerator(registries, output);
        }

        @Override
        @javax.annotation.Nonnull
        public String getName() {
            return "SpooktasticDecor Recipes";
        }
    }
}
