
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldGriffonItem extends Item {
    public GoldGriffonItem() {
        super(new Item.Properties().stacksTo(24).rarity(Rarity.UNCOMMON));
    }
}
