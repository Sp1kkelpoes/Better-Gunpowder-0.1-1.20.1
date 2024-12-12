package net.sp1kkelpoes.bettergunpowder.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sp1kkelpoes.bettergunpowder.BetterGunpowder;
import net.sp1kkelpoes.bettergunpowder.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterGunpowder.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTERGUNPOWDER_TAB = CREATIVE_MODE_TABS.register("bettergunpowder_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.GUNPOWDER))
                    .title(Component.translatable("creativetab.bettergunpowder_tab"))
                    .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(ModItems.POTASSIUMNITRATE.get());
                       pOutput.accept(ModItems.SULFUR.get());


                       pOutput.accept(Items.GUNPOWDER);

                       pOutput.accept(ModBlocks.SULFUR_ORE.get());
                       pOutput.accept(ModBlocks.POTASSIUMNITRATE_ORE.get());
                       pOutput.accept(ModItems.RAWSULFUR.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
