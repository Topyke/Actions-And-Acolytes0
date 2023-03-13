
package net.topyke.AandA.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class PlatinumShortswordItem extends SwordItem {
    public PlatinumShortswordItem() {
        super(new Tier() {
            public int getUses() {
                return 288;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 18;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(ModItems.PLATINUM_INGOT.get()));
            }
        }, 3, -2.4f, new Item.Properties());
    }

}
