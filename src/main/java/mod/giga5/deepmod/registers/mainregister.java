package mod.giga5.deepmod.registers;

import mod.giga5.deepmod.biomes.wastelandBiome;
import mod.giga5.deepmod.holder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "deepmod", bus = Mod.EventBusSubscriber.Bus.MOD )
public class mainregister {

    @SubscribeEvent
public static void registerItems(RegistryEvent.Register<Item> e) {
    e.getRegistry().registerAll(
    );
}




@SubscribeEvent
public static void registerBlocks(RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
             new Block(AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE)).setRegistryName("waste_log")
        );
    }
}
