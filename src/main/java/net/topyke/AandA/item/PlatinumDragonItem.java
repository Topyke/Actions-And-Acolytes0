
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlatinumDragonItem extends Item {
    public PlatinumDragonItem() {
        super(new Item.Properties().stacksTo(24).rarity(Rarity.RARE));
    }
}
