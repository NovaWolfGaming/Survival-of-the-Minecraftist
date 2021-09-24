
package net.mcreator.survivaloftheminecraftist.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.survivaloftheminecraftist.block.ReniteBlock;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMBlocksItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {
	public SOTMBlocksItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ReniteBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
