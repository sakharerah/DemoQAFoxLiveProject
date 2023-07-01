Feature:  Ragistration functionllity scenario

@Register @One
Scenario: Verify whether the user is able to ragiter into application by providing all the deatails.
	Given I launch the application
	And I navigate to Account Registration page
	When I fill all the below vaild deatils
		|FirstName	|Rahul										|
		|LastName 	|Sakhare									|
		|E-Mail 		|sakhare.rahul6@gmail.com	|
		|Telephone 	|8698738660								|
		|Password 	|Password@123							|
	And I select privacy policy
	And I click on Continue button
	Then I should see that user account has created
	
@Register @Two
Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
 	Given I launch the application
 	And I navigate to Account Registration page
 	When I click on Continue button
 	Then I should see that the User Account is not created
 	And I should see the error messages informing the user to fill the mandatory fields
 	
 	@Register @Three
  Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
  	Given I launch the application
	And I navigate to Account Registration page
	When I fill all the below vaild deatils
		|FirstName	|Rahul										|
		|LastName 	|Sakhare									|
		|E-Mail 		|sakhare.rahul6@gmail.com	|
		|Telephone 	|8698738660								|
		|Password 	|Password@123							|
    And I subscribe to Newsletter
    And I select privacy policy
		And I click on Continue button
		Then I should see that user account has created

@Register @Four		
Scenario: Verify whether the user is restricted from registring a duplicate account
  	Verify whether the user is able to ragiter into application by providing all the deatails.
	Given I launch the application
	And I navigate to Account Registration page
	When I provide the below duplicate details into the fields
		|FirstName	|Rahul										|
		|LastName 	|Sakhare									|
		|E-Mail 		|sakhare.rahul6@gmail.com	|
		|Telephone 	|8698738660								|
		|Password 	|Password@123							|
	And I select privacy policy
	And I click on Continue button
	Then I should see the warning message stating that the user is already created