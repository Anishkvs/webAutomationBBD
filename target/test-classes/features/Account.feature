Feature: Application login

@SmokeTest	
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "John" and password "1234"
Then Home page is populated
And Cards displayed are "true"

