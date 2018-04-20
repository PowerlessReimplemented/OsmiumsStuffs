package qwefbine.mods.testarea.testmod1.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwefbine.mods.testarea.testmod1.*;
import qwefbine.mods.testarea.testmod1.items.*;
import qwefbine.mods.testarea.testmod1.utils.*;

public class ModItems {
	
	public static Item copper_ingot;
	public static Item tin_ingot;
	
	public static void init() {
		copper_ingot = new ItemCopperIngot("copper_ingot", "copper_ingot");
		tin_ingot = new ItemTinIngot("tin_ingot", "tin_ingot");
	}
	
	public static void register() {
		registerItem(copper_ingot);
		registerItem(tin_ingot);
	}
	
	public static void registerRenders() {
		registerRender(copper_ingot);
		registerRender(tin_ingot);
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Register item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory")); 
		Utils.getLogger().info("RegisterRender for " + item.getUnlocalizedName().substring(5));
	}
	
}
