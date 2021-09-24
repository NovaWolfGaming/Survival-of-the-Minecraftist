
package net.mcreator.survivaloftheminecraftist.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.survivaloftheminecraftist.item.SulphurItem;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMItemsItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {
	public SOTMItemsItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SulphurItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
