
package net.mcreator.survivaloftheminecraftist;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class VaccumEffectRecipeBrewingRecipe extends SurvivalOfTheMinecraftistModElements.ModElement {

	public VaccumEffectRecipeBrewingRecipe(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 37);
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