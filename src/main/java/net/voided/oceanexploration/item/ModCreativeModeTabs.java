package net.voided.oceanexploration.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.voided.oceanexploration.OceanExploration;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OceanExploration.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OCEAN_TAB = CREATIVE_MODE_TABS.register("ocean_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHARK_TOOTH.get()))
                    .title(Component.translatable("creativetab.ocean_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SHARK_TOOTH.get());
                        pOutput.accept(ModItems.ANGLER_LIGHT.get());

                    })
                    .build());

            public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

            }
}
