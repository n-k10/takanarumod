package tech.takanaru.tutorialmod;

import tech.takanaru.tutorialmod.block.ModBlocks;
import tech.takanaru.tutorialmod.effect.ModEffects;
import tech.takanaru.tutorialmod.enchantment.ModEnchantments;
import tech.takanaru.tutorialmod.particle.ModParticles;
import tech.takanaru.tutorialmod.particle.SilverSparkleParticle;
import tech.takanaru.tutorialmod.item.ModCreativeModTabs;
import tech.takanaru.tutorialmod.item.ModItems;
import tech.takanaru.tutorialmod.potion.ModPotions;
import tech.takanaru.tutorialmod.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(TakanaruMod.MODID)
public class TakanaruMod
{
    public static final String MODID = "takanarumod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TakanaruMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        ModSounds.register(modEventBus);
        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModEnchantments.register(modEventBus);
        ModParticles.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ((net.minecraft.world.level.block.FlowerPotBlock) net.minecraft.world.level.block.Blocks.FLOWER_POT)
                    .addPlant(ModBlocks.SILVER_BLOSSOM.getId(), ModBlocks.POTTED_SILVER_BLOSSOM);

            net.minecraftforge.common.brewing.BrewingRecipeRegistry.addRecipe(
                    new net.minecraftforge.common.brewing.BrewingRecipe(
                            net.minecraft.world.item.crafting.Ingredient.of(
                                    net.minecraft.world.item.alchemy.PotionUtils.setPotion(
                                            new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.POTION),
                                            net.minecraft.world.item.alchemy.Potions.AWKWARD)),
                            net.minecraft.world.item.crafting.Ingredient.of(ModItems.SILVER.get()),
                            net.minecraft.world.item.alchemy.PotionUtils.setPotion(
                                    new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.POTION),
                                    ModPotions.SILVER_SIGHT_POTION.get())));
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVER_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVER_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVER_BLOSSOM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_SILVER_BLOSSOM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SILVER_BERRY_CROP.get(), RenderType.cutout());
        }

        @SubscribeEvent
        public static void onRegisterParticles(net.minecraftforge.client.event.RegisterParticleProvidersEvent event)
        {
            event.registerSpriteSet(ModParticles.SILVER_SPARKLE.get(), SilverSparkleParticle.Provider::new);
        }
    }
}
