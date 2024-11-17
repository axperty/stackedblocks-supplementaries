package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StackedBlocks.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STACKEDBLOCKS_TAB = CREATIVE_MODE_TABS.register("stackedblocks_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.stackedblocks"))
            .icon(() -> ItemRegistry.STACKED_MELONS_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                output.accept(BlockRegistry.STACKED_MELONS.get());
                output.accept(BlockRegistry.STACKED_PUMPKINS.get());
                output.accept(BlockRegistry.STACKED_ACACIA_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS.get());
                output.accept(BlockRegistry.STACKED_OAK_LOGS.get());
                output.accept(BlockRegistry.STACKED_STRIPPED_OAK_LOGS.get());

            }).build());
}
