package tech.takanaru.tutorialmod.enchantment;

import tech.takanaru.tutorialmod.TakanaruMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TakanaruMod.MODID);

    public static final RegistryObject<Enchantment> SILVER_TOUCH = ENCHANTMENTS.register("silver_touch",
            () -> new SilverTouchEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentCategory.DIGGER, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
