Feature: Login  functionality

Scenario: Login with  valid credentials page
Given User naviagtes to Login page
When User enters the email "amotooricap9@gmail.com" in email field
And User enters the password "12345" in password field
And click on the login button
Then User gets the success page

Scenario: Login with  invalid credentials page
Given User naviagtes to Login page
When User enters the invalid email "aamotooricap9@gmail.com" in email field
And User enters the invalid password "112345" in password field
And click on the login button
Then User gets the proper warning messages mismatch

Scenario: Login with  valid mail and invalid  password
Given User naviagtes to Login page
When User enters the valid email "amotooricap9@gmail.com" in email field
And User enters the innvalid password "112345" in password field
And click on the login button
Then User gets the proper warning messages mismatch


Scenario: Login with  with out credentials
Given User naviagtes to Login page
When User enters the without email  in email field
And User enters the with out password  in password field
And click on the login button
Then User gets the proper warning messages mismatch




