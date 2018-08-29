Feature: Admin module in icehrm using cucumber framework
Description: The purpose of this feature is to test the HRMS project
 
Background: User is Log in ice-hrm project 
	Given user must navigate to the login page of ice-hrm 
	When user must submit valid credentials
	
		|USERNAME  |PASSWORD|
    |admin     |Squad123|
    
	Then user should be logged in project 
	

	
@AddProject
Scenario: Add new project in PROJECT/CLIENT SETUP Under Admin Module 
	Given click on add project under project setup in Admin module
	When Add new project in ice-hrm
	Then project is created successfuly in ice-hrm
	
@AddClient
Scenario: Add new client in PROJECT/CLIENT SETUP Under Admin Module 
	Given click on client under client setup in Admin Module
	When Add new client in ice-hrm 
	Then client is created successfuly in ice-hrm	
	
@AddSkill
Scenario: Add new skill in Qualifications setup Under Admin module
Given click on Add new skill under Qualifications setup in Admin module
When Enters the following Skills

| Name  | Description     |      
| ISTQB | istqb           |
| CCNA  |NETWORKING CORSE |

Then Skill is added successfuly in Ice-hrm



@AddJobtitle
Scenario Outline: add job-title with multiple data

Given click on add new job-title under job-Detail setup under Admin -module 
When click on add new job-title 
Then user enters "<JobTitleCode>" and "<JobTitle>" and "<Description>" and "<Specification>"
Then successfully add the job-title entry 
      
Examples:

|JobTitleCode  |JobTitle         |Description          |Specification         |
|DEV           |Developer        |computer engineer    |computer engineer     |
|TEST          |tester           |computer engineer    |computer engineer     |
|TLEA          |test lead        | IT enineer          | IT enineer           |










