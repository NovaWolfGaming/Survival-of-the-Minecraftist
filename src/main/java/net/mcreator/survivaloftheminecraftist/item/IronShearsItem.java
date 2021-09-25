
package net.mcreator.survivaloftheminecraftist.item;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class IronShearsItem extends SurvivalOfTheMinecraftistModElements.ModElement {

	@ObjectHolder("survival_of_the_minecraftist:iron_shears")
	public static final Item block = null;

	public IronShearsItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 134);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(SOTMToolsAndWeaponsItemGroup.tab).maxDamage(390)) {
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 4f;
			}

		}.setRegistryName("iron_shears"));
	}

}
