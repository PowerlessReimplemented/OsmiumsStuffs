package qwefbine.mods.testarea.testmod1.proxy;

import qwefbine.mods.testarea.testmod1.init.*;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		super.registerRenders();
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
}
