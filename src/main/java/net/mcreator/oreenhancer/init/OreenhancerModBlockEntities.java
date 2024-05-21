
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oreenhancer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.oreenhancer.block.entity.SolarPanelBlockEntity;
import net.mcreator.oreenhancer.OreenhancerMod;

public class OreenhancerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, OreenhancerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL = register("solar_panel", OreenhancerModBlocks.SOLAR_PANEL, SolarPanelBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
