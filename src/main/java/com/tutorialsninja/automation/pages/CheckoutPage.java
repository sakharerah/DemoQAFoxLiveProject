package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	public CheckoutPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	
	@FindBy(id="button-payment-address")
	public static WebElement ButtonPaymentAddress;
	
	@FindBy(id="button-shipping-address")
	public static WebElement ButtonShippingAddress;

	@FindBy(id="button-shipping-method")
	public static WebElement ButtonShippingMethod;
	
	@FindBy(css="input[type='checkbox'][value='1']")
	public static WebElement TandCCheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement ButtonPaymentMethod;
	
	@FindBy(id="button-confirm")
	public static WebElement ConfirmOrderButton;
	
	
	public static void PlaceAnOrder() throws InterruptedException {
Elements.click(CheckoutPage.ButtonPaymentAddress);
		
		Elements.click(CheckoutPage.ButtonShippingAddress);
		
		Elements.click(CheckoutPage.ButtonShippingMethod);
		
		Elements.click(CheckoutPage.TandCCheckbox);
		Elements.click(CheckoutPage.ButtonPaymentMethod);
		
		Elements.click(CheckoutPage.ConfirmOrderButton);
		
		Thread.sleep(3000);
		
	}
	
	
}
