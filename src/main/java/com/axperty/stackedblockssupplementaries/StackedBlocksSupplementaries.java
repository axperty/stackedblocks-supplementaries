package com.axperty.stackedblockssupplementaries;

import com.axperty.stackedblockssupplementaries.registry.BlockRegistry;
import com.axperty.stackedblockssupplementaries.registry.CreativeTabRegistry;
import com.axperty.stackedblockssupplementaries.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StackedBlocksSupplementaries.MOD_ID)
public class StackedBlocksSupplementaries {
    public static final String MOD_ID = "stackedblockssupplementaries";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StackedBlocksSupplementaries() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(modEventBus);
        ItemRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
