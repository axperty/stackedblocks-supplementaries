package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StackedBlocks.MOD_ID);

    // Stacked Melons
    public static final DeferredBlock<Block> STACKED_MELONS = BLOCKS.registerSimpleBlock("stacked_melons",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Pumpkins
    public static final DeferredBlock<Block> STACKED_PUMPKINS = BLOCKS.registerSimpleBlock("stacked_pumpkins",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Acacia Logs
    public static final DeferredBlock<Block> STACKED_ACACIA_LOGS = BLOCKS.registerSimpleBlock("stacked_acacia_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Acacia Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_ACACIA_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_acacia_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Oak Logs
    public static final DeferredBlock<Block> STACKED_OAK_LOGS = BLOCKS.registerSimpleBlock("stacked_oak_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_OAK_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_oak_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));
}
