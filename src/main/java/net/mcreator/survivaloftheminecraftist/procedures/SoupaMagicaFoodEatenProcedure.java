package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Map;

public class SoupaMagicaFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency entity for procedure SoupaMagicaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.extinguish();
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 400, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 200, (int) 1));
	}
}
