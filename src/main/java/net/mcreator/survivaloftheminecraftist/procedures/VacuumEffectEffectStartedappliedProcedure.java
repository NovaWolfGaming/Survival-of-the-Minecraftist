package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Map;

public class VacuumEffectEffectStartedappliedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency entity for procedure VacuumEffectEffectStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (14); index0++) {
			entity.attackEntityFrom(DamageSource.OUT_OF_WORLD, (float) 1);
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 200, (int) 1, (false), (false)));
		}
	}
}
