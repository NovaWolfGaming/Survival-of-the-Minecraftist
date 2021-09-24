
package net.mcreator.survivaloftheminecraftist.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.survivaloftheminecraftist.procedures.HuskItemIsCraftedsmeltedProcedure;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

import java.util.Map;
import java.util.HashMap;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class HuskItem extends SurvivalOfTheMinecraftistModElements.ModElement {
	@ObjectHolder("survival_of_the_minecraftist:husk")
	public static final Item block = null;
	public HuskItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("husk");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				HuskItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
