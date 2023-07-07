package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(id="input-email")
	public static WebElement EmailField;
	
	@FindBy(id="input-password")
	public static WebElement PasswordField;
	
	@FindBy(css="input[type='submit']")
	public static WebElement LoginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement WarningMsg;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement ForgottenPassword;
	
	public static void DoLogin(String username, String password) {
		
		Elements.TypeText(EmailField, username);
		Elements.TypeText(PasswordField, password);
		Elements.click(LoginButton);
	}
}
