Feature: ice_hrm login and add the job title under job detail setup

@ice-hrm 
Scenario: Sucessfull ice_hrm Login
Given User must be login
When User enter credentials to login

|uid  |pwd     |
|admin|Squad123|

Then Login Sucessfull in ice hrm
Then user is on home page
Then click on  Qualifications Setup
Then enter the skill

| Name  | Description     |      
| ISTQB | istqb           |
| CCNA  |NETWORKING CORSE |