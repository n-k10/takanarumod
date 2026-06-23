package tech.takanaru.tutorialmod.item;

import tech.takanaru.tutorialmod.TakanaruMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SILVER_TOOL =
                BlockTags.create(new ResourceLocation(TakanaruMod.MODID, "needs_silver_tool"));
    }
}
