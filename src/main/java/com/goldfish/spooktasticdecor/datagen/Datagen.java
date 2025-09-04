package com.goldfish.spooktasticdecor.datagen;

import net.minecraft.client.model.Model;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class Datagen {

    public void gatherData(GatherDataEvent event) {
                System.out.println("Datagen event fired!");
        event.createProvider(RecipeGenerator.Runner::new);
        event.createProvider(ModelDatagen::new);
    }
}
