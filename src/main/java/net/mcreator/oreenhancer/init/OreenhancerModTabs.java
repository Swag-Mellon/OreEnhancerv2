
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oreenhancer.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class OreenhancerModTabs {
	public static CreativeModeTab TAB_ORE_ENHANCER;

	public static void load() {
		TAB_ORE_ENHANCER = new CreativeModeTab("tabore_enhancer") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OreenhancerModItems.SILVER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
