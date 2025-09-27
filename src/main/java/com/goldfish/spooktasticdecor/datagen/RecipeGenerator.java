package com.goldfish.spooktasticdecor.datagen;

import java.util.concurrent.CompletableFuture;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.SmallDecorItem;
import com.goldfish.spooktasticdecor.registry.FurnitureBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.PorcelainRegistry;
import com.goldfish.spooktasticdecor.registry.MetalRegistry;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.SmallDecorItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
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

    public static final TagKey<Item> COBBLESTONE_TAG = ItemTags.create(
        ResourceLocation.fromNamespaceAndPath("c", "cobblestones")
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

        registerMaterialRecipes();
        registerLampRecipes();
        registerWoodRecipes();
        registerTableRecipes();
        registerPlanterRecipes();
        registerCobblestoneRecipes();
        registerStoneRecipes();
        registerSoulBronzeRecipes();
        registerSmallDecorItemRecipes();
        }

        protected void registerMaterialRecipes() {
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PorcelainRegistry.PORCELAIN_CLAY.get(), 2)
                        .requires(Items.CLAY_BALL)
                        .requires(Items.QUARTZ)
                        .unlockedBy("has_clay_ball", has(Items.CLAY_BALL))
                        .unlockedBy("has_quartz", has(Items.QUARTZ))
                        .save(this.output);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(PorcelainRegistry.PORCELAIN_CLAY.get()), 
                        RecipeCategory.MISC, 
                        PorcelainRegistry.PORCELAIN_BRICK.get(), 
                        1.0f, 
                        10)
                        .unlockedBy("has_porcelain_clay", has(PorcelainRegistry.PORCELAIN_CLAY.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, PorcelainRegistry.PORCELAIN_BLOCK_ITEM.get())
                        .pattern("AAA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', PorcelainRegistry.PORCELAIN_BRICK.get())
                        .unlockedBy("has_porcelain_brick", has(PorcelainRegistry.PORCELAIN_BRICK.get()))
                        .save(this.output);
                SimpleCookingRecipeBuilder.smelting(Ingredient.of(PorcelainRegistry.PORCELAIN_BLOCK_ITEM.get()), 
                        RecipeCategory.BUILDING_BLOCKS, 
                        PorcelainRegistry.GLAZED_PORCELAIN_BLOCK_ITEM.get(), 
                        0.5f, 
                        20)
                        .unlockedBy("has_porcelain_block_item", has(PorcelainRegistry.PORCELAIN_BLOCK_ITEM.get()))
                        .save(this.output);
        }

        protected void registerLampRecipes() {
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get(), 2)
                        .pattern(" A ")
                        .pattern("ABA")
                        .pattern(" A ")
                        .define('A', Items.ROTTEN_FLESH)
                        .define('B', Blocks.GLOWSTONE)
                        .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.ZOMBIE_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_zombie_chiseled_stone", has(SimpleBlockItemRegistry.ZOMBIE_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SKELETON_LAMP_ITEM.get(), 2)
                        .pattern(" A ")
                        .pattern("ABA")
                        .pattern(" A ")
                        .define('A', Items.BONE)
                        .define('B', Blocks.GLOWSTONE)
                        .unlockedBy("has_bone", has(Items.BONE))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.SKELETON_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_skeleton_chiseled_stone", has(SimpleBlockItemRegistry.SKELETON_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.WITHER_SKELETON_LAMP_ITEM.get(), 4)
                        .pattern(" A ")
                        .pattern("ABA")
                        .pattern(" A ")
                        .define('A', Items.WITHER_ROSE)
                        .define('B', Blocks.GLOWSTONE)
                        .unlockedBy("has_wither_rose", has(Items.WITHER_ROSE))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.WITHER_SKELETON_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_wither_skeleton_chiseled_stone", has(SimpleBlockItemRegistry.WITHER_SKELETON_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.GHAST_LAMP_ITEM.get(), 4)
                        .pattern(" A ")
                        .pattern("ABA")
                        .pattern(" A ")
                        .define('A', Items.GHAST_TEAR)
                        .define('B', Blocks.GLOWSTONE)
                        .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.GHAST_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_ghast_chiseled_stone", has(SimpleBlockItemRegistry.GHAST_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.CREAKING_LAMP_ITEM.get(), 2)
                        .pattern(" C ")
                        .pattern("ABA")
                        .pattern(" C ")
                        .define('A', Items.PALE_OAK_PLANKS)
                        .define('B', Blocks.GLOWSTONE)
                        .define('C', Items.RESIN_CLUMP)
                        .unlockedBy("has_pale_oak_planks", has(Items.PALE_OAK_PLANKS))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.CREAKING_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.CREAKING_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_creaking_chiseled_stone", has(SimpleBlockItemRegistry.CREAKING_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.EYEBALL_LAMP_ITEM.get(), 2)
                        .pattern(" C ")
                        .pattern("ABA")
                        .pattern(" C ")
                        .define('A', Items.SPIDER_EYE)
                        .define('B', Blocks.GLOWSTONE)
                        .define('C', Items.ENDER_EYE)
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SPIDER_LAMP_ITEM.get(), 2)
                        .pattern(" C ")
                        .pattern("ABA")
                        .pattern(" C ")
                        .define('A', Items.SPIDER_EYE)
                        .define('B', Blocks.GLOWSTONE)
                        .define('C', Items.FERMENTED_SPIDER_EYE)
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .save(this.output);
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.SPIDER_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_spider_chiseled_stone", has(SimpleBlockItemRegistry.SPIDER_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ENDER_LAMP_ITEM.get(), 2)
                        .pattern(" C ")
                        .pattern("ABA")
                        .pattern(" C ")
                        .define('A', Items.ENDER_PEARL)
                        .define('B', Blocks.GLOWSTONE)
                        .define('C', Items.ENDER_EYE)
                        .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                        .save(this.output); 
                ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_STONE_LAMP_ITEM.get())
                        .requires(SimpleBlockItemRegistry.ENDER_CHISELED_STONE_BRICKS_ITEM.get())
                        .requires(Items.GLOWSTONE_DUST)
                        .unlockedBy("has_ender_chiseled_stone", has(SimpleBlockItemRegistry.ENDER_CHISELED_STONE_BRICKS_ITEM.get()))
                        .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
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
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get(), 8)
                        .pattern("BBB")
                        .pattern("BAB")
                        .pattern("BBB")
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
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SKELETON_LOG_ITEM.get(), 8)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
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
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.WITHER_SKELETON_LOG_ITEM.get(), 16)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.WITHER_ROSE)
                .define('B', this.tag(LOGS_TAG))
                .unlockedBy("has_wither_rose", has(Items.WITHER_ROSE))
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
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.GHAST_LOG_ITEM.get(), 8)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
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
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.SPIDER_LOG_ITEM.get(), 8)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
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
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, SimpleBlockItemRegistry.ENDER_LOG_ITEM.get(), 8)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
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

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.EYE_TABLE_ITEM.get(), 2)
                        .pattern("ABA")
                        .pattern("C C")
                        .pattern("C C")
                        .define('A', Items.SPIDER_EYE)
                        .define('B', Items.ENDER_EYE)
                        .define('C', Items.STICK)
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .unlockedBy("has_ender_eye", has(Items.ENDER_EYE))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SPIDER_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.SPIDER_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_spider_log", has(SimpleBlockItemRegistry.SPIDER_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SPIDER_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.STRIPPED_SPIDER_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_spider_log", has(SimpleBlockItemRegistry.STRIPPED_SPIDER_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SPIDER_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_spider_log", has(SimpleBlockItemRegistry.SPIDER_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ENDER_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.ENDER_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_ender_log", has(SimpleBlockItemRegistry.ENDER_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ENDER_STRIPPED_WOOD_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.STRIPPED_ENDER_LOG_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_stripped_ender_log", has(SimpleBlockItemRegistry.STRIPPED_ENDER_LOG_ITEM.get()))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ENDER_WOOD_PLANKS_TABLE_ITEM.get(), 2)
                        .pattern("AAA")
                        .pattern("B B")
                        .pattern("B B")
                        .define('A', SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get())
                        .define('B', Items.STICK)
                        .unlockedBy("has_ender_wood_planks", has(SimpleBlockItemRegistry.ENDER_WOOD_PLANKS_ITEM.get()))
                        .save(this.output);
        }

        protected void registerPlanterRecipes() {
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ZOMBIE_WOOD_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get())
                        .define('B', Items.DIRT)
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy("has_zombie_log", has(SimpleBlockItemRegistry.ZOMBIE_LOG_ITEM.get()))
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SKELETON_WOOD_PLANTER.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.SKELETON_LOG_ITEM.get())
                        .define('B', Items.DIRT)
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy("has_skeleton_log", has(SimpleBlockItemRegistry.SKELETON_LOG_ITEM.get()))
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.WITHER_SKELETON_WOOD_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_LOG_ITEM.get())
                        .define('B', Items.DIRT)
                        .define('C', Items.GOLD_INGOT)
                        .unlockedBy("has_wither_skeleton_log", has(SimpleBlockItemRegistry.WITHER_SKELETON_LOG_ITEM.get()))
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.GHAST_WOOD_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.GHAST_LOG_ITEM.get())
                        .define('B', Items.DIRT)
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy("has_ghast_log", has(SimpleBlockItemRegistry.GHAST_LOG_ITEM.get()))
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.CREAKING_WOOD_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', Items.PALE_OAK_LOG)
                        .define('B', Items.DIRT)
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy("has_pale_oak_log", has(Items.PALE_OAK_LOG))
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.EYE_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CDC")
                        .pattern("AAA")
                        .define('A', this.tag(LOGS_TAG))
                        .define('B', Items.DIRT)
                        .define('C', Items.SPIDER_EYE)
                        .define('D', Items.ENDER_EYE)
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .unlockedBy("has_eye_of_ender", has(Items.ENDER_EYE))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.SPIDER_WOOD_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.SPIDER_LOG_ITEM.get())
                        .define('B', Items.DIRT)
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy("has_spider_log", has(SimpleBlockItemRegistry.SPIDER_LOG_ITEM.get()))
                        .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                        .save(this.output);
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, FurnitureBlockItemRegistry.ENDER_WOOD_PLANTER_ITEM.get(), 4)
                        .pattern("ABA")
                        .pattern("CCC")
                        .pattern("AAA")
                        .define('A', SimpleBlockItemRegistry.ENDER_LOG_ITEM.get())
                        .define('B', Items.DIRT)
                        .define('C', Items.GOLD_INGOT)
                        .unlockedBy("has_ender_log", has(SimpleBlockItemRegistry.ENDER_LOG_ITEM.get()))
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(this.output);
        }

        protected void registerCobblestoneRecipes() {
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_ITEM.get(), 8)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.ROTTEN_FLESH)
                        .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                        .save(this.output);
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);
                        helper.registerFamily(
                        simpleblockregistry.ZOMBIE_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.ZOMBIE_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.ZOMBIE_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.ZOMBIE_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_COBBLESTONE_ITEM.get(), 8)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.BONE)
                        .unlockedBy("has_bone", has(Items.BONE))
                        .save(this.output);

                        helper.registerFamily(
                        simpleblockregistry.SKELETON_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.SKELETON_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.SKELETON_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.SKELETON_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.SKELETON_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.SKELETON_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SKELETON_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_COBBLESTONE_ITEM.get(), 16)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.WITHER_ROSE)
                        .unlockedBy("has_wither_rose", has(Items.WITHER_ROSE))
                        .save(this.output);

                        helper.registerFamily(
                        simpleblockregistry.WITHER_SKELETON_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.WITHER_SKELETON_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.WITHER_SKELETON_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.WITHER_SKELETON_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_COBBLESTONE_ITEM.get(), 8)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.GHAST_TEAR)
                        .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR))
                        .save(this.output);

                        helper.registerFamily(
                        simpleblockregistry.GHAST_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.GHAST_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.GHAST_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.GHAST_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.GHAST_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.GHAST_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.GHAST_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.CREAKING_COBBLESTONE_ITEM.get(), 8)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.RESIN_CLUMP)
                        .unlockedBy("has_resin_clump", has(Items.RESIN_CLUMP))
                        .save(this.output);

                        helper.registerFamily(
                        simpleblockregistry.CREAKING_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.CREAKING_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.CREAKING_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.CREAKING_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.CREAKING_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.CREAKING_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.CREAKING_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_COBBLESTONE_ITEM.get(), 8)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.SPIDER_EYE)
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .save(this.output);

                        helper.registerFamily(
                        simpleblockregistry.SPIDER_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.SPIDER_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.SPIDER_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.SPIDER_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.SPIDER_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.SPIDER_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SPIDER_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_COBBLESTONE_ITEM.get(), 8)
                        .pattern("AAA")
                        .pattern("ABA")
                        .pattern("AAA")
                        .define('A', this.tag(COBBLESTONE_TAG))
                        .define('B', Items.ENDER_EYE)
                        .unlockedBy("has_ender_eye", has(Items.ENDER_EYE))
                        .save(this.output);

                        helper.registerFamily(
                        simpleblockregistry.ENDER_COBBLESTONE.get(),
                        SimpleBlockItemRegistry.ENDER_COBBLESTONE_ITEM.get(),
                        simpleblockregistry.ENDER_COBBLESTONE_SLAB.get(),
                        simpleblockregistry.ENDER_COBBLESTONE_STAIRS.get(),
                        simpleblockregistry.ENDER_COBBLESTONE_WALL.get(),
                        SimpleBlockItemRegistry.ENDER_COBBLESTONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ENDER_COBBLESTONE_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0
                        );
        }

        protected void registerStoneRecipes() {
                registerZombieStoneRecipes();
                registerSkeletonStoneRecipes();
                registerWitherSkeletonStoneRecipes();
                registerGhastStoneRecipes();
                registerCreakingStoneRecipes();
                registerSpiderStoneRecipes();
                registerEnderStoneRecipes();
        }
        protected void registerZombieStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);
                        helper.registerFamily(
                        simpleblockregistry.ZOMBIE_STONE.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_ITEM.get(),
                        simpleblockregistry.ZOMBIE_STONE_SLAB.get(),
                        simpleblockregistry.ZOMBIE_STONE_STAIRS.get(),
                        simpleblockregistry.ZOMBIE_STONE_WALL.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.ZOMBIE_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.ZOMBIE_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.ZOMBIE_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.ZOMBIE_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.ZOMBIE_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.ZOMBIE_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.ZOMBIE_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ZOMBIE_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_STONE_ITEM.get())
                        .unlockedBy("has_zombie_stone", has(SimpleBlockItemRegistry.ZOMBIE_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.ZOMBIE_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.ZOMBIE_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_zombie_stone", has(simpleblockregistry.ZOMBIE_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":zombie_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.ZOMBIE_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.ZOMBIE_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.ZOMBIE_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.ZOMBIE_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ZOMBIE_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );

                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ZOMBIE_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.ZOMBIE_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_zombie_stone_bricks_slab", has(SimpleBlockItemRegistry.ZOMBIE_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.ZOMBIE_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.ZOMBIE_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_zombie_stone_bricks", has(simpleblockregistry.ZOMBIE_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":zombie_chiseled_stone_bricks_from_stonecutting");

        }
        protected void registerSkeletonStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);

                        helper.registerFamily(
                        simpleblockregistry.SKELETON_STONE.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_ITEM.get(),
                        simpleblockregistry.SKELETON_STONE_SLAB.get(),
                        simpleblockregistry.SKELETON_STONE_STAIRS.get(),
                        simpleblockregistry.SKELETON_STONE_WALL.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.SKELETON_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.SKELETON_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.SKELETON_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.SKELETON_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.SKELETON_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.SKELETON_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.SKELETON_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SKELETON_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.SKELETON_STONE_ITEM.get())
                        .unlockedBy("has_skeleton_stone", has(SimpleBlockItemRegistry.SKELETON_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.SKELETON_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.SKELETON_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_skeleton_stone", has(simpleblockregistry.SKELETON_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":skeleton_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.SKELETON_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.SKELETON_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.SKELETON_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.SKELETON_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SKELETON_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );


                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SKELETON_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.SKELETON_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_skeleton_stone_bricks_slab", has(SimpleBlockItemRegistry.SKELETON_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.SKELETON_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.SKELETON_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_skeleton_stone_bricks", has(simpleblockregistry.SKELETON_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":skeleton_chiseled_stone_bricks_from_stonecutting");                
        }
        protected void registerWitherSkeletonStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);

                        helper.registerFamily(
                        simpleblockregistry.WITHER_SKELETON_STONE.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_ITEM.get(),
                        simpleblockregistry.WITHER_SKELETON_STONE_SLAB.get(),
                        simpleblockregistry.WITHER_SKELETON_STONE_STAIRS.get(),
                        simpleblockregistry.WITHER_SKELETON_STONE_WALL.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.WITHER_SKELETON_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_STONE_ITEM.get())
                        .unlockedBy("has_wither_skeleton_stone", has(SimpleBlockItemRegistry.WITHER_SKELETON_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.WITHER_SKELETON_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.WITHER_SKELETON_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_wither_skeleton_stone", has(simpleblockregistry.WITHER_SKELETON_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":wither_skeleton_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.WITHER_SKELETON_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.WITHER_SKELETON_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );


                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.WITHER_SKELETON_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_wither_skeleton_stone_bricks_slab", has(SimpleBlockItemRegistry.WITHER_SKELETON_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.WITHER_SKELETON_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_wither_skeleton_stone_bricks", has(simpleblockregistry.WITHER_SKELETON_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":wither_skeleton_chiseled_stone_bricks_from_stonecutting");                
        }
        protected void registerGhastStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);

                        helper.registerFamily(
                        simpleblockregistry.GHAST_STONE.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_ITEM.get(),
                        simpleblockregistry.GHAST_STONE_SLAB.get(),
                        simpleblockregistry.GHAST_STONE_STAIRS.get(),
                        simpleblockregistry.GHAST_STONE_WALL.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.GHAST_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.GHAST_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.GHAST_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.GHAST_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.GHAST_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.GHAST_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.GHAST_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.GHAST_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.GHAST_STONE_ITEM.get())
                        .unlockedBy("has_ghast_stone", has(SimpleBlockItemRegistry.GHAST_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.GHAST_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.GHAST_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_ghast_stone", has(simpleblockregistry.GHAST_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":ghast_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.GHAST_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.GHAST_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.GHAST_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.GHAST_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.GHAST_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );


                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.GHAST_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.GHAST_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_ghast_stone_bricks_slab", has(SimpleBlockItemRegistry.GHAST_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.GHAST_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.GHAST_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_ghast_stone_bricks", has(simpleblockregistry.GHAST_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":ghast_chiseled_stone_bricks_from_stonecutting");                
        }
        protected void registerCreakingStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);

                        helper.registerFamily(
                        simpleblockregistry.CREAKING_STONE.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_ITEM.get(),
                        simpleblockregistry.CREAKING_STONE_SLAB.get(),
                        simpleblockregistry.CREAKING_STONE_STAIRS.get(),
                        simpleblockregistry.CREAKING_STONE_WALL.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.CREAKING_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.CREAKING_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.CREAKING_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.CREAKING_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.CREAKING_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.CREAKING_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.CREAKING_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.CREAKING_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.CREAKING_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.CREAKING_STONE_ITEM.get())
                        .unlockedBy("has_creaking_stone", has(SimpleBlockItemRegistry.CREAKING_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.CREAKING_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.CREAKING_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_creaking_stone", has(simpleblockregistry.CREAKING_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":creaking_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.CREAKING_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.CREAKING_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.CREAKING_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.CREAKING_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.CREAKING_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );


                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.CREAKING_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.CREAKING_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_creaking_stone_bricks_slab", has(SimpleBlockItemRegistry.CREAKING_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.CREAKING_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.CREAKING_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_creaking_stone_bricks", has(simpleblockregistry.CREAKING_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":creaking_chiseled_stone_bricks_from_stonecutting");                
        }
        protected void registerSpiderStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);

                        helper.registerFamily(
                        simpleblockregistry.SPIDER_STONE.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_ITEM.get(),
                        simpleblockregistry.SPIDER_STONE_SLAB.get(),
                        simpleblockregistry.SPIDER_STONE_STAIRS.get(),
                        simpleblockregistry.SPIDER_STONE_WALL.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.SPIDER_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.SPIDER_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.SPIDER_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.SPIDER_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.SPIDER_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.SPIDER_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.SPIDER_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SPIDER_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.SPIDER_STONE_ITEM.get())
                        .unlockedBy("has_spider_stone", has(SimpleBlockItemRegistry.SPIDER_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.SPIDER_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.SPIDER_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_spider_stone", has(simpleblockregistry.SPIDER_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":spider_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.SPIDER_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.SPIDER_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.SPIDER_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.SPIDER_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.SPIDER_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );


                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.SPIDER_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.SPIDER_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_spider_stone_bricks_slab", has(SimpleBlockItemRegistry.SPIDER_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.SPIDER_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.SPIDER_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_spider_stone_bricks", has(simpleblockregistry.SPIDER_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":spider_chiseled_stone_bricks_from_stonecutting");                
        }
        protected void registerEnderStoneRecipes() {
                RecipeFamilyHelper helper = new RecipeFamilyHelper(this.output, this.registries);

                        helper.registerFamily(
                        simpleblockregistry.ENDER_STONE.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_ITEM.get(),
                        simpleblockregistry.ENDER_STONE_SLAB.get(),
                        simpleblockregistry.ENDER_STONE_STAIRS.get(),
                        simpleblockregistry.ENDER_STONE_WALL.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.ENDER_COBBLESTONE_ITEM.get(),
                        0.5f, 
                        20 
                        );

                        helper.registerFamily(
                        simpleblockregistry.ENDER_SMOOTH_STONE.get(),
                        SimpleBlockItemRegistry.ENDER_SMOOTH_STONE_ITEM.get(),
                        simpleblockregistry.ENDER_SMOOTH_STONE_SLAB.get(),
                        simpleblockregistry.ENDER_SMOOTH_STONE_STAIRS.get(),
                        simpleblockregistry.ENDER_SMOOTH_STONE_WALL.get(),
                        SimpleBlockItemRegistry.ENDER_SMOOTH_STONE_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ENDER_SMOOTH_STONE_PRESSURE_PLATE_ITEM.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_ITEM.get(),
                        0.5f, 
                        20 
                        );
                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_STONE_BRICKS_ITEM.get(), 4)
                        .pattern("AA ")
                        .pattern("AA ")
                        .define('A', SimpleBlockItemRegistry.ENDER_STONE_ITEM.get())
                        .unlockedBy("has_ender_stone", has(SimpleBlockItemRegistry.ENDER_STONE_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.ENDER_STONE.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.ENDER_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_ender_stone", has(simpleblockregistry.ENDER_STONE.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":ender_stone_bricks_from_stonecutting");

                        helper.registerFamily(
                        simpleblockregistry.ENDER_STONE_BRICKS.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_BRICKS_ITEM.get(),
                        simpleblockregistry.ENDER_STONE_BRICKS_SLAB.get(),
                        simpleblockregistry.ENDER_STONE_BRICKS_STAIRS.get(),
                        simpleblockregistry.ENDER_STONE_BRICKS_WALL.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_BRICKS_BUTTON_ITEM.get(),
                        SimpleBlockItemRegistry.ENDER_STONE_BRICKS_PRESSURE_PLATE_ITEM.get(),
                        null,
                        0.0f,
                        0   
                        );


                ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, SimpleBlockItemRegistry.ENDER_CHISELED_STONE_BRICKS_ITEM.get())
                        .pattern("A")
                        .pattern("A")
                        .define('A', SimpleBlockItemRegistry.ENDER_STONE_BRICKS_SLAB_ITEM.get())
                        .unlockedBy("has_ender_stone_bricks_slab", has(SimpleBlockItemRegistry.ENDER_STONE_BRICKS_SLAB_ITEM.get()))
                        .save(this.output);

                SingleItemRecipeBuilder.stonecutting(Ingredient.of(simpleblockregistry.ENDER_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, simpleblockregistry.ENDER_CHISELED_STONE_BRICKS.get(), 1)
                        .unlockedBy("has_ender_stone_bricks", has(simpleblockregistry.ENDER_STONE_BRICKS.get()))
                        .save(this.output, SpooktasticDecor.MODID + ":ender_chiseled_stone_bricks_from_stonecutting");                
        }
        protected void registerSoulBronzeRecipes() {
           ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_ALLOY.get(), 2)
                .requires(Items.RAW_COPPER)
                .requires(Items.SOUL_SAND)
                .unlockedBy("has_raw_copper", has(Items.RAW_COPPER))
                .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
                .save(this.output);

           SimpleCookingRecipeBuilder.smelting(Ingredient.of(MetalRegistry.SOUL_BRONZE_ALLOY.get()), RecipeCategory.MISC, MetalRegistry.SOUL_BRONZE_INGOT.get(), 1.0f, 50)
                .unlockedBy("has_soul_alloy", has(MetalRegistry.SOUL_BRONZE_ALLOY.get()))
                .save(this.output, "soul_ingot_by_smelting");
           SimpleCookingRecipeBuilder.blasting(Ingredient.of(MetalRegistry.SOUL_BRONZE_ALLOY.get()), RecipeCategory.MISC, MetalRegistry.SOUL_BRONZE_INGOT.get(), 1.0f, 25)
                .unlockedBy("has_soul_alloy", has(MetalRegistry.SOUL_BRONZE_ALLOY.get()))
                .save(this.output, "soul_ingot_by_blasting");                
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow((Registries.ITEM)), RecipeCategory.MISC, MetalRegistry.SOUL_BRONZE_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_NUGGET.get())
                .unlockedBy("has_soul_bronze_nugget", has(MetalRegistry.SOUL_BRONZE_NUGGET.get()))
                .save(this.output, "soul_ingot_by_crafting_with_nuggets");
           ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_INGOT.get(), 9)
                .requires(MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_ingot_by_crafting_with_block");

           ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.MISC, MetalRegistry.SOUL_BRONZE_NUGGET.get(), 9)
                .requires(MetalRegistry.SOUL_BRONZE_INGOT.get())
                .unlockedBy("has_soul_bronze_ingot", has(MetalRegistry.SOUL_BRONZE_INGOT.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow((Registries.ITEM)), RecipeCategory.MISC, MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_INGOT.get())
                .unlockedBy("has_soul_bronze_ingot", has(MetalRegistry.SOUL_BRONZE_INGOT.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BRICKS_ITEM.get(), 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', MetalRegistry.SOUL_BRONZE_ITEM.get())
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_ITEM.get()))
                .save(this.output, "soul_bronze_bricks_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BRICKS_ITEM.get())
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_ITEM.get()))
                .save(this.output, "soul_bronze_bricks_by_stonecutting");

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_CHISELED_ITEM.get())
                .pattern("A")
                .pattern("A")
                .define('A', MetalRegistry.SOUL_BRONZE_SLAB_ITEM.get())
                .unlockedBy("has_soul_bronze_slab", has(MetalRegistry.SOUL_BRONZE_SLAB_ITEM.get()))
                .save(this.output, "soul_bronze_chiseled_block_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_CHISELED_ITEM.get())
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_ITEM.get()))
                .save(this.output, "soul_bronze_chiseled_block_by_stonecutting");
                
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_SLAB.get(), 6)
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .unlockedBy("has_soul_copper_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_slab_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_SLAB.get(), 2)
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_slab_by_stonecutting");

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BRICKS_SLAB_ITEM.get(), 6)
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_BRICKS_ITEM.get())
                .unlockedBy("has_soul_bronze_bricks_block", has(MetalRegistry.SOUL_BRONZE_BRICKS_ITEM))
                .save(this.output, "soul_bronze_bricks_slab_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BRICKS_SLAB_ITEM.get(), 2)
                .unlockedBy("has_soul_bronze_bricks_block", has(MetalRegistry.SOUL_BRONZE_BRICKS_ITEM))
                .save(this.output, "soul_bronze_bricks_slab_by_stonecutting");

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_STAIRS.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .unlockedBy("has_soul_copper_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_stairs_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_STAIRS.get())
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_stairs_by_stonecutting");

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BRICKS_STAIRS_ITEM.get(), 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_BRICKS_ITEM.get())
                .unlockedBy("has_soul_bronze_bricks_block", has(MetalRegistry.SOUL_BRONZE_BRICKS_ITEM))
                .save(this.output, "soul_bronze_bricks_stairs_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BRICKS_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BRICKS_STAIRS_ITEM.get())
                .unlockedBy("has_soul_bronze_bricks_block", has(MetalRegistry.SOUL_BRONZE_BRICKS_BLOCK.get()))
                .save(this.output, "soul_bronze_bricks_stairs_by_stonecutting");

           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BLOCK.get()), RecipeCategory.REDSTONE, MetalRegistry.SOUL_BRONZE_BUTTON.get(), 3)
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_WALL.get(), 6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .unlockedBy("has_soul_copper_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_wall_by_crafting");
           SingleItemRecipeBuilder.stonecutting(Ingredient.of(MetalRegistry.SOUL_BRONZE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_WALL.get())
                .unlockedBy("has_soul_bronze_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_wall_by_stonecutting");

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_FENCE.get(), 6)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .define('B', Items.STICK)
                .unlockedBy("has_soul_copper_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_GATE.get(), 2)
                .pattern("BAB")
                .pattern("BAB")
                .define('A', MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .define('B', Items.STICK)
                .unlockedBy("has_soul_copper_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output, "soul_bronze_gate_by_crafting");

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.REDSTONE, MetalRegistry.SOUL_BRONZE_PRESSURE_PLATE.get(), 2)
                .pattern("AA ")
                .define('A', MetalRegistry.SOUL_BRONZE_BLOCK.get())
                .unlockedBy("has_soul_copper_block", has(MetalRegistry.SOUL_BRONZE_BLOCK.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BARS.get(), 18)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_INGOT.get())
                .unlockedBy("has_soul_bronze_ingot", has(MetalRegistry.SOUL_BRONZE_INGOT.get()))
                .save(this.output);
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_BARS_BLOCK_ITEM.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_BARS_ITEM.get())
                .unlockedBy("has_soul_bronze_bars_item", has(MetalRegistry.SOUL_BRONZE_BARS_ITEM.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_DOOR.get(), 3)
                .pattern("AA ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', MetalRegistry.SOUL_BRONZE_INGOT.get())
                .unlockedBy("has_soul_bronze_ingot", has(MetalRegistry.SOUL_BRONZE_INGOT.get()))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, MetalRegistry.SOUL_BRONZE_CHAIN_ITEM.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', MetalRegistry.SOUL_BRONZE_NUGGET.get())
                .define('B', MetalRegistry.SOUL_BRONZE_INGOT.get())
                .unlockedBy("has_soul_bronze_ingot", has(MetalRegistry.SOUL_BRONZE_INGOT.get()))
                .save(this.output);
                
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, MetalRegistry.SOUL_BRONZE_LANTERN_ITEM.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_NUGGET.get())
                .define('B', Items.TORCH)
                .unlockedBy("has_soul_bronze_nugget", has(MetalRegistry.SOUL_BRONZE_NUGGET.get()))
                .unlockedBy("has_torch", has(Items.TORCH))
                .save(this.output);
                
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, MetalRegistry.SOUL_BRONZE_SOUL_LANTERN_ITEM.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_NUGGET.get())
                .define('B', Items.SOUL_TORCH)
                .unlockedBy("has_soul_bronze_nugget", has(MetalRegistry.SOUL_BRONZE_NUGGET.get()))
                .unlockedBy("has_torch", has(Items.SOUL_TORCH))
                .save(this.output);

           ShapelessRecipeBuilder.shapeless(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.BUILDING_BLOCKS, MetalRegistry.SOUL_BRONZE_LAMP_ITEM.get())
                .requires(MetalRegistry.SOUL_BRONZE_BARS_BLOCK_ITEM.get())
                .requires(Items.GLOWSTONE_DUST)
                .unlockedBy("has_soul_bronze_bars_block_item", has(MetalRegistry.SOUL_BRONZE_BARS_BLOCK_ITEM.get()))
                .unlockedBy("has_glow_dust", has(Items.GLOWSTONE_DUST))
                .save(this.output);

           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, MetalRegistry.SOUL_BRONZE_PLANTER_ITEM.get(), 4)
                .pattern("ABA")
                .pattern("CCC")
                .pattern("AAA")
                .define('A', MetalRegistry.SOUL_BRONZE_ITEM.get())
                .define('B', Items.DIRT)
                .define('C', MetalRegistry.SOUL_BRONZE_INGOT.get())
                .unlockedBy("has_soul_bronze_item", has(MetalRegistry.SOUL_BRONZE_ITEM.get()))
                .unlockedBy("has_soul_bronze_ingot", has(MetalRegistry.SOUL_BRONZE_INGOT.get()))
                .save(this.output);
        }

        protected void registerSmallDecorItemRecipes() {
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmallDecorItemRegistry.PORCELAIN_PATTY_DOLL_ITEM.get())
                .pattern(" A ")
                .pattern("BCB")
                .pattern("CBC")
                .define('A', Items.YELLOW_WOOL)
                .define('B', PorcelainRegistry.PORCELAIN_BRICK.get())
                .define('C', Items.RED_WOOL)
                .unlockedBy("has_yellow_wool", has(Items.YELLOW_WOOL))
                .unlockedBy("has_porcelain_brick", has(PorcelainRegistry.PORCELAIN_BRICK.get()))
                .unlockedBy("has_red_wool", has(Items.RED_WOOL))
                .save(this.output);
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmallDecorItemRegistry.PORCELAIN_POPPY_DOLL_ITEM.get())
                .pattern(" A ")
                .pattern("BCB")
                .pattern("CBC")
                .define('A', Items.BLACK_WOOL)
                .define('B', PorcelainRegistry.PORCELAIN_BRICK.get())
                .define('C', Items.PURPLE_WOOL)
                .unlockedBy("has_black_wool", has(Items.BLACK_WOOL))
                .unlockedBy("has_porcelain_brick", has(PorcelainRegistry.PORCELAIN_BRICK.get()))
                .unlockedBy("has_red_wool", has(Items.PURPLE_WOOL))
                .save(this.output);
           ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, SmallDecorItemRegistry.PORCELAIN_PENELOPE_DOLL_ITEM.get())
                .pattern(" A ")
                .pattern("BCB")
                .pattern("CBC")
                .define('A', Items.RED_WOOL)
                .define('B', PorcelainRegistry.PORCELAIN_BRICK.get())
                .define('C', Items.WHITE_WOOL)
                .unlockedBy("has_black_wool", has(Items.RED_WOOL))
                .unlockedBy("has_porcelain_brick", has(PorcelainRegistry.PORCELAIN_BRICK.get()))
                .unlockedBy("has_red_wool", has(Items.WHITE_WOOL))
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
