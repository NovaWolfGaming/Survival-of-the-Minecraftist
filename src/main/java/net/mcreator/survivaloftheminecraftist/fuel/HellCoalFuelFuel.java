
package net.mcreator.survivaloftheminecraftist.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.survivaloftheminecraftist.item.HellCoalItem;

@Mod.EventBusSubscriber
public class HellCoalFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == HellCoalItem.block)
			event.setBurnTime(2600);
	}
}
