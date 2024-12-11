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

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterGunpowder.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTERGUNPOWDER_TAB = CREATIVE_MODE_TABS.register("bettergunpowder_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.GUNPOWDER))
                    .title(Component.translatable("Better Gunpowder"))
                    .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(ModItems.POTASSIUMNITRATE.get());
                       pOutput.accept(ModItems.SULFUR.get());


                       pOutput.accept(Items.GUNPOWDER);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
