package tech.takanaru.tutorialmod.potion;

import tech.takanaru.tutorialmod.TakanaruMod;
import tech.takanaru.tutorialmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, TakanaruMod.MODID);

    public static final RegistryObject<Potion> SILVER_SIGHT_POTION = POTIONS.register("silver_sight",
            () -> new Potion(new MobEffectInstance(ModEffects.SILVER_SIGHT.get(), 3600, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
