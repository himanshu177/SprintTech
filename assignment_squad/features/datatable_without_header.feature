Feature: frontaccounting login and add the quotation entry

@frontaccounting_Login_functionality
Scenario: Login
Given User should be login
When enter credentials to login

|admin|root|

Then add customer in sales

|eirsha  |eirshh  |new panvel|
|himanshu|himan   |panvel    |

Then successfully add the customers
