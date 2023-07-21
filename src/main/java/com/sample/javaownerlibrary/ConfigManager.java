package com.sample.javaownerlibrary;

import org.aeonbits.owner.ConfigCache;

public class ConfigManager {
	
	
	
	//method to return single instance of configuration
	//get rid of creating multiple instance in each method
		public static GeneralConfig config() {
			return ConfigCache.getOrCreate(GeneralConfig.class);
		}
}
