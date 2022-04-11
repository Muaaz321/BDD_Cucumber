
@All
Feature: Uber booking feature

@Smoke @QA-Ready @UserStory-1234 @Epic-345
Scenario: Booking Cab Sedan
Given User wants to select a car type "Sedan" from uber application
When User selects car "Sedan" and pick up point "Townhall" and drop location "Dehiwala"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression @Smoke
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber application
When User selects car "SUV" and pick up point "Wellawatta" and drop location "Kollupitiya"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@LiveTest
Scenario: Booking Cab Mini
Given User wants to select a car type "Mini" from uber application
When User selects car "Mini" and pick up point "CinnamonGarden" and drop location "Kirulapone"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD