
package net.mcreator.survivaloftheminecraftist.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.survivaloftheminecraftist.itemgroup.SOTMToolsAndWeaponsItemGroup;
import net.mcreator.survivaloftheminecraftist.SurvivalOfTheMinecraftistModElements;

@SurvivalOfTheMinecraftistModElements.ModElement.Tag
public class TopazSwordItem extends SurvivalOfTheMinecraftistModElements.ModElement {
	@ObjectHolder("survival_of_the_minecraftist:topaz_sword")
	public static final Item block = null;
	public TopazSwordItem(SurvivalOfTheMinecraftistModElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(SOTMToolsAndWeaponsItemGroup.tab)) {
		}.setRegistryName("topaz_sword"));
	}
}
