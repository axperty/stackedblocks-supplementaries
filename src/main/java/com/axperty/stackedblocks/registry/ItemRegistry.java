package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.BlockItem;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StackedBlocks.MOD_ID);

    // Stacked Melons Item
    public static final DeferredItem<BlockItem> STACKED_MELONS_ITEM = ITEMS.registerSimpleBlockItem("stacked_melons", BlockRegistry.STACKED_MELONS);

    // Stacked Pumpkins Item
    public static final DeferredItem<BlockItem> STACKED_PUMPKINS_ITEM = ITEMS.registerSimpleBlockItem("stacked_pumpkins", BlockRegistry.STACKED_PUMPKINS);

    // Stacked Acacia Logs Item
    public static final DeferredItem<BlockItem> STACKED_ACACIA_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_acacia_logs", BlockRegistry.STACKED_ACACIA_LOGS);

    // Stacked Stripped Acacia Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_ACACIA_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_acacia_logs", BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS);

    // Stacked Oak Logs Item
    public static final DeferredItem<BlockItem> STACKED_OAK_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_oak_logs", BlockRegistry.STACKED_OAK_LOGS);

    // Stacked Stripped Oak Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_OAK_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_oak_logs", BlockRegistry.STACKED_STRIPPED_OAK_LOGS);
}
