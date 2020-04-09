Feature: Verify the Login functionality

Scenario: Verify the login functionality with all valid inputs

Given A user launched the browser
When A user is on login page
Then A user enters "test1@mailinator.com" and "Test@123"
And A user clicks on the login button
Then A user should navigate to the dashboard
Then A user close the browser
