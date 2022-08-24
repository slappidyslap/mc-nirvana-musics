package io.melakuera.mcnirvanamusicsmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NirvanaMusicsMod.MOD_ID);

    public static final RegistryObject<Item> NIRVANA_COME_AS_YOU_ARE_MUSIC_DISC =
            ITEMS.register("nirvana_come_as_you_are_music_disc", () ->
                    new RecordItem(4, () -> ModSounds.NIRVANA_COME_AS_YOU_ARE.get(),
                            new Item.Properties()
                                    .tab(CreativeModeTab.TAB_MISC)
                                    .stacksTo(1)
                                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> NIRVANA_ABOUT_A_GIRL_MUSIC_DISC =
            ITEMS.register("nirvana_about_a_girl_music_disc", () ->
                    new RecordItem(4, () -> ModSounds.NIRVANA_ABOUT_A_GIRL.get(),
                            new Item.Properties()
                                    .tab(CreativeModeTab.TAB_MISC)
                                    .stacksTo(1)
                                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> NIRVANA_BLEW_MUSIC_DISC =
            ITEMS.register("nirvana_blew_music_disc", () ->
                    new RecordItem(4, () -> ModSounds.NIRVANA_BLEW.get(),
                            new Item.Properties()
                                    .tab(CreativeModeTab.TAB_MISC)
                                    .stacksTo(1)
                                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> NIRVANA_LITHIUM_MUSIC_DISC =
            ITEMS.register("nirvana_lithium_music_disc", () ->
                    new RecordItem(4, () -> ModSounds.NIRVANA_LITHIUM.get(),
                            new Item.Properties()
                                    .tab(CreativeModeTab.TAB_MISC)
                                    .stacksTo(1)
                                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> NIRVANA_SLTS_MUSIC_DISC =
            ITEMS.register("nirvana_slts_music_disc", () ->
                    new RecordItem(4, () -> ModSounds.NIRVANA_SLTS.get(),
                            new Item.Properties()
                                    .tab(CreativeModeTab.TAB_MISC)
                                    .stacksTo(1)
                                    .rarity(Rarity.RARE)));

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    
}
