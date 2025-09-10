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
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class RecipeGenerator extends RecipeProvider {
    public RecipeGenerator(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

@Override
protected void buildRecipes() {
    System.out.println("Running RecipeGenerator#buildRecipes");
    ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', Items.ROTTEN_FLESH)
            .define('B', Blocks.GLOWSTONE)
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
