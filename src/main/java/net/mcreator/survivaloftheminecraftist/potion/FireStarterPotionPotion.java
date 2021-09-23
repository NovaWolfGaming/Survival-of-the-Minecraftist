
package net.mcreator.survivaloftheminecraftist.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FireStarterPotionPotion {

	@ObjectHolder("survival_of_the_minecraftist:fire_starter_potion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(FireStarterPotionEffect.potion, 3600, 0, false, true));
			setRegistryName("fire_starter_potion");
		}

	}
}