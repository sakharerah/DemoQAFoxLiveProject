package com.tutorialsninja.automation.stepdef;


import java.util.Map;

import org.apache.http.util.Asserts;
import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class register {
	
	HeadersSection headersSection = new HeadersSection();
	RegisterPage registerPage =new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page() {
		
		Elements.click(HeadersSection.MyAccount);
		Elements.click(HeadersSection.register);
	    
	}

	@When("^I fill all the below vaild deatils$")
	public void i_fill_all_the_below_vaild_deatils(DataTable dataTable)  {
		
		RegisterPage.EnterAllDetails(dataTable,"Valid");
	    
	}

	@And("^I select privacy policy$")
	public void i_select_privacy_policy() {
		
		Elements.click(RegisterPage.PrivacyPolicy);
	}

	@And("^I click on Continue button$")
	public void i_click_on_continue_button() {
		
		Elements.click(RegisterPage.ContinueButton);
	   
	}

	@Then("^I should see that user account has created$")
	public void i_should_see_that_user_account_has_created() {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.SuccessBreadcrum));		
		
	    }


	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.RegisterBreadCrum));
	    
	}

	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.FirstNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.LastNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.EmailWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.TelephoneWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.PasswordWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.MainWarning));
		
	}
	
	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() {
	    
		Elements.click(RegisterPage.YesToSubscribe);
	}
	
	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable datatable) {
	   
		RegisterPage.EnterAllDetails(datatable, "duplicate");
		
		
	}

	@Then("^I should see the warning message stating that the user is already created$")
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.MainWarning, "Warning: E-Mail Address is already registered!"));
	    
	}


	

}
