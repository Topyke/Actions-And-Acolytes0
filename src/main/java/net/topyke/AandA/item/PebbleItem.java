
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PebbleItem extends Item {
    public PebbleItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
