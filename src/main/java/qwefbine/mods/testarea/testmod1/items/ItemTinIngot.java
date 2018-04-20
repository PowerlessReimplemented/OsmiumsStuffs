package qwefbine.mods.testarea.testmod1.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import qwefbine.mods.testarea.testmod1.*;

public class ItemTinIngot extends Item{
	
	public ItemTinIngot(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}
