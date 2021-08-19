package mod.giga5.deepmod.structures;

import com.google.common.collect.ImmutableList;
import mod.giga5.deepmod.holder;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class featuregen {
    public static ConfiguredFeature<BaseTreeFeatureConfig, ?> tree_waste = Feature.TREE.configured(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(holder.WASTE_LOG.getBlock().defaultBlockState()),
                    new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getBlock().defaultBlockState()),
                    new BlobFoliagePlacer(
                            /* radius: */ FeatureSpread.of(
                            2, //base
                            1  //spread
                    ),
                            /* offset: */ FeatureSpread.of(
                            2, //base
                            0  //spread
                    ),
                            /* height: */ 2
                    ),
                    new StraightTrunkPlacer(
                            4, //baseHeight
                            2, //heightRandA
                            0  //heightRandB
                    ),
                    new TwoLayerFeature(
                            1, //limit
                            0, //lowerSize
                            1  //upperSize
                    )
            ).ignoreVines().build());

        public static ConfiguredFeature<?,?> waste_tree_spread_config = Feature.RANDOM_SELECTOR
                .configured(new MultipleRandomFeatureConfig(
                        ImmutableList.of(tree_waste.weighted(0.5F)), tree_waste))
                .decorated(Features.Placements.HEIGHTMAP_SQUARE)
                .decorated(Placement.COUNT_EXTRA.
                        configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1)));
}
