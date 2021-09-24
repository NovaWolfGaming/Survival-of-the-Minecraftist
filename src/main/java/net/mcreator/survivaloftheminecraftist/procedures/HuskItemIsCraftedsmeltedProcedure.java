package net.mcreator.survivaloftheminecraftist.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.survivaloftheminecraftist.item.DehuskedCoconutItem;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistMod;

import java.util.Random;
import java.util.Map;

public class HuskItemIsCraftedsmeltedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SurvivalOfTheMinecraftistMod.LOGGER.warn("Failed to load dependency entity for procedure HuskItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(DehuskedCoconutItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.SHEARS);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		{
			ItemStack _ist = new ItemStack(Items.SHEARS);
			if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}
