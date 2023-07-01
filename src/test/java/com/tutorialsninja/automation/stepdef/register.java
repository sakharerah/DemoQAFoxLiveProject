package com.tutorialsninja.automation.stepdef;


import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class register {
	
	@Given("^I launch the application\\.$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
		
		
	    
	}

	@And("^I navigate to ragister page\\.$")
	public void i_navigate_to_ragister_page() {
	    
	}

	@When("^I fill all the below vaild deatils$")
	public void i_fill_all_the_below_vaild_deatils(DataTable DataTable)  {
	    
	}

	@And("^I select privacy policy$")
	public void i_select_privacy_policy() {
	    
	}

	@And("^I click on continew button$")
	public void i_click_on_continew_button() {
	   
	}

	@Then("^I should see that user account has created$")
	public void i_should_see_that_user_account_has_created() {
	    
	}


	

}
