
package net.mcreator.survivaloftheminecraftist.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VacuumPotionPotion {

	@ObjectHolder("survival_of_the_minecraftist:vacuum_potion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(VacuumEffectPotionEffect.potion, 3600, 0, false, true));
			setRegistryName("vacuum_potion");
		}

	}
}