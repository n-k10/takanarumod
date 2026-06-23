package tech.takanaru.tutorialmod.event;

import tech.takanaru.tutorialmod.TakanaruMod;
import tech.takanaru.tutorialmod.block.ModBlocks;
import tech.takanaru.tutorialmod.enchantment.ModEnchantments;
import tech.takanaru.tutorialmod.item.ModItems;
import tech.takanaru.tutorialmod.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

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

    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.SILVERSMITH.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1: Buy raw silver for emeralds
            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.RAW_SILVER.get(), 3),
                    12, 5, 0.05f));

            // Level 1: Sell silver for emeralds
            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 4),
                    new ItemStack(Items.EMERALD, 1),
                    12, 5, 0.05f));

            // Level 2: Buy silver apple
            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ModItems.SILVER_APPLE.get(), 1),
                    6, 10, 0.05f));

            // Level 3: Buy silver sword
            trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.SILVER_SWORD.get(), 1),
                    3, 15, 0.05f));

            // Level 4: Buy silver pickaxe
            trades.get(4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(ModItems.SILVER_PICKAXE.get(), 1),
                    3, 20, 0.05f));

            // Level 5: Buy silver detector
            trades.get(5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    new ItemStack(ModItems.SILVER_DETECTOR.get(), 1),
                    1, 30, 0.05f));
        }
    }
}
