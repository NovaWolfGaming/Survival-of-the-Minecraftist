
package net.mcreator.survivaloftheminecraftist.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class BlockOfBloodQuartzBlock extends SurvivalOfTheMinecraftistModElements.ModElement {

	@ObjectHolder("survival_of_the_minecraftist:block_of_blood_quartz")
	public static final Block block = null;

	public BlockOfBloodQuartzBlock(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 139);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(SOTMBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("block_of_blood_quartz");
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
