Feature: Application login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "John" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Mike" and password "4334"
Then Home page is populated
And Cards displayed are "flase"


Scenario: Home page default login
Given User is on NetBanking landing page
When user signup with following details
| jenny | abcd | john@abcd.com | Australia | 32545455 |
Then Home page is populated
And Cards displayed are "false"

Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and <Password> "4334"
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username | Password |
|user1    | pass 1 |
|user2    | pass 2 |
|user 3   | pass 3 |

