package com.sample.javaownerlibrary;

import org.aeonbits.owner.Config;//import owner dependency

/*
 * for multiple config files to merge as one:
 * @LoadPolicy(LoadType.MERGE)
 * @Config.Sources({ "file:./src/main/resources/Config.properties" ,
 * file:./src/main/resources/Config1.properties})
 */




@Config.Sources({ "file:./src/main/resources/Config.properties" })
public interface GeneralConfig extends Config{
	
	
	@Key("base.url")//key defines where string defined with a dot
	String baseUrl();
	
	
	@DefaultValue("chrome")//give default value for property
	String browser();
	
	String username();
	
	String password();
	
	boolean headless();
	
	
	
}
