package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Map;

public class StriderMilkFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency entity for procedure StriderMilkFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.extinguish();
	}
}
