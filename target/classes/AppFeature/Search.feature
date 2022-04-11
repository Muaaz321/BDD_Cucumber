
Feature: Amazon Search

@Smoke
Scenario: Search a product MacBook Air
Given I have a search field on Amazon Page
When  I search for a product with name "Apple MacBook Pro" and price 344
Then Product with name "Apple MacBook Pro" should be displayed
And Orderid is 12456 and username is "Muaaz"
And this is test for dry run

@Regression
Scenario: Search a product iPhone
Given I have a search field on Amazon Page
When  I search for a product with name "iPhone" and price 4533
Then Product with name "iPhone" should be displayed
And Orderid is 778 and username is "Muaaz iPhone"