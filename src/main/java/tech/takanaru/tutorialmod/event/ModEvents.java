package tech.takanaru.tutorialmod.event;

import tech.takanaru.tutorialmod.TakanaruMod;
import tech.takanaru.tutorialmod.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TakanaruMod.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (event.getSource().getEntity() instanceof Player player) {
            if (player.getMainHandItem().is(ModItems.SILVER_SWORD.get())) {
                LivingEntity target = event.getEntity();
                target.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 0));
            }
        }
    }
}
