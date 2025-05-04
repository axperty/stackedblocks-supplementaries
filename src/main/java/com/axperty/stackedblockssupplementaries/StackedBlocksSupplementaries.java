package com.axperty.stackedblockssupplementaries;

import com.axperty.stackedblockssupplementaries.register.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackedBlocksSupplementaries implements ModInitializer {
	public static final String MOD_ID = "stackedblockssupplementaries";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.registerModBlocks();
	}
}
