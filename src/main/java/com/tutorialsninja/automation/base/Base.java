package com.tutorialsninja.automation.base;

import org.openqa.selenium.WebDriver;


import com.tutorialsninja.automation.config.PropertyFileReader;


import org.apache.log4j.Logger;



public class Base {
	
	public static Logger log=Logger.getLogger(Base.class);
	
	public static WebDriver driver;
	public static PropertyFileReader reader;
	
	
	
	}


