package net.dinaurian.ffmod.item;

import net.dinaurian.ffmod.FFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FFMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FF_ITEMS_TAB = CREATIVE_MODE_TABS.register("ff_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALLOSPRITE.get()))
                    .title(Component.translatable("creativetab.ffmod.ff_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALLOSPRITE.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
