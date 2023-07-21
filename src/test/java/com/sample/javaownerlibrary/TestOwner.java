package com.sample.javaownerlibrary;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class TestOwner{
	private	String url;
	private String browser;
	private String username;
	private String password;
	private boolean headless;
	
	@Test
	public void readProperties() {
	//create an instance 
	GeneralConfig  genralConfig= ConfigFactory.create(GeneralConfig.class);
	url =genralConfig.baseUrl();
	browser =genralConfig.browser();
	username=genralConfig.username();
	password=genralConfig.password();
	headless=genralConfig.headless();
	
	
	System.out.println(url);
	System.out.println(browser);
	System.out.println(headless);	
	

	}
	
}


