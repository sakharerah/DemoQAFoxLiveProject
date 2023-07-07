package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchResultPage {
	
	public SearchResultPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement SamsungSyncMaster941BWSearchResult;
	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement EmptySearchResult;

	@FindBy(xpath="//span[text()='Add to Cart']")
	public static WebElement AddFirstProdust;
}
