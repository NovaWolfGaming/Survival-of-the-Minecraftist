
package net.mcreator.survivaloftheminecraftist.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.survivaloftheminecraftist.block.LampRodBlock;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMDecorationsItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {
	public SOTMDecorationsItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 274);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LampRodBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
