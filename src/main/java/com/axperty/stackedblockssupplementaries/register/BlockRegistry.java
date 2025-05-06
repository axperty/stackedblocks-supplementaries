package com.axperty.stackedblockssupplementaries.register;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    // Stacked Stone Tiles
    public static final Block STACKED_STONE_TILES = registerBlock("stacked_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stone Tiles (Rope)
    public static final Block STACKED_STONE_TILES_ROPE = registerBlock("stacked_stone_tiles_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Ash Bricks
    public static final Block STACKED_ASH_BRICKS = registerBlock("stacked_ash_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Ash Bricks (Rope)
    public static final Block STACKED_ASH_BRICKS_ROPE = registerBlock("stacked_ash_bricks_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Lapis Bricks
    public static final Block STACKED_LAPIS_BRICKS = registerBlock("stacked_lapis_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.DEEPSLATE_TILES)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Lapis Bricks (Rope)
    public static final Block STACKED_LAPIS_BRICKS_ROPE = registerBlock("stacked_lapis_bricks_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.DEEPSLATE_TILES)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Soap Blocks
    public static final Block STACKED_SOAP_BLOCKS = registerBlock("stacked_soap_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).slipperiness(0.94f).mapColor(DyeColor.PINK).strength(1.25F, 4.0F).sounds(BlockSoundGroup.CORAL)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Soap Blocks (Rope)
    public static final Block STACKED_SOAP_BLOCKS_ROPE = registerBlock("stacked_soap_blocks_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).slipperiness(0.94f).mapColor(DyeColor.PINK).strength(1.25F, 4.0F).sounds(BlockSoundGroup.CORAL)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Blackstone Tiles
    public static final Block STACKED_BLACKSTONE_TILES = registerBlock("stacked_blackstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Blackstone Tiles (Rope)
    public static final Block STACKED_BLACKSTONE_TILES_ROPE = registerBlock("stacked_blackstone_tiles_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Checker Blocks
    public static final Block STACKED_CHECKER_BLOCKS = registerBlock("stacked_checker_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Checker Blocks (Rope)
    public static final Block STACKED_CHECKER_BLOCKS_ROPE = registerBlock("stacked_checker_blocks_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OAK_TAN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Daub
    public static final Block STACKED_DAUB = registerBlock("stacked_daub",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5f, 3.0f)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Daub (Rope)
    public static final Block STACKED_DAUB_ROPE = registerBlock("stacked_daub_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.PACKED_MUD).mapColor(DyeColor.WHITE).strength(1.5f, 3.0f)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Feather Blocks
    public static final Block STACKED_FEATHER_BLOCKS = registerBlock("stacked_feather_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(0.5f)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Feather Blocks (Rope)
    public static final Block STACKED_FEATHER_BLOCKS_ROPE = registerBlock("stacked_feather_blocks_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(0.5f)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Fodder
    public static final Block STACKED_FODDER = registerBlock("stacked_fodder",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Fodder (Rope)
    public static final Block STACKED_FODDER_ROPE = registerBlock("stacked_fodder_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Flint Blocks
    public static final Block STACKED_FLINT_BLOCKS = registerBlock("stacked_flint_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).strength(2.0F, 7.5F)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Flint Blocks (Rope)
    public static final Block STACKED_FLINT_BLOCKS_ROPE = registerBlock("stacked_flint_blocks_rope",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).strength(2.0F, 7.5F)), CreativeModTab.CREATIVE_MODE_TAB);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(StackedBlocksSupplementaries.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(StackedBlocksSupplementaries.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        StackedBlocksSupplementaries.LOGGER.debug("Registering mod blocks for " + StackedBlocksSupplementaries.MOD_ID);
    }
}
