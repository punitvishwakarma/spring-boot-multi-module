Feature: Response Array

Scenario: Checking response contains array value
  
	Given url microserviceUrl
	And path '/zeroFollowers'
	When method GET
	Then status 200
	* match  response[0].login contains 'errfree'
