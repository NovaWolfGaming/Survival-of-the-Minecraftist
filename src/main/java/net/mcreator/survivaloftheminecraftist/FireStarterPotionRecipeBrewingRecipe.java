
package net.mcreator.survivaloftheminecraftist;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class FireStarterPotionRecipeBrewingRecipe extends SurvivalOfTheMinecraftistModElements.ModElement {

	public FireStarterPotionRecipeBrewingRecipe(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 32);
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
			return ingredient.getItem() == BlazeFlowerBlock.block.asItem();
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), FireStarterPotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}