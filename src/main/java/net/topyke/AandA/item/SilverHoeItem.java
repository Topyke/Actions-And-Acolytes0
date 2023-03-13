
package net.topyke.AandA.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class SilverHoeItem extends HoeItem {
    public SilverHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 96;
            }

            public float getSpeed() {
                return 4f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 18;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ModItems.SILVER_INGOT.get()));
            }
        }, 0, -2f, new Item.Properties());
    }
}
