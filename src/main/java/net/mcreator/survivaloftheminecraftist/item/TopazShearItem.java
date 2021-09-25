
package net.mcreator.survivaloftheminecraftist.item;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class TopazShearItem extends SurvivalOfTheMinecraftistModElements.ModElement {

	@ObjectHolder("survival_of_the_minecraftist:topaz_shear")
	public static final Item block = null;

	public TopazShearItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(100)) {
			@Override
			public int getItemEnchantability() {
				return 16;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 7f;
			}

		}.setRegistryName("topaz_shear"));
	}

}
