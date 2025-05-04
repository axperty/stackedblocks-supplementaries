package com.axperty.stackedblockssupplementaries;

import com.axperty.stackedblockssupplementaries.registry.CreativeTabRegistry;
import com.axperty.stackedblockssupplementaries.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackedBlocksSupplementaries implements ModInitializer {
    public static final String MODID = "stackedblockssupplementaries";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        CreativeTabRegistry.registerItemGroups();
        BlockRegistry.registerModBlocks();
    }
}