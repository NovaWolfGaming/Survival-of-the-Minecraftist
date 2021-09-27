
package net.mcreator.survivaloftheminecraftist;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.survivaloftheminecraftist.item.SulphurItem;
import net.mcreator.survivaloftheminecraftist.item.StriderMilkItem;
import net.mcreator.survivaloftheminecraftist.item.SoupaMagicaItem;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class StriderMilk2SoupaMagicaBrewingRecipe extends SurvivalOfTheMinecraftistModElements.ModElement {
	public StriderMilk2SoupaMagicaBrewingRecipe(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 221);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == StriderMilkItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == SulphurItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(SoupaMagicaItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
