package mod.giga5.deepmod;

import mod.giga5.deepmod.registers.deferredregister;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("deepmod")
public class main {
    public static final String MODID = "deepmod";

    public main() {
        BiomeManager.addAdditionalOverworldBiomes(RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deepmod", "wasteland_biome")));
        deferredregister.register();

    }
}
