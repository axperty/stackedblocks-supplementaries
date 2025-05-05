package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.minecraft.world.item.*;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StackedBlocksSupplementaries.MOD_ID);

    private static final Item.Properties DEFAULT_PROPS = new Item.Properties();

    // Stacked Stone Tiles
    public static final RegistryObject<Item> STACKED_STONE_TILES_ITEM = ITEMS.register("stacked_stone_tiles",
            () -> new BlockItem(BlockRegistry.STACKED_STONE_TILES.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Ash Bricks
    public static final RegistryObject<Item> STACKED_ASH_BRICKS_ITEM = ITEMS.register("stacked_ash_bricks",
            () -> new BlockItem(BlockRegistry.STACKED_ASH_BRICKS.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Lapis Bricks
    public static final RegistryObject<Item> STACKED_LAPIS_BRICKS_ITEM = ITEMS.register("stacked_lapis_bricks",
            () -> new BlockItem(BlockRegistry.STACKED_LAPIS_BRICKS.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Soap Blocks
    public static final RegistryObject<Item> STACKED_SOAP_BLOCKS_ITEM = ITEMS.register("stacked_soap_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_SOAP_BLOCKS.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Blackstone Tiles
    public static final RegistryObject<Item> STACKED_BLACKSTONE_TILES_ITEM = ITEMS.register("stacked_blackstone_tiles",
            () -> new BlockItem(BlockRegistry.STACKED_BLACKSTONE_TILES.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Checker Blocks
    public static final RegistryObject<Item> STACKED_CHECKER_BLOCKS_ITEM = ITEMS.register("stacked_checker_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_CHECKER_BLOCKS.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Daub
    public static final RegistryObject<Item> STACKED_DAUB_ITEM = ITEMS.register("stacked_daub",
            () -> new BlockItem(BlockRegistry.STACKED_DAUB.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Feather Blocks
    public static final RegistryObject<Item> STACKED_FEATHER_BLOCKS_ITEM = ITEMS.register("stacked_feather_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_FEATHER_BLOCKS.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Fodder
    public static final RegistryObject<Item> STACKED_FODDER_ITEM = ITEMS.register("stacked_fodder",
            () -> new BlockItem(BlockRegistry.STACKED_FODDER.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    // Stacked Flint Blocks
    public static final RegistryObject<Item> STACKED_FLINT_BLOCKS_ITEM = ITEMS.register("stacked_flint_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_FLINT_BLOCKS.get(), new Item.Properties().tab(StackedBlocksSupplementaries.ITEM_GROUP)));

    private static Item.Properties addToTabIfLoaded(Item.Properties properties, String modId) {
        return ModList.get().isLoaded(modId) ? properties.tab(StackedBlocksSupplementaries.ITEM_GROUP) : properties;
    }
}