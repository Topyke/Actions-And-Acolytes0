
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CopperCrowItem extends Item {
    public CopperCrowItem() {
        super(new Item.Properties().stacksTo(24).rarity(Rarity.COMMON));
    }
}
