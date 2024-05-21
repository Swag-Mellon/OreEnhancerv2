
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oreenhancer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.oreenhancer.item.SilverItem;
import net.mcreator.oreenhancer.OreenhancerMod;

public class OreenhancerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OreenhancerMod.MODID);
	public static final RegistryObject<Item> SILVER = REGISTRY.register("silver", () -> new SilverItem());
}
