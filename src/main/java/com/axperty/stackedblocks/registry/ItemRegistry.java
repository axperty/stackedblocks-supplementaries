package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.BlockItem;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StackedBlocks.MOD_ID);

    // Stacked Stone Blocks Item
    public static final DeferredItem<BlockItem> STACKED_STONE_BLOCKS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stone_blocks", BlockRegistry.STACKED_STONE_BLOCKS);

    // Stacked Cobblestone Blocks Item
    public static final DeferredItem<BlockItem> STACKED_COBBLESTONE_BLOCKS_ITEM = ITEMS.registerSimpleBlockItem("stacked_cobblestone_blocks", BlockRegistry.STACKED_COBBLESTONE_BLOCKS);

    // Stacked Netherrack Blocks Item
    public static final DeferredItem<BlockItem> STACKED_NETHERRACK_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("stacked_netherrack_blocks", BlockRegistry.STACKED_NETHERRACK_BLOCKS);

    // Stacked Bricks Item
    public static final DeferredItem<BlockItem> STACKED_BRICKS_ITEM = ITEMS.registerSimpleBlockItem("stacked_bricks", BlockRegistry.STACKED_BRICKS);

    // Stacked Melons Item
    public static final DeferredItem<BlockItem> STACKED_MELONS_ITEM = ITEMS.registerSimpleBlockItem("stacked_melons", BlockRegistry.STACKED_MELONS);

    // Stacked Pumpkins Item
    public static final DeferredItem<BlockItem> STACKED_PUMPKINS_ITEM = ITEMS.registerSimpleBlockItem("stacked_pumpkins", BlockRegistry.STACKED_PUMPKINS);

    // Stacked Oak Logs Item
    public static final DeferredItem<BlockItem> STACKED_OAK_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_oak_logs", BlockRegistry.STACKED_OAK_LOGS);

    // Stacked Stripped Oak Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_OAK_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_oak_logs", BlockRegistry.STACKED_STRIPPED_OAK_LOGS);

    // Stacked Spruce Logs Item
    public static final DeferredItem<BlockItem> STACKED_SPRUCE_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_spruce_logs", BlockRegistry.STACKED_SPRUCE_LOGS);

    // Stacked Stripped Spruce Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_SPRUCE_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_spruce_logs", BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS);

    // Stacked Birch Logs Item
    public static final DeferredItem<BlockItem> STACKED_BIRCH_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_birch_logs", BlockRegistry.STACKED_BIRCH_LOGS);

    // Stacked Stripped Birch Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_BIRCH_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_birch_logs", BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS);

    // Stacked Jungle Logs Item
    public static final DeferredItem<BlockItem> STACKED_JUNGLE_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_jungle_logs", BlockRegistry.STACKED_JUNGLE_LOGS);

    // Stacked Stripped Jungle Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_JUNGLE_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_jungle_logs", BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS);

    // Stacked Acacia Logs Item
    public static final DeferredItem<BlockItem> STACKED_ACACIA_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_acacia_logs", BlockRegistry.STACKED_ACACIA_LOGS);

    // Stacked Stripped Acacia Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_ACACIA_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_acacia_logs", BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS);

    // Stacked Dark Oak Logs Item
    public static final DeferredItem<BlockItem> STACKED_DARK_OAK_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_dark_oak_logs", BlockRegistry.STACKED_DARK_OAK_LOGS);

    // Stacked Stripped Dark Oak Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_DARK_OAK_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_dark_oak_logs", BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS);

    // Stacked Mangrove Logs Item
    public static final DeferredItem<BlockItem> STACKED_MANGROVE_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_mangrove_logs", BlockRegistry.STACKED_MANGROVE_LOGS);

    // Stacked Stripped Mangrove Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_MANGROVE_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_mangrove_logs", BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS);

    // Stacked Cherry Logs Item
    public static final DeferredItem<BlockItem> STACKED_CHERRY_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_cherry_logs", BlockRegistry.STACKED_CHERRY_LOGS);

    // Stacked Stripped Cherry Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_CHERRY_LOGS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_cherry_logs", BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS);

    // Stacked Bamboo Logs Item
    public static final DeferredItem<BlockItem> STACKED_BAMBOO_BLOCKS_ITEM = ITEMS.registerSimpleBlockItem("stacked_bamboo_blocks", BlockRegistry.STACKED_BAMBOO_BLOCKS);

    // Stacked Stripped Bamboo Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_BAMBOO_BLOCKS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_bamboo_blocks", BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS);

    // Stacked Crimson Logs Item
    public static final DeferredItem<BlockItem> STACKED_CRIMSON_STEMS_ITEM = ITEMS.registerSimpleBlockItem("stacked_crimson_stems", BlockRegistry.STACKED_CRIMSON_STEMS);

    // Stacked Stripped Crimson Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_CRIMSON_STEMS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_crimson_stems", BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS);

    // Stacked Warped Logs Item
    public static final DeferredItem<BlockItem> STACKED_WARPED_STEMS_ITEM = ITEMS.registerSimpleBlockItem("stacked_warped_stems", BlockRegistry.STACKED_WARPED_STEMS);

    // Stacked Stripped Warped Logs Item
    public static final DeferredItem<BlockItem> STACKED_STRIPPED_WARPED_STEMS_ITEM = ITEMS.registerSimpleBlockItem("stacked_stripped_warped_stems", BlockRegistry.STACKED_STRIPPED_WARPED_STEMS);

}
