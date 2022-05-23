#login page created by Revathi
#20may2022
Feature: Validate Login Functionality and Reset password

Scenario: Login Validation
Given Launch Facebook on browser
When validate page title
Then validate page content
And validate placeholder
When Enter username as "abc" and password as "prt"
Then Click on login button
And Terminate browser