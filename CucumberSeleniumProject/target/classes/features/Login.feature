Feature: Login Action

#Scenario: Successful Login with Valid Credentials
Scenario Outline: Successful Login with Valid Credentials using Scenario
    Given User is on Home Page
    When User Navigate to LogIn Page
    #And User enters UserName and Password
    #And User enters "testuser" and "Password@123"
   	And User enters "<username>" and "<password>"

    Then Message displayed Login Successfully
    
    Examples:
    | username   | password |
    | testuser_1 | Test@123 |
    | testuser_2 | Test@153 |
    