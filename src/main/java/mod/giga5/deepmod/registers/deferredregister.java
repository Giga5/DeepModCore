package mod.giga5.deepmod.registers;


import mod.giga5.deepmod.biomes.wastelandBiome;
import mod.giga5.deepmod.main;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = "deepmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class deferredregister {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, main.MODID);
    public static final RegistryObject<Biome> WASTELAND_BIOME = BIOMES.register("wasteland_biome", wastelandBiome::wastelandBiomeGen);

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BIOMES.register(modEventBus);
    }
}
