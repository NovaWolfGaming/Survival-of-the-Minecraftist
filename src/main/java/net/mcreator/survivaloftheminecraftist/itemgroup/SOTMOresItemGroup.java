
package net.mcreator.survivaloftheminecraftist.itemgroup;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMOresItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {

	public SOTMOresItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_ores") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PotassiumOreBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
