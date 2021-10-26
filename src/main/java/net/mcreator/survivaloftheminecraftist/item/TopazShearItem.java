
package net.mcreator.survivaloftheminecraftist.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.survivaloftheminecraftist.itemgroup.SOTMToolsAndWeaponsItemGroup;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class TopazShearItem extends SurvivalOfTheMinecraftistModElements.ModElement {
	@ObjectHolder("survival_of_the_minecraftist:topaz_shear")
	public static final Item block = null;
	public TopazShearItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 232);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(SOTMToolsAndWeaponsItemGroup.tab).maxDamage(470)) {
			@Override
			public int getItemEnchantability() {
				return 16;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 7f;
			}
		}.setRegistryName("topaz_shear"));
	}
}
