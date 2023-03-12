
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilverShieldItem extends Item {
    public SilverShieldItem() {
        super(new Item.Properties().stacksTo(24).rarity(Rarity.COMMON));
    }
}
