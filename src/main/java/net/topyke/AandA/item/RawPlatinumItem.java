
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawPlatinumItem extends Item {
    public RawPlatinumItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
