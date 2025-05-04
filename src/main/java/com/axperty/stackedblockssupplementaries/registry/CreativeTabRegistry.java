package com.axperty.stackedblockssupplementaries.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.axperty.stackedblockssupplementaries.StackedBlocksSupplementaries;

public class CreativeTabRegistry {
    public static final ItemGroup STACKEDBLOCKSSUPPLEMENTARIES_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(StackedBlocksSupplementaries.MODID + ":" + "stackedblockssupplementaries"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.stackedblockssupplementaries"))
                    .icon(() -> new ItemStack(BlockRegistry.STACKED_FINE_WOOD))
                    .entries((displayContext, entries) -> {

                        entries.add(BlockRegistry.STACKED_STONE_TILES);
                        entries.add(BlockRegistry.STACKED_GRAVEL_BRICKS);
                        entries.add(BlockRegistry.STACKED_ASH_BRICKS);
                        entries.add(BlockRegistry.STACKED_LAPIS_BRICKS);
                        entries.add(BlockRegistry.STACKED_SOAP_BLOCKS);
                        entries.add(BlockRegistry.STACKED_BLACKSTONE_TILES);
                        entries.add(BlockRegistry.STACKED_CHECKER_BLOCKS);
                        entries.add(BlockRegistry.STACKED_FINE_WOOD);
                        entries.add(BlockRegistry.STACKED_DAUB);
                        entries.add(BlockRegistry.STACKED_FEATHER_BLOCKS);
                        entries.add(BlockRegistry.STACKED_FODDER);
                        entries.add(BlockRegistry.STACKED_FLINT_BLOCKS);
                    })
                    .build());

    public static void registerItemGroups() {
        StackedBlocksSupplementaries.LOGGER.info("Registering Item Groups for " + StackedBlocksSupplementaries.MODID);
    }
}