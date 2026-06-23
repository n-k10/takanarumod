package tech.takanaru.tutorialmod.event;

import tech.takanaru.tutorialmod.TakanaruMod;
import tech.takanaru.tutorialmod.block.ModBlocks;
import tech.takanaru.tutorialmod.enchantment.ModEnchantments;
import tech.takanaru.tutorialmod.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.level.BlockEvent;
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

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack tool = player.getMainHandItem();
        int level = EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.SILVER_TOUCH.get(), tool);

        if (level > 0 && event.getState().is(ModBlocks.SILVER_ORE.get())) {
            if (!player.level().isClientSide()) {
                ItemStack bonus = new ItemStack(ModItems.RAW_SILVER.get(), level);
                ItemEntity itemEntity = new ItemEntity(player.level(),
                        event.getPos().getX() + 0.5, event.getPos().getY() + 0.5, event.getPos().getZ() + 0.5, bonus);
                player.level().addFreshEntity(itemEntity);
            }
        }
    }

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        if (event.getItemStack().is(ModItems.SILVER_SWORD.get())) {
            event.getToolTip().add(Component.translatable("tooltip.takanarumod.silver_sword")
                    .withStyle(ChatFormatting.AQUA));
        }
        if (event.getItemStack().is(ModItems.SILVER.get())) {
            event.getToolTip().add(Component.translatable("tooltip.takanarumod.silver")
                    .withStyle(ChatFormatting.GRAY));
        }
    }
}
