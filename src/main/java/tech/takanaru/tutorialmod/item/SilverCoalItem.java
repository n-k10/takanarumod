package tech.takanaru.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class SilverCoalItem extends Item {
    public SilverCoalItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 3200;
    }
}
