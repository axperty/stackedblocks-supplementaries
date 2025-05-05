package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StackedBlocksSupplementaries.MOD_ID);

    // Stacked Stone Tiles
    public static final RegistryObject<Block> STACKED_STONE_TILES = BLOCKS.register("stacked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    // Stacked Ash Bricks
    public static final RegistryObject<Block> STACKED_ASH_BRICKS = BLOCKS.register("stacked_ash_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    // Stacked Lapis Bricks
    public static final RegistryObject<Block> STACKED_LAPIS_BRICKS = BLOCKS.register("stacked_lapis_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.DEEPSLATE_TILES)));

    // Stacked Soap Blocks
    public static final RegistryObject<Block> STACKED_SOAP_BLOCKS = BLOCKS.register("stacked_soap_blocks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .friction(0.94f)
                    .strength(1.25F, 4.0F)
                    .sound(SoundType.CORAL_BLOCK)));

    // Stacked Blackstone Tiles
    public static final RegistryObject<Block> STACKED_BLACKSTONE_TILES = BLOCKS.register("stacked_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

    // Stacked Checker Blocks
    public static final RegistryObject<Block> STACKED_CHECKER_BLOCKS = BLOCKS.register("stacked_checker_blocks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Stacked Daub
    public static final RegistryObject<Block> STACKED_DAUB = BLOCKS.register("stacked_daub",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .sound(SoundType.PACKED_MUD)
                    .strength(1.5f, 3f)));

    // Stacked Feather Blocks
    public static final RegistryObject<Block> STACKED_FEATHER_BLOCKS = BLOCKS.register("stacked_feather_blocks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)
                    .strength(0.5f)));

    // Stacked Fodder
    public static final RegistryObject<Block> STACKED_FODDER = BLOCKS.register("stacked_fodder",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));

    // Stacked Flint Blocks
    public static final RegistryObject<Block> STACKED_FLINT_BLOCKS = BLOCKS.register("stacked_flint_blocks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)
                    .strength(2F, 7.5F)));
}