package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.survivaloftheminecraftist.block.HellTorchWallBlock;
import net.mcreator.survivaloftheminecraftist.block.HellTorchBlock;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Map;

public class HellTorchItemRightClickedOnBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			if (!dependencies.containsKey("direction"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency direction for procedure HellTorchItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency x for procedure HellTorchItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency y for procedure HellTorchItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency z for procedure HellTorchItemRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency world for procedure HellTorchItemRightClickedOnBlock!");
			return;
		}
		Direction direction = (Direction) dependencies.get("direction");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((direction == Direction.UP)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), HellTorchBlock.block.getDefaultState(), 3);
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else if ((direction == Direction.NORTH)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), HellTorchWallBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else if ((direction == Direction.SOUTH)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR)
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), HellTorchWallBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), _bs.with(_property, Direction.SOUTH), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.SOUTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else if ((direction == Direction.WEST)) {
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), HellTorchWallBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), _bs.with(_property, Direction.WEST), 3);
					} else {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.WEST.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else if ((direction == Direction.EAST)) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), HellTorchWallBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), _bs.with(_property, Direction.EAST), 3);
					} else {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.EAST.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		}
	}
}
