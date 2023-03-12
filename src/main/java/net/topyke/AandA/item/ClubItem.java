
package net.topyke.AandA.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;


public class ClubItem extends ShovelItem {
    public ClubItem() {
        super(new Tier() {
            public int getUses() {
                return 59;
            }

            public float getSpeed() {
                return 1f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 0;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Blocks.OAK_LOG), new ItemStack(Blocks.ACACIA_LOG));
            }
        }, 1, -2.7999999999999998f, new Item.Properties());
    }
}
