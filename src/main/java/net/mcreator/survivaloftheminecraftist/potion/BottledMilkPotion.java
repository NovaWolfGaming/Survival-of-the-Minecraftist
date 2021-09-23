
package net.mcreator.survivaloftheminecraftist.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BottledMilkPotion {

	@ObjectHolder("survival_of_the_minecraftist:bottled_milk")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(MilkedPotionEffect.potion, 1, 0, false, true));
			setRegistryName("bottled_milk");
		}

	}
}