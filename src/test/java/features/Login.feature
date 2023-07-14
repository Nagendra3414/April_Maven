Feature: Login functionality

Background:
Given Open the browser and URL
Then print something

@Regression
Scenario: Login with valid username and valid password

When Enter the Username
Then Enter the Password
Then Clcik on Login button
Then Close the Browser

@Smoke @Regression
Scenario: Login with invalid username and valid password

When Enter the invalid Username
Then Enter the Password
Then Clcik on Login button
Then Close the Browser


@Smoke
Scenario: Login with invalid username and invalid password

When Enter the invalid Username
Then Enter the invalid Password
Then Clcik on Login button
Then Close the Browser

@Regression
Scenario Outline: Login with multiple set of date

Then Enter <username> and <password>
And Clcik on Login button
But Close the Browser

Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|