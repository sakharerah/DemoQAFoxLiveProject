package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver,this);
	}
		
	
	@FindBy(id="input-firstname")
	public static WebElement FirstName;
	
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(id="input-confirm")
	public static WebElement PasswordConfirm;

	@FindBy(xpath="//input[@type=\"checkbox\"]")
	public static WebElement PrivacyPolicy;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	public static WebElement ContinueButton;
	
	@FindBy(linkText="Register")
	public static WebElement RegisterBreadCrum;
	
	@FindBy(css="input[id=\"input-firstname\"]+div")
	public static WebElement FirstNameWarning;
	
	@FindBy(css="input[id=\"input-lastname\"]+div")
	public static WebElement LastNameWarning;
	
	@FindBy(css="input[id=\"input-email\"]+div")
	public static WebElement EmailWarning;
	
	@FindBy(css="input[id=\"input-telephone\"]+div")
	public static WebElement TelephoneWarning;
	
	@FindBy(css="input[id=\"input-password\"]+div")
	public static WebElement PasswordWarning;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement MainWarning;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement YesToSubscribe;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement EmailAlreadyUsed;
	
	public static void EnterAllDetails (DataTable dataTable, String DetailsType) {
		
		Map<String,String> map = dataTable.asMap(String.class,String.class);
		Elements.TypeText(RegisterPage.FirstName,map.get("FirstName"));
		Elements.TypeText(RegisterPage.LastName,map.get("LastName"));

		Elements.TypeText(RegisterPage.Telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.Password, map.get("Password"));
		Elements.TypeText(RegisterPage.PasswordConfirm, map.get("Password"));
		
		if (DetailsType.equalsIgnoreCase("duplicate"))
			Elements.TypeText(RegisterPage.Email,map.get("E-Mail"));
		else
			Elements.TypeText(RegisterPage.Email,System.currentTimeMillis()+map.get("E-Mail"));

		
		
		
	}
	
	public static void DuplicateDetails(DataTable datatable) {
		
		Map<String,String> map = datatable.asMap(String.class,String.class);
		Elements.TypeText(RegisterPage.FirstName,map.get(FirstName));
		Elements.TypeText(RegisterPage.LastName,map.get("LastName"));
		Elements.TypeText(RegisterPage.Email,map.get("E-Mail"));
		Elements.TypeText(RegisterPage.Telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.Password, map.get("Password"));
		Elements.TypeText(RegisterPage.PasswordConfirm, map.get("Password"));
		
		
	}
}
