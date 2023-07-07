package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ShoppingCartPage {
	
	public ShoppingCartPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	public static WebElement CheckoutButton;

}
