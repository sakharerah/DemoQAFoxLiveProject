package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection {

	public HeadersSection () {
		
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement MyAccount;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement Login;
	
	@FindBy(css="input[name='search'][class$='input-lg']")
	public static WebElement SearchBox;
	
	@FindBy(css="button[type='button'][class$='btn-lg']")
	public static WebElement SearchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement ShopingCart;
	
}
