
package net.mcreator.survivaloftheminecraftist.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.survivaloftheminecraftist.itemgroup.SOTMFoodsItemGroup;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class WarpedBerriesItem extends SurvivalOfTheMinecraftistModElements.ModElement {
	@ObjectHolder("survival_of_the_minecraftist:warped_berries")
	public static final Item block = null;
	public WarpedBerriesItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 205);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SOTMFoodsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).build()));
			setRegistryName("warped_berries");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}