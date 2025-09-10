package com.goldfish.spooktasticdecor.datagen;

import java.util.List;
import java.util.Set;

import net.minecraft.client.model.Model;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;


public class Datagen {

    public void gatherData(GatherDataEvent event) {
        System.out.println("Datagen event fired!");
        event.createProvider(RecipeGenerator.Runner::new);
        event.createProvider(ModelDatagen::new);
        event.createProvider((output, lookupProvider) -> new LootTableProvider(
            output,
            Set.of(),
            List.of(
                new LootTableProvider.SubProviderEntry(
                    LootTableDatagen::new,
                    LootContextParamSets.BLOCK
                )
            ),
            lookupProvider
        ));
    }
}

