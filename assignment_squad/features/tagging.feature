Feature: ice_hrm all testing

@SmokeTest 
Scenario: login with valid username and valid password
Given this is valid logn test

@SmokeTest 
Scenario: login with invalid username and invalid password
Given this is invalid logn test

@SmokeTest 
Scenario: create company structure
Given this is add company structure test case

@RegressionTest
Scenario: add job title in admin module
Given this is add new job title test case

@SmokeTest 
Scenario: add skill in admin module
Given this is add new skill test case

@RegressionTest
Scenario: add client in admin module
Given this is add new client test case

@RegressionTest
Scenario: add project in admin module
Given this is add new project test case

@SmokeTest 
Scenario: add company loan  in admin module
Given this is add new  company loan test case

@RegressionTest
Scenario: add  loan type  in admin module
Given this is add new loan type test case

@EndToEndTest
Scenario: add employee in employee module
Given this is add new employee test case