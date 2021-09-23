package net.mcreator.survivaloftheminecraftist.procedures;

public class VacuumEffectEffectStartedappliedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency entity for procedure VacuumEffectEffectStartedapplied!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		for (int index0 = 0; index0 < (int) (15); index0++) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).attackEntityFrom(new DamageSource("custom").setDamageBypassesArmor(), (float) 1);
			}
		}
	}

}
