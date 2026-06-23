package tech.takanaru.tutorialmod.block;

import tech.takanaru.tutorialmod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SilverBerryCropBlock extends CropBlock {
    public SilverBerryCropBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.SILVER_BERRY_SEEDS.get();
    }
}
