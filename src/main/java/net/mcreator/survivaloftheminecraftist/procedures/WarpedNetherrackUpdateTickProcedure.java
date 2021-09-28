package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.survivaloftheminecraftist.block.WarpedNetherrackBlock;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Map;
import java.util.HashMap;

public class WarpedNetherrackUpdateTickProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency x for procedure WarpedNetherrackUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency y for procedure WarpedNetherrackUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency z for procedure WarpedNetherrackUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency world for procedure WarpedNetherrackUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("warped_forest")))
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.NETHERRACK))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), WarpedNetherrackBlock.block.getDefaultState(), 3);
		}
	}
}
