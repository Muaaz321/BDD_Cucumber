Feature: Amazon Order Page
	In Order to check my order details 
	As a registered user 
	I want to specify the features of order details page
	
	Background:
		Given a registered user exists
		And user is on Amazon login details
		When user enters username
		And user enters password
		And user clicks on login button
		Then user navigates to order page
	
	
	
	Scenario: Check previous order details
		When User clicks on previousorder link
		Then User checks the previous order details 
	

	Scenario: Check open order details
		When User clicks on openorder link
		Then User checks the previous order details 
	
	Scenario: Check cancelled order details
		When User clicks on cancelledsorder link
		Then User checks the previous order details 