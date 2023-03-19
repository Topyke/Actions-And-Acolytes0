package net.topyke.AandA.item;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.topyke.AandA.item.ModItems;

public class IronJavelinProjectileHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (!world.isClientSide()) {
            if (Math.random() < 0.7) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.IRON_JAVELIN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }
    }
}
