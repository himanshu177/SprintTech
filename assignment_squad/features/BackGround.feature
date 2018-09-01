Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
Background: User is Logged In
	Given user should  navigate to the login page
	When user  should submit valid username and valid password
	Then user should be logged in 
	
	
 @addproject
 Scenario: Add project in ice hrm 
	Given click on project under project setup
	When add new project
	Then project  is created sucessfuly
	
	@addclient
	Scenario: Add client in ice hrm 
	Given click on client under project/client setup
	When add new client
	Then client is created sucessfuly
	
	
	