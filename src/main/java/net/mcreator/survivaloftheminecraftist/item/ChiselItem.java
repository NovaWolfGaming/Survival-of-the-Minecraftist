
package net.mcreator.survivaloftheminecraftist.item;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class ChiselItem extends SurvivalOfTheMinecraftistModElements.ModElement {

	@ObjectHolder("survival_of_the_minecraftist:chisel")
	public static final Item block = null;

	public ChiselItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 120);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(SOTMToolsAndWeaponsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("chisel");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
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
