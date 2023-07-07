package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.*;

public class orders {
	
	LoginPage loginPage = new LoginPage();
	HeadersSection headersSection = new HeadersSection();
	SearchResultPage searchResultPage =new SearchResultPage();
	CheckoutPage checkoutPage = new CheckoutPage();
	OrderSuccessPage orderSuccessPage = new OrderSuccessPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
		Elements.click(HeadersSection.MyAccount);
	    Elements.click(HeadersSection.Login);
		LoginPage.DoLogin(Base.reader.getUsername(), Base.reader.getPassword());
	    Browser.takeScreenshot();
	}
	
	@And("^I clear the cart$")
	public void i_clear_the_cart()  {
		
		
		MyAccountPage.IsCartEmpty();

	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout()   {
		
		Elements.TypeText(HeadersSection.SearchBox, Base.reader.getProduct());
		Elements.click(HeadersSection.SearchButton);
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.SamsungSyncMaster941BWSearchResult, "Samsung SyncMaster 941BW"));
		Elements.click(SearchResultPage.AddFirstProdust);
		Elements.click(HeadersSection.ShopingCart);
		Elements.click(ShoppingCartPage.CheckoutButton);
		
	    
	}

	@And("^I place an order$")
	public void i_place_an_order() throws InterruptedException   {
		
		CheckoutPage.PlaceAnOrder();
	 }

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
		
		Waits.waitUntilElementLocated(10, OrderSuccessPage.OrderSuccessMsg);
		Assert.assertTrue(Elements.VerifyTextEquals(OrderSuccessPage.OrderSuccessMsg, "Your order has been placed!"));
		
	    
	}



}
