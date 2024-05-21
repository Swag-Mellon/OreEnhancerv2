
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oreenhancer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oreenhancer.item.SilverItem;
import net.mcreator.oreenhancer.OreenhancerMod;

public class OreenhancerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OreenhancerMod.MODID);
	public static final RegistryObject<Item> SOLAR_PANEL = block(OreenhancerModBlocks.SOLAR_PANEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER = REGISTRY.register("silver", () -> new SilverItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
