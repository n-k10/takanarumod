package tech.takanaru.tutorialmod.villager;

import com.google.common.collect.ImmutableSet;
import tech.takanaru.tutorialmod.TakanaruMod;
import tech.takanaru.tutorialmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, TakanaruMod.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, TakanaruMod.MODID);

    public static final RegistryObject<PoiType> SILVERSMITH_POI = POI_TYPES.register("silversmith_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.SILVER_LAMP.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SILVERSMITH = VILLAGER_PROFESSIONS.register("silversmith",
            () -> new VillagerProfession("silversmith",
                    holder -> holder.is(SILVERSMITH_POI.getKey()),
                    holder -> holder.is(SILVERSMITH_POI.getKey()),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
