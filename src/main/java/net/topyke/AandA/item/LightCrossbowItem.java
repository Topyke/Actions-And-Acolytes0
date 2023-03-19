package net.topyke.AandA.item;

import net.minecraft.world.item.*;

public class LightCrossbowItem extends CrossbowItem {
    private static float getShootingPower(ItemStack p_40946_) {
        return containsChargedProjectile(p_40946_, Items.FIREWORK_ROCKET) ? 1.6F : 3.15F;
    }

    public LightCrossbowItem(Properties Rarity) {
        super(new Properties().stacksTo(1).rarity(net.minecraft.world.item.Rarity.COMMON));


    }
    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.CROSSBOW;
    }

    @Override
    public void setDamage(ItemStack stack, int damage) {

        super.setDamage(stack, 8);


    }

    @Override
    public int getDefaultProjectileRange() {
        return super.getDefaultProjectileRange();
    }
}

