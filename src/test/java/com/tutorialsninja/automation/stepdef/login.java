package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.*;

public class login {
	
	HeadersSection headersSection = new HeadersSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage();
	
	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() {
		
	    Elements.click(HeadersSection.MyAccount);
	    Elements.click(HeadersSection.Login);
	}

	@When("^I login with username \"([^\"]*)\" and password \"([^\"]*)\" and click on login button$")
	public void i_login_with_username_and_password_and_click_on_login_button(String username, String password)  {
		
		LoginPage.DoLogin(username, password);
	}

	@Then("^I should see user get login sucessfully$")
	public void i_should_see_user_get_login_sucessfully()  {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.RegisterForAnAffiliateAccount));
	    
	}

	@Then("^I should see an error message informing the User about invalid credentials$")
	public void i_should_see_an_error_message_informing_the_User_about_invalid_credentials()  {
	    
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.WarningMsg, "Warning: No match for E-Mail Address and/or Password."));
		
			
	}


	@When("^I reset the forgotten password for \"([^\"]*)\" this Email$")
	public void i_reset_the_forgotten_password_for_this_Email(String Email)  {
		
		Elements.click(LoginPage.ForgottenPassword);
		Elements.TypeText(ForgottenPasswordPage.email, Email);
		Elements.click(ForgottenPasswordPage.Continue);
	    
	}

	@Then("^I should see a message informing that the password reset details have been sent to the email address$")
	public void i_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_the_email_address()   {
	    
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.WarningMsg, "An email with a confirmation link has been sent your email address."));
		
	}

}
