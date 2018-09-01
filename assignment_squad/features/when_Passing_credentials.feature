Feature: login dillibar when passing credentials in program

@dolibar 
Scenario: Login
Given user must be login in dolibar
When enter "administrator" and "squ@d123"
Then Login Sucessfull in dolibar
	