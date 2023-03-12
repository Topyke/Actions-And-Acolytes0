
package net.mcreator.ana.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class GoldenHoeItem extends HoeItem {
    public GoldenHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 32;
            }

            public float getSpeed() {
                return 4f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 22;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
            }
        }, 0, -2f, new Item.Properties());
    }
}
