package com.axperty.stackedblockssupplementaries.registry;

import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StackedBlocksSupplementaries.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STACKEDBLOCKSSUPPLEMENTARIES_TAB = CREATIVE_MODE_TABS.register("stackedblockssupplementaries_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistry.STACKED_FINE_WOOD.get()))
                    .title(Component.translatable("itemGroup.stackedblockssupplementaries"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(BlockRegistry.STACKED_STONE_TILES.get());
                        pOutput.accept(BlockRegistry.STACKED_GRAVEL_BRICKS.get());
                        pOutput.accept(BlockRegistry.STACKED_ASH_BRICKS.get());
                        pOutput.accept(BlockRegistry.STACKED_LAPIS_BRICKS.get());
                        pOutput.accept(BlockRegistry.STACKED_SOAP_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_BLACKSTONE_TILES.get());
                        pOutput.accept(BlockRegistry.STACKED_CHECKER_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_FINE_WOOD.get());
                        pOutput.accept(BlockRegistry.STACKED_DAUB.get());
                        pOutput.accept(BlockRegistry.STACKED_FEATHER_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_FODDER.get());
                        pOutput.accept(BlockRegistry.STACKED_FLINT_BLOCKS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
