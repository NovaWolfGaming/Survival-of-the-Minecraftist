
package net.mcreator.survivaloftheminecraftist.item;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class DarkQuartzItem extends SurvivalOfTheMinecraftistModElements.ModElement {

	@ObjectHolder("survival_of_the_minecraftist:dark_quartz")
	public static final Item block = null;

	public DarkQuartzItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 85);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(SOTMItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("dark_quartz");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
