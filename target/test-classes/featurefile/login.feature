Feature: Application login

Scenario: user login default home page

Given user is on net banking page
When user login into application with "manu" and "1234"
Then Home page is populated 
And Cards are displayed



