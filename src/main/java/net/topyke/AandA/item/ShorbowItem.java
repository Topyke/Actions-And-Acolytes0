package net.topyke.AandA.item;

import net.minecraft.world.item.*;

public class ShorbowItem extends BowItem {
    public ShorbowItem(Properties Rarity) {
        super(new Item.Properties().stacksTo(1).rarity(net.minecraft.world.item.Rarity.COMMON));

    }
    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    @Override
    public void setDamage(ItemStack stack, int damage) {

        super.setDamage(stack, 6);
    }
}

