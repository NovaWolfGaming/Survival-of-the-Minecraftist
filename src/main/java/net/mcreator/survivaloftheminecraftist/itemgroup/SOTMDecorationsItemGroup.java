
package net.mcreator.survivaloftheminecraftist.itemgroup;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMDecorationsItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {

	public SOTMDecorationsItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LampRodItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
