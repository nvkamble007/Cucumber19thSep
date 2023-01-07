Feature: Salesforce Login 
Scenario: HomePage Login 

	Given Initialise web driver 
	When user navigates to websites 
	And enter username and password and click on login button 
	Then user should be able to login successfully 