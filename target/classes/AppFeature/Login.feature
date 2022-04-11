Feature: Login feature

Scenario Outline: Login fail - possible combination
Given user is on Application landing page
When user clicks on Sign in button
Then user is displayed login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in password field
And user clicks Sign in button
Then user gets login failed error message
But sign in button is not present

	Examples:
	| UserName						| Password					|
	| inccorrectusername 	| 123456 	  				|
	| muaazlogin					| incorrectpassword |
