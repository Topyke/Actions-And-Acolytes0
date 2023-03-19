package net.topyke.AandA.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.topyke.AandA.AandA;
import net.topyke.AandA.item.ModItems;

public class IronJavelinProjectileHitsPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        AandA.queueServerWork(20, () -> {
            if (!world.isClientSide()) {
                if (Math.random() < 0.7) {
                    if (entity.isAlive()) {
                        if (world instanceof Level _level && !_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.AIR));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                    }
                    if (!entity.isAlive()) {
                        if (world instanceof Level _level && !_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.IRON_JAVELIN.get()));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                    }
                }
            }
        });
    }
}
