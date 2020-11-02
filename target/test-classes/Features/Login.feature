Feature: Sign In Module Scenarios

  @sanity
  Scenario Outline: This scenario is to test the Invalid Sign In Scenario
    Given User is already in the LoginPage
    When User enter the wrong "<UserName>" And User enter the wrong "<Password>"
    Then Error message will appear

    Examples: 
      | UserName | Password |
      | Test@gmail.com     | Test@1234     |