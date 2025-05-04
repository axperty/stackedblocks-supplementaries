package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StackedBlocksSupplementaries.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STACKEDBLOCKSSUPPLEMENTARIES_TAB = CREATIVE_MODE_TABS.register("stackedblockssupplementaries_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.stackedblockssupplementaries"))
            .icon(() -> ItemRegistry.STACKED_FINE_WOOD_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                output.accept(BlockRegistry.STACKED_STONE_TILES.get());
                output.accept(BlockRegistry.STACKED_GRAVEL_BRICKS.get());
                output.accept(BlockRegistry.STACKED_ASH_BRICKS.get());
                output.accept(BlockRegistry.STACKED_LAPIS_BRICKS.get());
                output.accept(BlockRegistry.STACKED_SOAP_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_BLACKSTONE_TILES.get());
                output.accept(BlockRegistry.STACKED_CHECKER_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_FINE_WOOD.get());
                output.accept(BlockRegistry.STACKED_DAUB.get());
                output.accept(BlockRegistry.STACKED_FEATHER_BLOCKS.get());
                output.accept(BlockRegistry.STACKED_FODDER.get());
                output.accept(BlockRegistry.STACKED_FLINT_BLOCKS.get());


            }).build());
}
