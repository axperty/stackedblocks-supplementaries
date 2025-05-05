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
    public static final DeferredItem<BlockItem> STACKED_STONE_TILES_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_stone_tiles_rope", BlockRegistry.STACKED_STONE_TILES_ROPE);

    // Stacked Gravel Bricks Item
    public static final DeferredItem<BlockItem> STACKED_GRAVEL_BRICKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_gravel_bricks", BlockRegistry.STACKED_GRAVEL_BRICKS);
    public static final DeferredItem<BlockItem> STACKED_GRAVEL_BRICKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_gravel_bricks_rope", BlockRegistry.STACKED_GRAVEL_BRICKS_ROPE);

    // Stacked Ash Bricks Item
    public static final DeferredItem<BlockItem> STACKED_ASH_BRICKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_ash_bricks", BlockRegistry.STACKED_ASH_BRICKS);
    public static final DeferredItem<BlockItem> STACKED_ASH_BRICKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_ash_bricks_rope", BlockRegistry.STACKED_ASH_BRICKS_ROPE);

    // Stacked Lapis Bricks Item
    public static final DeferredItem<BlockItem> STACKED_LAPIS_BRICKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_lapis_bricks", BlockRegistry.STACKED_LAPIS_BRICKS);
    public static final DeferredItem<BlockItem> STACKED_LAPIS_BRICKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_lapis_bricks_rope", BlockRegistry.STACKED_LAPIS_BRICKS_ROPE);

    // Stacked Soap Blocks Item
    public static final DeferredItem<BlockItem> STACKED_SOAP_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_soap_blocks", BlockRegistry.STACKED_SOAP_BLOCKS);
    public static final DeferredItem<BlockItem> STACKED_SOAP_BLOCKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_soap_blocks_rope", BlockRegistry.STACKED_SOAP_BLOCKS_ROPE);

    // Stacked Blackstone Tiles Item
    public static final DeferredItem<BlockItem> STACKED_BLACKSTONE_TILES_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_blackstone_tiles", BlockRegistry.STACKED_BLACKSTONE_TILES);
    public static final DeferredItem<BlockItem> STACKED_BLACKSTONE_TILES_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_blackstone_tiles_rope", BlockRegistry.STACKED_BLACKSTONE_TILES_ROPE);

    // Stacked Checker Blocks Item
    public static final DeferredItem<BlockItem> STACKED_CHECKER_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_checker_blocks", BlockRegistry.STACKED_CHECKER_BLOCKS);
    public static final DeferredItem<BlockItem> STACKED_CHECKER_BLOCKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_checker_blocks_rope", BlockRegistry.STACKED_CHECKER_BLOCKS_ROPE);

    // Stacked Fine Wood Item
    public static final DeferredItem<BlockItem> STACKED_FINE_WOOD_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_fine_wood", BlockRegistry.STACKED_FINE_WOOD);
    public static final DeferredItem<BlockItem> STACKED_FINE_WOOD_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_fine_wood_rope", BlockRegistry.STACKED_FINE_WOOD_ROPE);

    // Stacked Daub Item
    public static final DeferredItem<BlockItem> STACKED_DAUB_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_daub", BlockRegistry.STACKED_DAUB);
    public static final DeferredItem<BlockItem> STACKED_DAUB_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_daub_rope", BlockRegistry.STACKED_DAUB_ROPE);

    // Stacked Feather Blocks Item
    public static final DeferredItem<BlockItem> STACKED_FEATHER_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_feather_blocks", BlockRegistry.STACKED_FEATHER_BLOCKS);
    public static final DeferredItem<BlockItem> STACKED_FEATHER_BLOCKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_feather_blocks_rope", BlockRegistry.STACKED_FEATHER_BLOCKS_ROPE);

    // Stacked Fodder Item
    public static final DeferredItem<BlockItem> STACKED_FODDER_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_fodder", BlockRegistry.STACKED_FODDER);
    public static final DeferredItem<BlockItem> STACKED_FODDER_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_fodder_rope", BlockRegistry.STACKED_FODDER_ROPE);

    // Stacked Flint Blocks Item
    public static final DeferredItem<BlockItem> STACKED_FLINT_BLOCKS_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_flint_blocks", BlockRegistry.STACKED_FLINT_BLOCKS);
    public static final DeferredItem<BlockItem> STACKED_FLINT_BLOCKS_ROPE_ITEM =
            ITEMS.registerSimpleBlockItem("stacked_flint_blocks_rope", BlockRegistry.STACKED_FLINT_BLOCKS_ROPE);
}

