package mod.giga5.deepmod.structures;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class wastelandsurface {
    public static ConfiguredSurfaceBuilder<?> WASTE_SURFACE = SurfaceBuilder.DEFAULT.configured(
            new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getBlock().defaultBlockState(), Blocks.COBBLESTONE.getBlock().defaultBlockState(), Blocks.STONE.getBlock().defaultBlockState())
    );
    public static SurfaceBuilderConfig WASTE_SURFACE_CONFIG = new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getBlock().defaultBlockState(), Blocks.COBBLESTONE.getBlock().defaultBlockState(), Blocks.STONE.getBlock().defaultBlockState());
}
