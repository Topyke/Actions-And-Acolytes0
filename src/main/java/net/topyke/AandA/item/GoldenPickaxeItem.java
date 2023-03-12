
package net.topyke.AandA.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GoldenPickaxeItem extends PickaxeItem {
    public GoldenPickaxeItem() {
        super(new Tier() {
            public int getUses() {
                return 32;
            }

            public float getSpeed() {
                return 12f;
            }

            public float getAttackDamageBonus() {
                return -1f;
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
        }, 1, -2.8f, new Item.Properties());
    }
}
