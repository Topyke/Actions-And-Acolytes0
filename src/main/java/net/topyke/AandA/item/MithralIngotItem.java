
package net.topyke.AandA.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MithralIngotItem extends Item {
    public MithralIngotItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
    }
}
