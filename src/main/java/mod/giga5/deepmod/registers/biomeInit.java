package mod.giga5.deepmod.registers;


import mod.giga5.deepmod.holder;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = "deepmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class biomeInit {

    @SubscribeEvent
    public static void setupBiomes(FMLCommonSetupEvent event) {
        event.enqueueWork(() ->
                setupBiome(holder.WASTELAND_BIOME, BiomeManager.BiomeType.DESERT, 100,
                        BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS)
        );
    }
    private static void setupBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        RegistryKey<Biome> key = RegistryKey.create(
                ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome))
        );

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}


