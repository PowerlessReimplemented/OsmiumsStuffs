package qwefbine.mods.testarea.testmod1.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import qwefbine.mods.testarea.testmod1.*;
import qwefbine.mods.testarea.testmod1.blocks.*;
import qwefbine.mods.testarea.testmod1.utils.*;

public class ModBlocks {
	
	public static Block copper_block;
	public static Block tin_block;
	public static Block copper_ore;
	public static Block tin_ore;
	
	public static void init() {
		copper_block = new BlockCopperBlock("copper_block", "copper_block");
		tin_block = new BlockTinBlock("tin_block", "tin_block");
		copper_ore = new BlockCopperOre("copper_ore", "copper_ore");
		tin_ore = new BlockTinOre("tin_ore", "tin_ore");
	}
	
	public static void register() {
		registerBlock(copper_block);
		registerBlock(tin_block);
		registerBlock(copper_ore);
		registerBlock(tin_ore);
	}
	
	public static void registerRenders() {
		registerRender(copper_block);
		registerRender(tin_block);
		registerRender(copper_ore);
		registerRender(tin_ore);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Register block " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("RegisterRender for " + block.getUnlocalizedName().substring(5));
	}
	
}
