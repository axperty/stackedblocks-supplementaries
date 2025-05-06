package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.mehvahdjukaar.moonlight.api.misc.ModSoundType;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    // Stacked Stone Tiles
    public static final Block STACKED_STONE_TILES = registerBlock("stacked_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)));

    // Stacked Stone Tiles (Rope)
    public static final Block STACKED_STONE_TILES_ROPE = registerBlock("stacked_stone_tiles_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)));

    // Stacked Gravel Bricks
    public static final Block STACKED_GRAVEL_BRICKS = registerBlock("stacked_gravel_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAVEL).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.STONE)));

    // Stacked Gravel Bricks (Rope)
    public static final Block STACKED_GRAVEL_BRICKS_ROPE = registerBlock("stacked_gravel_bricks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAVEL).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.STONE)));

    // Stacked Ash Bricks
    public static final Block STACKED_ASH_BRICKS = registerBlock("stacked_ash_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)));

    // Stacked Ash Bricks (Rope)
    public static final Block STACKED_ASH_BRICKS_ROPE = registerBlock("stacked_ash_bricks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.OAK_TAN)));

    // Stacked Lapis Bricks
    public static final Block STACKED_LAPIS_BRICKS = registerBlock("stacked_lapis_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    // Stacked Lapis Bricks (Rope)
    public static final Block STACKED_LAPIS_BRICKS_ROPE = registerBlock("stacked_lapis_bricks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    // Stacked Soap Blocks
    public static final Block STACKED_SOAP_BLOCKS = registerBlock("stacked_soap_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .slipperiness(0.94f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .mapColor(DyeColor.PINK)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)
                    .strength(1.25F, 4.0F)
                    .sounds(BlockSoundGroup.CORAL)
            ));

    // Stacked Soap Blocks (Rope)
    public static final Block STACKED_SOAP_BLOCKS_ROPE = registerBlock("stacked_soap_blocks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .slipperiness(0.94f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .mapColor(DyeColor.PINK)
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)
                    .strength(1.25F, 4.0F)
                    .sounds(BlockSoundGroup.CORAL)
            ));

    // Stacked Blackstone Tiles
    public static final Block STACKED_BLACKSTONE_TILES = registerBlock("stacked_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).mapColor(MapColor.OAK_TAN)));

    // Stacked Blackstone Tiles (Rope)
    public static final Block STACKED_BLACKSTONE_TILES_ROPE = registerBlock("stacked_blackstone_tiles_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).mapColor(MapColor.OAK_TAN)));

    // Stacked Checker Blocks
    public static final Block STACKED_CHECKER_BLOCKS = registerBlock("stacked_checker_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.OAK_TAN)));

    // Stacked Checker Blocks (Rope)
    public static final Block STACKED_CHECKER_BLOCKS_ROPE = registerBlock("stacked_checker_blocks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).mapColor(MapColor.OAK_TAN)));

    // Stacked Fine Wood
    public static final Block STACKED_FINE_WOOD = registerBlock("stacked_fine_wood",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.OAK_TAN)));

    // Stacked Fine Wood (Rope)
    public static final Block STACKED_FINE_WOOD_ROPE = registerBlock("stacked_fine_wood_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.OAK_TAN)));

    // Stacked Daub
    public static final Block STACKED_DAUB = registerBlock("stacked_daub",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)
                    .sounds(ModSoundType.PACKED_MUD) // Assuming ModSoundType exists
                    .mapColor(DyeColor.WHITE)
                    .strength(1.5f, 3.0f)
            ));

    // Stacked Daub (Rope)
    public static final Block STACKED_DAUB_ROPE = registerBlock("stacked_daub_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT)
                    .sounds(ModSoundType.PACKED_MUD) // Assuming ModSoundType exists
                    .mapColor(DyeColor.WHITE)
                    .strength(1.5f, 3.0f)
            ));

    // Stacked Feather Blocks
    public static final Block STACKED_FEATHER_BLOCKS = registerBlock("stacked_feather_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)
                    .strength(0.5f)
            ));

    // Stacked Feather Blocks (Rope)
    public static final Block STACKED_FEATHER_BLOCKS_ROPE = registerBlock("stacked_feather_blocks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)
                    .strength(0.5f)
            ));

    // Stacked Fodder
    public static final Block STACKED_FODDER = registerBlock("stacked_fodder",
            new Block(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.NORMAL)
            ));

    // Stacked Fodder (Rope)
    public static final Block STACKED_FODDER_ROPE = registerBlock("stacked_fodder_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.NORMAL)
            ));

    // Stacked Flint Blocks
    public static final Block STACKED_FLINT_BLOCKS = registerBlock("stacked_flint_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)
                    .strength(2.0F, 7.5F)
            ));

    // Stacked Flint Blocks (Rope)
    public static final Block STACKED_FLINT_BLOCKS_ROPE = registerBlock("stacked_flint_blocks_rope",
            new Block(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)
                    .strength(2.0F, 7.5F)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.tryParse(StackedBlocksSupplementaries.MODID + ":" + name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(StackedBlocksSupplementaries.MODID + ":" + name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        StackedBlocksSupplementaries.LOGGER.info("Registering mod blocks for " + StackedBlocksSupplementaries.MODID);
    }
}