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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TREXSPRITE.get()))
                    .title(Component.translatable("creativetab.ffmod.ff_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TREXSPRITE.get());
                        output.accept(ModItems.DASPLETOSPRITE.get());
                        output.accept(ModItems.GORGOSPRITE.get());
                        output.accept(ModItems.TARBOSPRITE.get());
                        output.accept(ModItems.ALIOSPRITE.get());
                        output.accept(ModItems.SIAMOSPRITE.get());
                        output.accept(ModItems.ALECTROSPRITE.get());
                        output.accept(ModItems.GUANSPRITE.get());
                        output.accept(ModItems.SHANSHANSPRITE.get());
                        output.accept(ModItems.ALLOSPRITE.get());
                        output.accept(ModItems.METRIASPRITE.get());
                        output.accept(ModItems.MEGALOSPRITE.get());
                        output.accept(ModItems.VENATORSPRITE.get());
                        output.accept(ModItems.SRAPTORSPRITE.get());
                        output.accept(ModItems.GIGANTOSPRITE.get());
                        output.accept(ModItems.CRYOSPRITE.get());
                        output.accept(ModItems.CARCHARSPRITE.get());
                        output.accept(ModItems.ACROSPRITE.get());
                        output.accept(ModItems.FRAPTORSPRITE.get());
                        output.accept(ModItems.SPINAXSPRITE.get());
                        output.accept(ModItems.NEOSPRITE.get());
                        output.accept(ModItems.COMPSOSPRITE.get());
                        output.accept(ModItems.SOPTERYXSPRITE.get());
                        output.accept(ModItems.DELTASPRITE.get());
                        output.accept(ModItems.TROSPRITE.get());
                        output.accept(ModItems.NYCHUSSPRITE.get());
                        output.accept(ModItems.MRAPTORSPRITE.get());
                        output.accept(ModItems.URAPTORSPRITE.get());
                        output.accept(ModItems.VRAPTORSPRITE.get());
                        output.accept(ModItems.BREMESPRITE.get());
                        output.accept(ModItems.AOPTERYXSPRITE.get());
                        output.accept(ModItems.COELOSPRITE.get());
                        output.accept(ModItems.DILOPHOSPRITE.get());
                        output.accept(ModItems.SPINOSPRITE.get());
                        output.accept(ModItems.ANGATOSPRITE.get());
                        output.accept(ModItems.SUCHOSPRITE.get());
                        output.accept(ModItems.ONYXSPRITE.get());
                        output.accept(ModItems.CERATOSPRITE.get());
                        output.accept(ModItems.CARNOSPRITE.get());
                        output.accept(ModItems.ORNOSPRITE.get());
                        output.accept(ModItems.CHEIRUSSPRITE.get());
                        output.accept(ModItems.ORAPTORSPRITE.get());
                        output.accept(ModItems.ZINOSPRITE.get());
                        output.accept(ModItems.BRACHIOSPRITE.get());
                        output.accept(ModItems.SALTOSPRITE.get());
                        output.accept(ModItems.SHUNOSPRITE.get());
                        output.accept(ModItems.PERSOSPRITE.get());
                        output.accept(ModItems.SEISMOSPRITE.get());
                        output.accept(ModItems.APATOSPRITE.get());
                        output.accept(ModItems.AMARGOSPRITE.get());
                        output.accept(ModItems.STEGOSPRITE.get());
                        output.accept(ModItems.YANGOSPRITE.get());
                        output.accept(ModItems.JIANGOSPRITE.get());
                        output.accept(ModItems.KENTROSPRITE.get());
                        output.accept(ModItems.LEXOSPRITE.get());
                        output.accept(ModItems.NODOSPRITE.get());
                        output.accept(ModItems.ANKYLOSPRITE.get());
                        output.accept(ModItems.SAICHANSPRITE.get());
                        output.accept(ModItems.GOYLESPRITE.get());
                        output.accept(ModItems.PELTOSPRITE.get());
                        output.accept(ModItems.HYPSISPRITE.get());
                        output.accept(ModItems.NASAURSPRITE.get());
                        output.accept(ModItems.IGUASPRITE.get());
                        output.accept(ModItems.OURANOSPRITE.get());
                        output.accept(ModItems.LAMBEOSPRITE.get());
                        output.accept(ModItems.MAIASPRITE.get());
                        output.accept(ModItems.ANATOSPRITE.get());
                        output.accept(ModItems.PARALOPHSPRITE.get());
                        output.accept(ModItems.PACHYSPRITE.get());
                        output.accept(ModItems.STYGISPRITE.get());
                        output.accept(ModItems.GOYOSPRITE.get());
                        output.accept(ModItems.PROTOSPRITE.get());
                        output.accept(ModItems.TRICERASPRITE.get());
                        output.accept(ModItems.STYRACOSPRITE.get());
                        output.accept(ModItems.EINIOSPRITE.get());
                        output.accept(ModItems.CENTROSPRITE.get());
                        output.accept(ModItems.PENTASPRITE.get());
                        output.accept(ModItems.PACHRINOSPRITE.get());
                        output.accept(ModItems.MIHUSPRITE.get());
                        output.accept(ModItems.PTERASPRITE.get());
                        output.accept(ModItems.COATLUSSPRITE.get());
                        output.accept(ModItems.JARASPRITE.get());
                        output.accept(ModItems.DIMORPHSPRITE.get());
                        output.accept(ModItems.GUERASPRITE.get());
                        output.accept(ModItems.CRONASPRITE.get());
                        output.accept(ModItems.FUTABISPRITE.get());
                        output.accept(ModItems.ELASMOSPRITE.get());
                        output.accept(ModItems.PLESIOSPRITE.get());
                        output.accept(ModItems.SHONISPRITE.get());
                        output.accept(ModItems.ARSITHSPRITE.get());
                        output.accept(ModItems.BRONTOTHSPRITE.get());
                        output.accept(ModItems.ELASMOTHSPRITE.get());
                        output.accept(ModItems.HOPLOSPRITE.get());
                        output.accept(ModItems.ANDRARCHSPRITE.get());
                        output.accept(ModItems.PAKISPRITE.get());
                        output.accept(ModItems.SMILOSPRITE.get());
                        output.accept(ModItems.MAMMOTHSPRITE.get());
                        output.accept(ModItems.TRYMASPRITE.get());
                        output.accept(ModItems.MEGATHSPRITE.get());
                        output.accept(ModItems.CHELONSPRITE.get());
                        output.accept(ModItems.DINOMATONSPRITE.get());
                        output.accept(ModItems.DUNASPRITE.get());
                        output.accept(ModItems.RAPTINSPRITE.get());
                        output.accept(ModItems.DYNALSPRITE.get());
                        output.accept(ModItems.FRIGISPRITE.get());
                        output.accept(ModItems.IGNOSPRITE.get());
                        output.accept(ModItems.SQUIKSPRITE.get());
                        output.accept(ModItems.SQUIRKSPRITE.get());
                        output.accept(ModItems.SQUIRTHSPRITE.get());
                        output.accept(ModItems.SQUILKSPRITE.get());
                        output.accept(ModItems.SQUIROSPRITE.get());
                        output.accept(ModItems.GUHWEEPSPRITE.get());
                        output.accept(ModItems.GUHVORNSPRITE.get());
                        output.accept(ModItems.GUHLITHSPRITE.get());






                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
