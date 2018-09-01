Feature: Excel Data Reader

@ExcelData
Scenario: mantis login by multiple login credentials
Given login in bugzilla
When user login with the following data with data in Excel at /home/luser/Desktop/bugzilla.xlsx
Then login sucessfully in bugzilla
