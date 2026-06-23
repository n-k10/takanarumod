package tech.takanaru.tutorialmod.item;

import tech.takanaru.tutorialmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class SilverDetectorItem extends Item {
    public SilverDetectorItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            BlockPos playerPos = player.blockPosition();
            boolean found = false;

            for (int x = -5; x <= 5; x++) {
                for (int y = -5; y <= 5; y++) {
                    for (int z = -5; z <= 5; z++) {
                        BlockPos checkPos = playerPos.offset(x, y, z);
                        BlockState state = level.getBlockState(checkPos);
                        if (state.is(ModBlocks.SILVER_ORE.get())) {
                            player.displayClientMessage(
                                    Component.translatable("message.takanarumod.silver_detector.found",
                                            checkPos.getX(), checkPos.getY(), checkPos.getZ()), true);
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }

            if (!found) {
                player.displayClientMessage(
                        Component.translatable("message.takanarumod.silver_detector.not_found"), true);
            }

            player.getCooldowns().addCooldown(this, 40);
        }

        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }
}
