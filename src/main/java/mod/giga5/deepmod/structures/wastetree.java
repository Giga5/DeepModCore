package mod.giga5.deepmod.structures;

import mod.giga5.deepmod.holder;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class wastetree {
    public static ConfiguredFeature<BaseTreeFeatureConfig, ?> tree_waste = Feature.TREE.configured(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(holder.WASTE_LOG.getBlock().defaultBlockState()),
                    new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getBlock().defaultBlockState()),
                    new BlobFoliagePlacer(
                            /* radius: */ FeatureSpread.of(
                            3, //base
                            3  //spread
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
}
