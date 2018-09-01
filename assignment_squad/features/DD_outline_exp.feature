Feature: login and add new quotation entry in frontaccounting

@frontaccounting_Login_functionality
Scenario Outline: Login with multiple users and data

Given user must be login 
When enter enters"<username>"and "<password>"
Then click on add new custmer and manage customer link
Then user enters "<CustomerName>" and "<CustomerShortName>" and "<Address>"
Then successfull login and add the customer entry 
      
Examples:

|username  |password  |CustomerName |CustomerShortName|Address   |
|admin     |root      |tejas        |tej              |ghatkoper |
|admin     |root      |suraj        |sur              |asangoan  |
|admin     |root      |rajesh       |raj              |new panvel|