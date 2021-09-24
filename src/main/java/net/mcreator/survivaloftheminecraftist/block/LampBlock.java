
package net.mcreator.survivaloftheminecraftist.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class LampBlock extends SurvivalOfTheMinecraftistModElements.ModElement {

	@ObjectHolder("survival_of_the_minecraftist:lamp")
	public static final Block block = null;

	public LampBlock(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 40);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(SOTMBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 15));

			setRegistryName("lamp");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
