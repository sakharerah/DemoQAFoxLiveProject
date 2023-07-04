Feature: To verify login page.
	
	@Login @One
	Scenario: To verify login page with valid credential.
	Given I launch the application
	And I navigate to login page
	When I login with username "sakhare.rahul6@gmail.com" and password "Password@123" and click on login button
	Then I should see user get login sucessfully 
	
	@Login @Two
	Scenario: To verify user is not able to login with invalid credential.
	Given I launch the application
	And I navigate to login page
	When I login with username "sakhare.rahul6@gmail.com" and password "Password@12" and click on login button
	Then I should see an error message informing the User about invalid credentials
	
	@Login @Three
	Scenario: Verify that user is not able to login without providing credentials.
	Given I launch the application
	And I navigate to login page
	When I login with username "" and password "" and click on login button
	Then I should see an error message informing the User about invalid credentials
	
	@Login @Four
    Scenario: Verify that the User is able to reset forgotten password
    Given I launch the application
	  And I navigate to login page
	  When I reset the forgotten password for "sakhare.rahul6@gmail.com" this Email
	  Then I should see a message informing that the password reset details have been sent to the email address