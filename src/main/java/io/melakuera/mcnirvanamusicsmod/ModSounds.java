package io.melakuera.mcnirvanamusicsmod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
        DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NirvanaMusicsMod.MOD_ID);

    public static RegistryObject<SoundEvent> NIRVANA_COME_AS_YOU_ARE = 
        registerSoundEvent("nirvana_come_as_you_are");
    
    public static RegistryObject<SoundEvent> NIRVANA_BLEW = 
        registerSoundEvent("nirvana_blew");

    public static RegistryObject<SoundEvent> NIRVANA_ABOUT_A_GIRL = 
        registerSoundEvent("nirvana_about_a_girl");

    public static RegistryObject<SoundEvent> NIRVANA_LITHIUM = 
        registerSoundEvent("nirvana_lithium");
        
    public static RegistryObject<SoundEvent> NIRVANA_SLTS = 
        registerSoundEvent("nirvana_slts");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> 
            new SoundEvent(new ResourceLocation(NirvanaMusicsMod.MOD_ID, name)));
    }

    public static void register() {
        SOUND_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
