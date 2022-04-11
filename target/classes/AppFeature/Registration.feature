
Feature: User Registration

Scenario: User registration with different data
Given User is on registration page
When User enters following user details
 | muaaz | testaut | maz@gmail.com | 9090 | Colombo |
 | Sam   | testaut | S@gmail.com   | 7777 | Colombo |
 | Rob   | testaut | R@gmail.com   | 5555 | Colombo |
 | Pete  | testaut | P@gmail.com   | 4444 | Colombo |
 | Luck  | testaut | L@gmail.com   | 3333 | Colombo |
Then user registration should be successful

    
Scenario: User registration with different data
Given User is on registration page
When User enters following user details with columns
 |name	 | envior  | email         | code | city	  |
 | muaaz | testaut | maz@gmail.com | 9090 | Colombo |
 | Sam   | testaut | S@gmail.com   | 7777 | Colombo |
 | Rob   | testaut | R@gmail.com   | 5555 | Colombo |
 | Pete  | testaut | P@gmail.com   | 4444 | Colombo |
 | Luck  | testaut | L@gmail.com   | 3333 | Colombo |
Then user registration should be successful