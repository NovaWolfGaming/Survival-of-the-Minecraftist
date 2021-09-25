
package net.mcreator.survivaloftheminecraftist.itemgroup;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMToolsAndWeaponsItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {

	public SOTMToolsAndWeaponsItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_tools_and_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SlingshotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
