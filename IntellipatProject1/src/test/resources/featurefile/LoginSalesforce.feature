Feature: To validate login functionality

  @Sc01 @Salesforce
    #Before Hooks
  Scenario: validate the error message
    When user enters username "Mayank" and password "123"
    And user clicks on login button
    Then user validated the error message


