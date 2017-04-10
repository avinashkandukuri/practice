Feature: Test facebook somke scenario 

Scenario Outline: test login with valid credentials 

	Given open firefox and start application 
	When I enter valid "<username>" and "<password>" 
	Then user should able to login succesfully 
	
	Examples: 
		| username | password |
		|avinash123 | 123456 |
		|avinash4568 | abcde |
		|avinash0303 |             |
		