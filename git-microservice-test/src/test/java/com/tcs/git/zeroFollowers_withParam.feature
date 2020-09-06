Feature: Comma Separated Parameters 

Scenario: Testing commas in param values
  
	Given url microserviceUrl
	And path '/zeroFollowers'
	And param items = '0,1,3'
	When method GET
	Then status 200
	And match $.length() == 3
