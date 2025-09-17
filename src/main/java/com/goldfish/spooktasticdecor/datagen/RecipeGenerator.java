package com.goldfish.spooktasticdecor.datagen;

import java.util.concurrent.CompletableFuture;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.registry.FurnitureBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public class RecipeGenerator extends RecipeProvider {
    public RecipeGenerator(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static final TagKey<Item> LOGS_TAG = ItemTags.create(
        ResourceLocation.fromNamespaceAndPath("minecraft", "logs")
    );
    public static final TagKey<Item> ZOMBIE_WOOD_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("spooktasticdecor", "zombie_logs")
    );
    public static final TagKey<Item> SKELETON_WOOD_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("spooktasticdecor", "skeleton_logs")
    );
    public static final TagKey<Item> WITHER_SKELETON_WOOD_TAG = TagKey.create(
                Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("spooktasticdecor", "wither_skeleton_logs")
    );
    public static final TagKey<Item> GHAST_WOOD_TAG = TagKey.create(
                        Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("spooktasticdecor", "ghast_logs")
    );
    public static final TagKey<Item> SPIDER_WOOD_TAG = TagKey.create(
                        Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("spooktasticdecor", "spider_logs")
    );
    public static final TagKey<Item> ENDER_WOOD_TAG = TagKey.create(
                        Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("spooktasticdecor", "ender_logs")
    );

        @Override
        protected void buildRecipes() {

        System.out.println("Running RecipeGenerator#buildRecipes");

        registerLampRecipes();
        registerWoodRecipes();
        registerTableRecipes();
        }
        protected void registerLampRecipes() {
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get())
                        .pattern(" A ")
                        .pattern("ABA")
                        .pattern(" A ")
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

        protected void registerWoodRecipes() {
                registerZombieWoodRecipes();
                registerSkeletonWoodRecipes();
                registerWitherSkeletonWoodRecipes();
                registerGhastWoodRecipes();
                registerSpiderWoodRecipes();
                registerEnderWoodRecipes();
        }
        protected void registerZombieWoodRecipes() {
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get(), 2)
                        .pattern(" B ")
                        .pattern(" A ")
                        .pattern(" B ")
                        .define('A', Items.ROTTEN_FLESH)
                        .define('B', this.tag(LOGS_TAG))
                        .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                        .save(this.output);
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.ZOMBIE_LOG.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.ZOMBIE_LOG_STRIPPED.get(), 1)
                        .unlockedBy("has_zombie_log", has(simpleblockregistry.ZOMBIE_LOG.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":zombie_log_stripped_from_stonecutting");
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get(), 4)
                        .requires(this.tag(ZOMBIE_WOOD_TAG))
                        .unlockedBy("has_zombie_log", has(simpleblockregistry.ZOMBIE_LOG.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_SLAB_ITEM.get(), 6)
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_STAIRS_ITEM.get(), 4)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_BUTTON_ITEM.get(), 1)
                        .requires(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_FENCE_ITEM.get(), 3)
                        .pattern("ABA")
                        .pattern("ABA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_FENCE_GATE_ITEM.get(), 1)
                        .pattern("BAB")
                        .pattern("BAB")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_PRESSURE_PLATE_ITEM.get(), 1)
                        .pattern("AA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_TRAPDOOR_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output); 
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_DOOR_ITEM.get(), 3)
                        .pattern("AA")
                        .pattern("AA")
                        .pattern("AA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .unlockedBy("has_zombie_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
        }
        protected void registerSkeletonWoodRecipes() {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SKELETON_LOG_ITEM.get(), 2)
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.BONE)
                .define('B', this.tag(LOGS_TAG))
                .unlockedBy("has_bone", has(Items.BONE))
                .save(this.output);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.SKELETON_LOG.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.SKELETON_LOG_STRIPPED.get(), 1)
                .unlockedBy("has_skeleton_log", has(simpleblockregistry.SKELETON_LOG.get()))
                .save(this.output, SpooktasticDecor.MODID + ":skeleton_log_stripped_from_stonecutting");
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get(), 4)
                .requires(this.tag(SKELETON_WOOD_TAG))
                .unlockedBy("has_skeleton_log", has(simpleblockregistry.SKELETON_LOG.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_SLAB_ITEM.get(), 6)
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_STAIRS_ITEM.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_BUTTON_ITEM.get(), 1)
                .requires(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_FENCE_ITEM.get(), 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_FENCE_GATE_ITEM.get(), 1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_PRESSURE_PLATE_ITEM.get(), 1)
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_TRAPDOOR_ITEM.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_DOOR_ITEM.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_skeleton_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        }
        protected void registerWitherSkeletonWoodRecipes() {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.WITHER_SKELETON_LOG_ITEM.get(), 2)
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.NETHERRACK)
                .define('B', this.tag(LOGS_TAG))
                .unlockedBy("has_netherrack", has(Items.NETHERRACK))
                .save(this.output);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.WITHER_SKELETON_LOG.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.WITHER_SKELETON_LOG_STRIPPED.get(), 1)
                .unlockedBy("has_wither_skeleton_log", has(simpleblockregistry.WITHER_SKELETON_LOG.get()))
                .save(this.output, SpooktasticDecor.MODID + ":wither_skeleton_log_stripped_from_stonecutting");
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get(), 4)
                .requires(this.tag(WITHER_SKELETON_WOOD_TAG))
                .unlockedBy("has_wither_skeleton_log", has(simpleblockregistry.WITHER_SKELETON_LOG.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_SLAB_ITEM.get(), 6)
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_STAIRS_ITEM.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_BUTTON_ITEM.get(), 1)
                .requires(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_FENCE_ITEM.get(), 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_FENCE_GATE_ITEM.get(), 1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_PRESSURE_PLATE_ITEM.get(), 1)
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_TRAPDOOR_ITEM.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output); 
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_DOOR_ITEM.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_wither_skeleton_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        }
        protected void registerGhastWoodRecipes() {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.GHAST_LOG_ITEM.get(), 2)
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.GHAST_TEAR)
                .define('B', this.tag(LOGS_TAG))
                .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR))
                .save(this.output);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.GHAST_LOG.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.GHAST_LOG_STRIPPED.get(), 1)
                .unlockedBy("has_ghast_log", has(simpleblockregistry.GHAST_LOG.get()))
                .save(this.output, SpooktasticDecor.MODID + ":ghast_log_stripped_from_stonecutting");
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get(), 4)
                .requires(this.tag(GHAST_WOOD_TAG))
                .unlockedBy("has_ghast_log", has(simpleblockregistry.GHAST_LOG.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_SLAB_ITEM.get(), 6)
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_STAIRS_ITEM.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_BUTTON_ITEM.get(), 1)
                .requires(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_FENCE_ITEM.get(), 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_FENCE_GATE_ITEM.get(), 1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_PRESSURE_PLATE_ITEM.get(), 1)
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_TRAPDOOR_ITEM.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output); 
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_DOOR_ITEM.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ghast_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        }
        protected void registerSpiderWoodRecipes() {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SPIDER_LOG_ITEM.get(), 2)
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.SPIDER_EYE)
                .define('B', this.tag(LOGS_TAG))
                .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                .save(this.output);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.SPIDER_LOG.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.SPIDER_LOG_STRIPPED.get(), 1)
                .unlockedBy("has_spider_log", has(simpleblockregistry.SPIDER_LOG.get()))
                .save(this.output, SpooktasticDecor.MODID + ":spider_log_stripped_from_stonecutting");
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get(), 4)
                .requires(this.tag(SPIDER_WOOD_TAG))
                .unlockedBy("has_spider_log", has(simpleblockregistry.SPIDER_LOG.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_SLAB_ITEM.get(), 6)
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_STAIRS_ITEM.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_BUTTON_ITEM.get(), 1)
                .requires(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_FENCE_ITEM.get(), 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_FENCE_GATE_ITEM.get(), 1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_PRESSURE_PLATE_ITEM.get(), 1)
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_TRAPDOOR_ITEM.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output); 
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_DOOR_ITEM.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_spider_planks", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        }
        protected void registerEnderWoodRecipes() {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ENDER_LOG_ITEM.get(), 2)
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.ENDER_PEARL)
                .define('B', this.tag(LOGS_TAG))
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(this.output);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.ENDER_LOG.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.ENDER_LOG_STRIPPED.get(), 1)
                .unlockedBy("has_ender_log", has(simpleblockregistry.ENDER_LOG.get()))
                .save(this.output, SpooktasticDecor.MODID + ":ender_log_stripped_from_stonecutting");
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get(), 4)
                .requires(this.tag(ENDER_WOOD_TAG))
                .unlockedBy("has_ender_log", has(simpleblockregistry.ENDER_LOG.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_SLAB_ITEM.get(), 6)
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_STAIRS_ITEM.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_BUTTON_ITEM.get(), 1)
                .requires(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_FENCE_ITEM.get(), 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_FENCE_GATE_ITEM.get(), 1)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .define('B', Items.STICK)
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_PRESSURE_PLATE_ITEM.get(), 1)
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_TRAPDOOR_ITEM.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output); 
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_DOOR_ITEM.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                .unlockedBy("has_ender_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                .save(this.output);
        }

        protected void registerTableRecipes() {
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ZOMBIE_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_zombie_log", has(SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ZOMBIE_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.STRIPPED_ZOMBIE_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_zombie_log", has(SimpleBlockItemRegistry.STRIPPED_ZOMBIE_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ZOMBIE_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_zombie_wood_planks", has(SimpleBlockItemRegistry.ZOMBIE_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SKELETON_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.SKELETON_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_skeleton_log", has(SimpleBlockItemRegistry.SKELETON_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SKELETON_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.STRIPPED_SKELETON_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_skeleton_log", has(SimpleBlockItemRegistry.STRIPPED_SKELETON_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SKELETON_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_skeleton_wood_planks", has(SimpleBlockItemRegistry.SKELETON_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.WITHER_SKELETON_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_wither_skeleton_log", has(SimpleBlockItemRegistry.WITHER_SKELETON_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.WITHER_SKELETON_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.STRIPPED_WITHER_SKELETON_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_wither_skeleton_log", has(SimpleBlockItemRegistry.STRIPPED_WITHER_SKELETON_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_wither_skeleton_wood_planks", has(SimpleBlockItemRegistry.WITHER_SKELETON_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.GHAST_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.GHAST_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_ghast_log", has(SimpleBlockItemRegistry.GHAST_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.GHAST_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.STRIPPED_GHAST_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_ghast_log", has(SimpleBlockItemRegistry.STRIPPED_GHAST_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.GHAST_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_ghast_wood_planks", has(SimpleBlockItemRegistry.GHAST_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.CREAKING_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', Items.PALE_OAK_LOG)
                        .define('B', Items.STICK)
                        .unlockedBy("has_creaking_log", has(Items.PALE_OAK_LOG))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.CREAKING_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', Items.STRIPPED_PALE_OAK_LOG)
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_creaking_log", has(Items.STRIPPED_PALE_OAK_LOG))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.CREAKING_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', Items.PALE_OAK_PLANKS)
                        .define('B', Items.STICK)
                        .unlockedBy("has_creaking_wood_planks", has(Items.PALE_OAK_PLANKS))
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
