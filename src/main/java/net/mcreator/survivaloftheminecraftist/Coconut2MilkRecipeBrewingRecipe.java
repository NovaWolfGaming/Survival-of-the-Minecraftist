
package net.mcreator.survivaloftheminecraftist;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.survivaloftheminecraftist.potion.BottledMilkPotion;
import net.mcreator.survivaloftheminecraftist.item.SplitCoconutItem;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class Coconut2MilkRecipeBrewingRecipe extends SurvivalOfTheMinecraftistModElements.ModElement {
	public Coconut2MilkRecipeBrewingRecipe(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 86);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.GLASS_BOTTLE;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == SplitCoconutItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), BottledMilkPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
