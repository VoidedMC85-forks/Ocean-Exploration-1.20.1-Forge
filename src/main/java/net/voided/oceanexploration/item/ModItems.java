package net.voided.oceanexploration.item;

import net.voided.oceanexploration.OceanExploration;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
     public static final DeferredRegister<Item> ITEMS =
             DeferredRegister.create(ForgeRegistries.ITEMS, OceanExploration.MOD_ID);
// Copy from public to Item properties then paste below
     public static final RegistryObject<Item> SHARK_TOOTH = ITEMS.register("shark_tooth",
             () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANGLER_LIGHT = ITEMS.register("angler_light",
            () -> new Item(new Item.Properties()));


     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
     }
}
