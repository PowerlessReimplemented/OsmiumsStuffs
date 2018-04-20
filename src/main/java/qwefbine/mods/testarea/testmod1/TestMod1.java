package qwefbine.mods.testarea.testmod1;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import qwefbine.mods.testarea.testmod1.init.*;
import qwefbine.mods.testarea.testmod1.proxy.*;
import qwefbine.mods.testarea.testmod1.utils.*;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TestMod1 {
	
	@Mod.Instance(Reference.MODID)
	public static TestMod1 instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Utils.getLogger().info("pre init...");
		ModItems.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Utils.getLogger().info("init...");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//Utils.getLogger().info("post init...");
	}
	
}
