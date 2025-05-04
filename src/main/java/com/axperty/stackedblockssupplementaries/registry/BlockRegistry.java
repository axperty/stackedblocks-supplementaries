package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StackedBlocksSupplementaries.MOD_ID);

    // Stacked Stone Tiles
    public static final RegistryObject<Block> STACKED_STONE_TILES = registerBlock("stacked_stone_tiles",
            () -> new Block(Block.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WOOD)));

    // Stacked Gravel Bricks
    public static final RegistryObject<Block> STACKED_GRAVEL_BRICKS = registerBlock("stacked_gravel_bricks",
            () -> new Block(Block.Properties.copy(Blocks.GRAVEL).mapColor(MapColor.WOOD).sound(SoundType.STONE)));

    // Stacked Ash Bricks
    public static final RegistryObject<Block> STACKED_ASH_BRICKS = registerBlock("stacked_ash_bricks",
            () -> new Block(Block.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WOOD)));

    // Stacked Lapis Bricks
    public static final RegistryObject<Block> STACKED_LAPIS_BRICKS = registerBlock("stacked_lapis_bricks",
            () -> new Block(Block.Properties.copy(Blocks.LAPIS_BLOCK).mapColor(MapColor.WOOD).sound(SoundType.DEEPSLATE_TILES)));

    // Stacked Soap Blocks
    public static final RegistryObject<Block> STACKED_SOAP_BLOCKS = registerBlock("stacked_soap_blocks",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)
                    .friction(0.94f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .mapColor(DyeColor.PINK)
                    .pushReaction(PushReaction.PUSH_ONLY)
                    .strength(1.25F, 4.0F)
                    .sound(SoundType.CORAL_BLOCK)));

    // Stacked Blackstone Tiles
    public static final RegistryObject<Block> STACKED_BLACKSTONE_TILES = registerBlock("stacked_blackstone_tiles",
            () -> new Block(Block.Properties.copy(Blocks.BLACKSTONE).mapColor(MapColor.WOOD)));

    // Stacked Checker Blocks
    public static final RegistryObject<Block> STACKED_CHECKER_BLOCKS = registerBlock("stacked_checker_blocks",
            () -> new Block(Block.Properties.copy(Blocks.STONE).mapColor(MapColor.WOOD)));

    // Stacked Fine Wood
    public static final RegistryObject<Block> STACKED_FINE_WOOD = registerBlock("stacked_fine_wood",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD)));

    // Stacked Daub
    public static final RegistryObject<Block> STACKED_DAUB = registerBlock("stacked_daub",
            () -> new Block(Block.Properties.copy(Blocks.DIRT)
                    .sound(SoundType.PACKED_MUD)
                    .mapColor(DyeColor.WHITE)
                    .strength(1.5f, 3f)));

    // Stacked Feather Blocks
    public static final RegistryObject<Block> STACKED_FEATHER_BLOCKS = registerBlock("stacked_feather_blocks",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL).strength(0.5f)));

    // Stacked Fodder
    public static final RegistryObject<Block> STACKED_FODDER = registerBlock("stacked_fodder",
            () -> new Block(Block.Properties.copy(Blocks.MOSS_BLOCK).pushReaction(PushReaction.NORMAL)));

    // Stacked Flint Blocks
    public static final RegistryObject<Block> STACKED_FLINT_BLOCKS = registerBlock("stacked_flint_blocks",
            () -> new Block(Block.Properties.copy(Blocks.COAL_BLOCK).strength(2F, 7.5F)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
