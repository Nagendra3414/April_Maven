Feature: Login functionality testing with multiple set of data


@Smoke
Scenario Outline: Login with multiple set of date

Given Launch the browser and open URL
Then Enter <username> and <password>
And Clcik on Login button
But Close the Browser

Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|