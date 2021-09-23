package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Map;

public class FireStarterEffectStartedappliedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency entity for procedure FireStarterEffectStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 15);
	}
}
