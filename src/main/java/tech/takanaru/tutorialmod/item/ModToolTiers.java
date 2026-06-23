package tech.takanaru.tutorialmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(
                    2,        // level (same as iron)
                    500,      // uses (between iron 250 and diamond 1561)
                    7.0f,     // speed (between iron 6.0 and diamond 8.0)
                    2.5f,     // attackDamageBonus (between iron 2.0 and diamond 3.0)
                    18,       // enchantmentValue (between iron 14 and diamond/gold)
                    ModTags.Blocks.NEEDS_SILVER_TOOL,
                    () -> Ingredient.of(ModItems.SILVER.get())
            ),
            new ResourceLocation("takanarumod", "silver"),
            List.of(Tiers.IRON),
            List.of(Tiers.DIAMOND)
    );
}
