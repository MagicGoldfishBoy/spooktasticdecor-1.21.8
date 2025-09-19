package com.goldfish.spooktasticdecor.datagen;

import javax.annotation.Nullable;

import com.goldfish.spooktasticdecor.SpooktasticDecor;

import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class RecipeFamilyHelper {
    private final RecipeOutput output;
    private final HolderLookup.Provider registries; // your registry access

    public RecipeFamilyHelper(RecipeOutput output, HolderLookup.Provider registries) {
        this.output = output;
        this.registries = registries;
    }
    private Criterion<TriggerInstance> has(Item item) {
    return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }

    /**
     *
     * @param baseBlock    The main block (e.g., Zombie Stone block)
     * @param baseItem     The main item (e.g., Zombie Stone item)
     * @param slab         The slab block
     * @param stairs       The stairs block
     * @param wall         The wall block
     * @param button       The button item
     * @param pressurePlate The pressure plate item
     * @param smeltInput   Optional: the item to smelt into the base block
     * @param smeltExp     Optional: smelting experience
     * @param smeltTime    Optional: smelting time
     */
    public void registerFamily(Block baseBlock, Item baseItem,
                               Block slab, Block stairs, Block wall,
                               Item button, Item pressurePlate,
                               @Nullable Item smeltInput, float smeltExp, int smeltTime) {

        // Smelting if provided
        if (smeltInput != null) {
            SimpleCookingRecipeBuilder.smelting(
                    Ingredient.of(smeltInput),
                    RecipeCategory.BUILDING_BLOCKS,
                    baseItem,
                    smeltExp,
                    smeltTime
            )
            .unlockedBy("has_" + getItemName(smeltInput), has(smeltInput))
            .save(output);
        }

        // Slab
        slabBuilder(baseItem, slab);

        // Stairs
        stairsBuilder(baseItem, stairs);

        // Wall
        wallBuilder(baseItem, wall);

        // Button
        buttonBuilder(baseItem, button);

        // Pressure Plate
        pressurePlateBuilder(baseItem, pressurePlate);
    }

    /* ===== Helper methods for each recipe type ===== */
    private void slabBuilder(Item base, Block slab) {
        ShapedRecipeBuilder.shaped(registries.lookupOrThrow(Registries.ITEM),
                RecipeCategory.BUILDING_BLOCKS, slab.asItem(), 6)
            .pattern("AAA")
            .define('A', base)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base),
                RecipeCategory.BUILDING_BLOCKS, slab, 2)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output, SpooktasticDecor.MODID + ":" + getItemName(slab.asItem()) + "_from_stonecutting");
    }

    private void stairsBuilder(Item base, Block stairs) {
        ShapedRecipeBuilder.shaped(registries.lookupOrThrow(Registries.ITEM),
                RecipeCategory.BUILDING_BLOCKS, stairs.asItem(), 4)
            .pattern("A  ")
            .pattern("AA ")
            .pattern("AAA")
            .define('A', base)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base),
                RecipeCategory.BUILDING_BLOCKS, stairs)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output, SpooktasticDecor.MODID + ":" + getItemName(stairs.asItem()) + "_from_stonecutting");
    }

    private void wallBuilder(Item base, Block wall) {
        ShapedRecipeBuilder.shaped(registries.lookupOrThrow(Registries.ITEM),
                RecipeCategory.BUILDING_BLOCKS, wall.asItem(), 6)
            .pattern("   ")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', base)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base),
                RecipeCategory.BUILDING_BLOCKS, wall)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output, SpooktasticDecor.MODID + ":" + getItemName(wall.asItem()) + "_from_stonecutting");
    }

    private void buttonBuilder(Item base, Item button) {
        ShapelessRecipeBuilder.shapeless(registries.lookupOrThrow(Registries.ITEM),
                RecipeCategory.REDSTONE, button)
            .requires(base)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output);
    }

    private void pressurePlateBuilder(Item base, Item plate) {
        ShapedRecipeBuilder.shaped(registries.lookupOrThrow(Registries.ITEM),
                RecipeCategory.REDSTONE, plate)
            .pattern("AA")
            .define('A', base)
            .unlockedBy("has_" + getItemName(base), has(base))
            .save(output);
    }

    private String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }
}
