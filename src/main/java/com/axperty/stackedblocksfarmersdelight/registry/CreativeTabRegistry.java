package com.axperty.stackedblocksfarmersdelight.registry;

import com.axperty.stackedblocksfarmersdelight.StackedBlocksFarmersDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StackedBlocksFarmersDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STACKEDBLOCKSFARMERSDELIGHT_TAB = CREATIVE_MODE_TABS.register("stackedblocksfarmersdelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.stackedblocksfarmersdelight"))
            .icon(() -> ItemRegistry.STACKED_RICH_SOIL_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                output.accept(BlockRegistry.STACKED_RICH_SOIL.get());
                output.accept(BlockRegistry.STACKED_STONE_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_COBBLESTONE_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_NETHERRACK_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_BRICKS.get());

                output.accept(BlockRegistry.STACKED_RAW_IRON_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_RAW_GOLD_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_RAW_COPPER_BLOCKS.get());

                output.accept(BlockRegistry.STACKED_LAPIS_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_REDSTONE_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_COAL_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_IRON_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_GOLD_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_EMERALD_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_DIAMOND_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_NETHERITE_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_QUARTZ_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_MELONS.get());
                output.accept(BlockRegistry.STACKED_PUMPKINS.get());

                output.accept(BlockRegistry.STACKED_OAK_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_OAK_LOGS.get());
                output.accept(BlockRegistry.STACKED_OAK_PLANKS.get());

                output.accept(BlockRegistry.STACKED_SPRUCE_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS.get());
                output.accept(BlockRegistry.STACKED_SPRUCE_PLANKS.get());

                output.accept(BlockRegistry.STACKED_BIRCH_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS.get());
                output.accept(BlockRegistry.STACKED_BIRCH_PLANKS.get());

                output.accept(BlockRegistry.STACKED_JUNGLE_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS.get());
                output.accept(BlockRegistry.STACKED_JUNGLE_PLANKS.get());

                output.accept(BlockRegistry.STACKED_ACACIA_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS.get());
                output.accept(BlockRegistry.STACKED_ACACIA_PLANKS.get());

                output.accept(BlockRegistry.STACKED_DARK_OAK_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS.get());
                output.accept(BlockRegistry.STACKED_DARK_OAK_PLANKS.get());

                output.accept(BlockRegistry.STACKED_MANGROVE_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS.get());
                output.accept(BlockRegistry.STACKED_MANGROVE_PLANKS.get());

                output.accept(BlockRegistry.STACKED_CHERRY_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS.get());
                output.accept(BlockRegistry.STACKED_CHERRY_PLANKS.get());

                output.accept(BlockRegistry.STACKED_BAMBOO_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_BAMBOO_PLANKS.get());

                output.accept(BlockRegistry.STACKED_CRIMSON_STEMS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS.get());
                output.accept(BlockRegistry.STACKED_CRIMSON_PLANKS.get());

                output.accept(BlockRegistry.STACKED_WARPED_STEMS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS.get());
                output.accept(BlockRegistry.STACKED_WARPED_PLANKS.get());


            }).build());
}
