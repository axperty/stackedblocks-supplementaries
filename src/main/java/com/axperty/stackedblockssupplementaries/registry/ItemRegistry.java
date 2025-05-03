package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.BlockItem;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StackedBlocksSupplementaries.MOD_ID);

    // Stacked Stone Tiles Item
    public static final DeferredItem<BlockItem> STACKED_STONE_TILES_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_stone_tiles", BlockRegistry.STACKED_STONE_TILES);

    // Stacked Gravel Bricks Item
    public static final DeferredItem<BlockItem> STACKED_GRAVEL_BRICKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_gravel_bricks", BlockRegistry.STACKED_GRAVEL_BRICKS);

    // Stacked Ash Bricks Item
    public static final DeferredItem<BlockItem> STACKED_ASH_BRICKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_ash_bricks", BlockRegistry.STACKED_ASH_BRICKS);

    // Stacked Lapis Bricks Item
    public static final DeferredItem<BlockItem> STACKED_LAPIS_BRICKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_lapis_bricks", BlockRegistry.STACKED_LAPIS_BRICKS);

    // Stacked Soap Blocks Item
    public static final DeferredItem<BlockItem> STACKED_SOAP_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_soap_blocks", BlockRegistry.STACKED_SOAP_BLOCKS);

    // Stacked Blackstone Tiles Item
    public static final DeferredItem<BlockItem> STACKED_BLACKSTONE_TILES_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_blackstone_tiles", BlockRegistry.STACKED_BLACKSTONE_TILES);

    // Stacked Checker Blocks Item
    public static final DeferredItem<BlockItem> STACKED_CHECKER_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_checker_blocks", BlockRegistry.STACKED_CHECKER_BLOCKS);

    // Stacked Fine Wood Item
    public static final DeferredItem<BlockItem> STACKED_FINE_WOOD_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_fine_wood", BlockRegistry.STACKED_FINE_WOOD);

    // Stacked Daub Item
    public static final DeferredItem<BlockItem> STACKED_DAUB_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_daub", BlockRegistry.STACKED_DAUB);

    // Stacked Feather Blocks Item
    public static final DeferredItem<BlockItem> STACKED_FEATHER_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_feather_blocks", BlockRegistry.STACKED_FEATHER_BLOCKS);

    // Stacked Fodder Item
    public static final DeferredItem<BlockItem> STACKED_FODDER_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_fodder", BlockRegistry.STACKED_FODDER);

    // Stacked Flint Blocks Item
    public static final DeferredItem<BlockItem> STACKED_FLINT_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_flint_blocks", BlockRegistry.STACKED_FLINT_BLOCKS);
}

