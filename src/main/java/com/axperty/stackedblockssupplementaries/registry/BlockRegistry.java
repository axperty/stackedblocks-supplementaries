package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.mehvahdjukaar.supplementaries.reg.ModRegistry;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StackedBlocksSupplementaries.MOD_ID);

    // Stacked Stone Blocks
    public static final DeferredBlock<Block> STACKED_STONE_TILES = BLOCKS.registerSimpleBlock("stacked_stone_tiles",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.WOOD));

    // Stacked Stone Blocks (Rope)
    public static final DeferredBlock<Block> STACKED_STONE_TILES_ROPE = BLOCKS.registerSimpleBlock("stacked_stone_tiles_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.WOOD));

    // Stacked Gravel Bricks
    public static final DeferredBlock<Block> STACKED_GRAVEL_BRICKS = BLOCKS.registerSimpleBlock("stacked_gravel_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).mapColor(MapColor.WOOD).sound(SoundType.STONE));

    // Stacked Gravel Bricks (Rope)
    public static final DeferredBlock<Block> STACKED_GRAVEL_BRICKS_ROPE = BLOCKS.registerSimpleBlock("stacked_gravel_bricks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).mapColor(MapColor.WOOD).sound(SoundType.STONE));

    // Stacked Ash Bricks
    public static final DeferredBlock<Block> STACKED_ASH_BRICKS = BLOCKS.registerSimpleBlock("stacked_ash_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.WOOD));

    // Stacked Ash Bricks (Rope)
    public static final DeferredBlock<Block> STACKED_ASH_BRICKS_ROPE = BLOCKS.registerSimpleBlock("stacked_ash_bricks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.WOOD));

    // Stacked Lapis Bricks
    public static final DeferredBlock<Block> STACKED_LAPIS_BRICKS = BLOCKS.registerSimpleBlock("stacked_lapis_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).mapColor(MapColor.WOOD).sound(SoundType.DEEPSLATE_TILES));

    // Stacked Lapis Bricks (Rope)
    public static final DeferredBlock<Block> STACKED_LAPIS_BRICKS_ROPE = BLOCKS.registerSimpleBlock("stacked_lapis_bricks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).mapColor(MapColor.WOOD).sound(SoundType.DEEPSLATE_TILES));

    // Stacked Soap Blocks
    public static final DeferredBlock<Block> STACKED_SOAP_BLOCKS = BLOCKS.registerSimpleBlock("stacked_soap_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                    .friction(0.94f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .mapColor(DyeColor.PINK)
                    .pushReaction(PushReaction.PUSH_ONLY)
                    .strength(1.25F, 4.0F)
                    .sound(SoundType.CORAL_BLOCK));

    // Stacked Soap Blocks (Rope)
    public static final DeferredBlock<Block> STACKED_SOAP_BLOCKS_ROPE = BLOCKS.registerSimpleBlock("stacked_soap_blocks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
                    .friction(0.94f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .mapColor(DyeColor.PINK)
                    .pushReaction(PushReaction.PUSH_ONLY)
                    .strength(1.25F, 4.0F)
                    .sound(SoundType.CORAL_BLOCK));

    // Stacked Blackstone Tiles
    public static final DeferredBlock<Block> STACKED_BLACKSTONE_TILES = BLOCKS.registerSimpleBlock("stacked_blackstone_tiles",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).mapColor(MapColor.WOOD));

    // Stacked Blackstone Tiles (Rope)
    public static final DeferredBlock<Block> STACKED_BLACKSTONE_TILES_ROPE = BLOCKS.registerSimpleBlock("stacked_blackstone_tiles_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).mapColor(MapColor.WOOD));

    // Stacked Checker Blocks
    public static final DeferredBlock<Block> STACKED_CHECKER_BLOCKS = BLOCKS.registerSimpleBlock("stacked_checker_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.WOOD));

    // Stacked Checker Blocks (Rope)
    public static final DeferredBlock<Block> STACKED_CHECKER_BLOCKS_ROPE = BLOCKS.registerSimpleBlock("stacked_checker_blocks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.WOOD));

    // Stacked Fine Wood
    public static final DeferredBlock<Block> STACKED_FINE_WOOD = BLOCKS.registerSimpleBlock("stacked_fine_wood",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Fine Wood (Rope)
    public static final DeferredBlock<Block> STACKED_FINE_WOOD_ROPE = BLOCKS.registerSimpleBlock("stacked_fine_wood_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Daub
    public static final DeferredBlock<Block> STACKED_DAUB = BLOCKS.registerSimpleBlock("stacked_daub",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)
                    .sound(SoundType.PACKED_MUD)
                    .mapColor(DyeColor.WHITE)
                    .strength(1.5f, 3f));

    // Stacked Daub (Rope)
    public static final DeferredBlock<Block> STACKED_DAUB_ROPE = BLOCKS.registerSimpleBlock("stacked_daub_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)
                    .sound(SoundType.PACKED_MUD)
                    .mapColor(DyeColor.WHITE)
                    .strength(1.5f, 3f));

    // Stacked Feather Blocks
    public static final DeferredBlock<Block> STACKED_FEATHER_BLOCKS = BLOCKS.registerSimpleBlock("stacked_feather_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                    .strength(0.5f));

    // Stacked Feather Blocks (Rope)
    public static final DeferredBlock<Block> STACKED_FEATHER_BLOCKS_ROPE = BLOCKS.registerSimpleBlock("stacked_feather_blocks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)
                    .strength(0.5f));

    // Stacked Fodder
    public static final DeferredBlock<Block> STACKED_FODDER = BLOCKS.registerSimpleBlock("stacked_fodder",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK).pushReaction(PushReaction.NORMAL));

    // Stacked Fodder (Rope)
    public static final DeferredBlock<Block> STACKED_FODDER_ROPE = BLOCKS.registerSimpleBlock("stacked_fodder_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MOSS_BLOCK).pushReaction(PushReaction.NORMAL));

    // Stacked Flint Blocks
    public static final DeferredBlock<Block> STACKED_FLINT_BLOCKS = BLOCKS.registerSimpleBlock("stacked_flint_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).strength(2F, 7.5F));

    // Stacked Flint Blocks (Rope)
    public static final DeferredBlock<Block> STACKED_FLINT_BLOCKS_ROPE = BLOCKS.registerSimpleBlock("stacked_flint_blocks_rope",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).strength(2F, 7.5F));

}
