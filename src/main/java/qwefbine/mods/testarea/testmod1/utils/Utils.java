package qwefbine.mods.testarea.testmod1.utils;

import org.apache.logging.log4j.*;
import qwefbine.mods.testarea.testmod1.*;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return logger;
	}
}
