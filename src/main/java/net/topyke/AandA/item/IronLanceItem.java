
package net.topyke.AandA.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class IronLanceItem extends ShovelItem {
    public IronLanceItem() {
        super(new Tier() {
            public int getUses() {
                return 250;
            }

            public float getSpeed() {
                return 1f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT));
            }
        }, 11, -3.3f, new Properties());
    }
}
