package com.goldfish.spooktasticdecor.datagen;

import java.util.Map;
import java.util.Set;
import com.goldfish.spooktasticdecor.SpooktasticDecor;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class LootTableDatagen extends BlockLootSubProvider {

    public LootTableDatagen(HolderLookup.Provider lookupProvider) {
        super(
            Set.of(), // explosionResistant items
            FeatureFlags.REGISTRY.allFlags(), // enabledFeatures
            new java.util.HashMap<>(), // loot table builders
            lookupProvider
        );
    }

    @Override
protected Iterable<Block> getKnownBlocks() {
    return SpooktasticDecor.BLOCKS.getEntries()
        .stream()
        .map(e -> (Block) e.value())
        .filter(block -> block.asItem() != Items.AIR)
        .toList();
}

    @Override
protected void generate() {
    SpooktasticDecor.BLOCKS.getEntries().forEach(entry -> {
        Block block = entry.get();

        if (block.asItem() == Items.AIR) {
        return;
}
        if (block.getName().toString().matches(".*slab.*")) {
        this.add(block, this::createSlabItemTable);
        return;
}
        if(block.getName().toString().matches(".*door.*") && !block.getName().toString().matches(".*trapdoor.*")) {
        this.add(block, this::createDoorTable);
        return;
}

        this.dropSelf(block);
    });
}
}