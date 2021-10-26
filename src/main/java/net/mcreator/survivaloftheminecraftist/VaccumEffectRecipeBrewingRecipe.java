
package net.mcreator.survivaloftheminecraftist;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.survivaloftheminecraftist.potion.VacuumPotionPotion;
import net.mcreator.survivaloftheminecraftist.item.PotassiumItem;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class VaccumEffectRecipeBrewingRecipe extends SurvivalOfTheMinecraftistModElements.ModElement {
	public VaccumEffectRecipeBrewingRecipe(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 264);
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
			return ingredient.getItem() == PotassiumItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), VacuumPotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
