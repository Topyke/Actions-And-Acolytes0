
package net.topyke.AandA.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;


public class PlatinumHatchetItem extends AxeItem {
    public PlatinumHatchetItem() {
        super(new Tier() {
            public int getUses() {
                return 288;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 3f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 18;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ModItems.PLATINUM_INGOT.get()));
            }
        }, 1, -3f, new Item.Properties());
    }
}
