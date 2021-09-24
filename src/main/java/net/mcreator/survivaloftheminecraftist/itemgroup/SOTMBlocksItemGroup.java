
package net.mcreator.survivaloftheminecraftist.itemgroup;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class SOTMBlocksItemGroup extends SurvivalOfTheMinecraftistModElements.ModElement {

	public SOTMBlocksItemGroup(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsotm_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ReniteBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
