
package net.topyke.AandA.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class GoldenHatchetItem extends AxeItem {
    public GoldenHatchetItem() {
        super(new Tier() {
            public int getUses() {
                return 32;
            }

            public float getSpeed() {
                return 2f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
            }
        }, 1, -3f, new Item.Properties());
    }
}
