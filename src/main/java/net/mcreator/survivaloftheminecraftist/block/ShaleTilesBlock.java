
package net.mcreator.survivaloftheminecraftist.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.survivaloftheminecraftist.itemgroup.StonesAndRocksItemGroup;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

import java.util.List;
import java.util.Collections;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class ShaleTilesBlock extends SurvivalOfTheMinecraftistModElements.ModElement {
	@ObjectHolder("survival_of_the_minecraftist:shale_tiles")
	public static final Block block = null;
	public ShaleTilesBlock(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(StonesAndRocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("shale_tiles");
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