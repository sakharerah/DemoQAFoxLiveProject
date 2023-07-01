Feature:  Ragistration functionllity scenario

@Register @One
Scenario: Verify whether the user is able to ragiter into application by providing all the deatails.
	Given I launch the application.
	And I navigate to ragister page.
	When I fill all the below vaild deatils
		|First Name	|Rahul										|
		|Last Name 	|Sakhare									|
		|E-Mail 		|sakhare.rahul6@gmail.com	|
		|Telephone 	|8698738660								|
		|Password 	|Password@123							|
	And I select privacy policy
	And I click on continew button
	Then I should see that user account has created