Feature: Check 200

Scenario: Checking response 200
  
	Given url microserviceUrl
	And path '/zeroFollowers'
	When method GET
	Then status 200
