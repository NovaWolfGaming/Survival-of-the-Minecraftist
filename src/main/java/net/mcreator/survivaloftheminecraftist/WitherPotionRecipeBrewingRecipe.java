
package net.mcreator.survivaloftheminecraftist;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.Potions;
import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.survivaloftheminecraftist.potion.WitherPotionPotion;
import net.mcreator.survivaloftheminecraftist.item.WitherPowderItem;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class WitherPotionRecipeBrewingRecipe extends SurvivalOfTheMinecraftistModElements.ModElement {
	public WitherPotionRecipeBrewingRecipe(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 443);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			Item inputItem = input.getItem();
			return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
					&& PotionUtils.getPotionFromItem(input) == Potions.WATER;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == WitherPowderItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(input.getItem()), WitherPotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
