
package net.mcreator.survivaloftheminecraftist.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.survivaloftheminecraftist.item.SplitCoconutItem;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMFoodsItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {
	public SOTMFoodsItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 379);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_foods") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SplitCoconutItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
