package com.tutorialsninja.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;


public class MyAccountPage {

	public MyAccountPage(){
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(linkText="Register for an affiliate account")
	public static WebElement RegisterForAnAffiliateAccount;
	
	@FindBy(css="button[type=\"button\"][class$='dropdown-toggle']")
	public static WebElement MyCart;
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li/p")
	public static WebElement MyCartIsEmpty;
	
	@FindBy(css="button[title='Remove']")
	public static WebElement DoCartEmpty;
	
	
	@SuppressWarnings("finally")
	public static boolean IsCartEmpty() {
		 
		Elements.click(MyAccountPage.MyCart);	
		try {
			  	Elements.isDisplayed(DoCartEmpty);
			  	Elements.click(MyAccountPage.DoCartEmpty);
		    return true;
		  } finally {
			  Elements.isDisplayed(MyCartIsEmpty);
			    return true;
		  }
		}
	
	
	
}

