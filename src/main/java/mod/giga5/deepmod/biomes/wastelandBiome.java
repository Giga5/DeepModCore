package mod.giga5.deepmod.biomes;

import mod.giga5.deepmod.structures.wastelandsurface;
import mod.giga5.deepmod.structures.featuregen;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class wastelandBiome {
    public static Biome wastelandBiomeGen() {
                BiomeGenerationSettings gen = new BiomeGenerationSettings.Builder()
                .surfaceBuilder(SurfaceBuilder.DEFAULT.configured(wastelandsurface.WASTE_SURFACE_CONFIG))
                .addCarver(GenerationStage.Carving.AIR, ConfiguredCarvers.CAVE)
                .addFeature(GenerationStage.Decoration.LAKES, Features.LAKE_WATER)
                .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_COAL)
                .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_IRON)
                .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_GOLD)
                .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_REDSTONE)
                .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_DIAMOND)
                .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_LAPIS)
                        .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_ANDESITE)
                        .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_DIORITE)
                        .addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_GRANITE)
                        .addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD)
                .addStructureStart(StructureFeatures.MINESHAFT)
                .addStructureStart(StructureFeatures.STRONGHOLD)
                .addFeature(GenerationStage.Decoration.LAKES, Features.LAKE_LAVA)
                        .addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, featuregen.waste_tree_spread_config)
                        .addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.BIRCH)
                .build();

                BiomeAmbience ambience = new BiomeAmbience.Builder()
                .waterColor(0x2e284f)
                .grassColorOverride(0x665c50)
                        .foliageColorOverride(0x826066)
                .waterFogColor(0x00d0c17)
                .fogColor(0x606769)
                .skyColor(0x3d4142)
                .build();


                MobSpawnInfo mobStuff = new MobSpawnInfo.Builder()
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 100, 4, 8))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 100, 4, 8))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE_VILLAGER, 5, 1, 1))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 100, 4, 8))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 100, 4, 4))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 100, 4, 4))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 10, 1, 4))
                .addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITCH, 5, 1, 1))
                .build();



        return new Biome.Builder()
                .generationSettings(gen)
                .specialEffects(ambience)
                .mobSpawnSettings(mobStuff)
                .biomeCategory(Biome.Category.PLAINS)
                .temperatureAdjustment(Biome.TemperatureModifier.NONE)
                .depth(0.12f)
                .scale(0.01f)
                .precipitation(Biome.RainType.RAIN)
                .temperature(0.5f)
                .downfall(0.4f)
                .build();
    }
}
