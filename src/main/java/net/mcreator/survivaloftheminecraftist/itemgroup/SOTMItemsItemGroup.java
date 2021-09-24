
package net.mcreator.survivaloftheminecraftist.itemgroup;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMItemsItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {

	public SOTMItemsItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SulphurItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
