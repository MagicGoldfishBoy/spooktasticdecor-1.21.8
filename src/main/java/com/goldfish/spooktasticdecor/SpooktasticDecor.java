package com.goldfish.spooktasticdecor;

import org.slf4j.Logger;

import com.goldfish.spooktasticdecor.datagen.Datagen;
import com.goldfish.spooktasticdecor.registry.FurnitureBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.FurnitureBlockRegistry;
import com.goldfish.spooktasticdecor.registry.MaterialRegistry;
import com.goldfish.spooktasticdecor.registry.MetalBlockRegistry;
import com.goldfish.spooktasticdecor.registry.SimpleBlockItemRegistry;
import com.goldfish.spooktasticdecor.registry.SmallDecorItemRegistry;
import com.goldfish.spooktasticdecor.registry.simpleblockregistry;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


@Mod(SpooktasticDecor.MODID)
public class SpooktasticDecor {

    public static final String MODID = "spooktasticdecor";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredRegister<MapCodec<? extends Block>> CODECS = DeferredRegister.create(BuiltInRegistries.BLOCK_TYPE, MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPOOKTASTIC_DECOR_TAB = CREATIVE_MODE_TABS.register("spooktastic_decor_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.spooktasticdecor"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> SimpleBlockItemRegistry.ZOMBIE_LAMP_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.acceptAll(
                ITEMS.getEntries().stream()
                    .map(sup -> sup.get().getDefaultInstance())
                    .filter(itemStack -> itemStack != null && !itemStack.isEmpty())
                    .toList()
            );
            }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public SpooktasticDecor(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        modEventBus.addListener(this::onClientSetup);

        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);

        CODECS.register(modEventBus);
        


        MaterialRegistry.registerAll();
        
        simpleblockregistry.registerAll();
        SimpleBlockItemRegistry.registerAll();

        MetalBlockRegistry.registerAll();

        FurnitureBlockRegistry.registerAll();
        FurnitureBlockItemRegistry.registerAll();

        SmallDecorItemRegistry.registerAll();
        
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (SpooktasticDecor) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        modEventBus.addListener(this::gatherData);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("Setup of the common variety is happening!");
        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.acceptAll(
                ITEMS.getEntries().stream()
                    .map(sup -> sup.get().getDefaultInstance())
                    .filter(itemStack -> itemStack != null && !itemStack.isEmpty())
                    .toList()
            );
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Good news, the server is starting! :D");
    }

    public void gatherData(GatherDataEvent.Client event) {
        Datagen datagen = new Datagen();
        datagen.gatherData(event);
    }

    public void onClientSetup(FMLClientSetupEvent event)
    {
        LOGGER.info("fixing bars");
        ItemBlockRenderTypes.setRenderLayer(MetalBlockRegistry.SOUL_BRONZE_BARS.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MetalBlockRegistry.SOUL_BRONZE_BARS_BLOCK.get(), ChunkSectionLayer.CUTOUT);
        }
}
