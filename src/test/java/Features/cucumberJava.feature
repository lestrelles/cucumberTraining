Feature: CucumberJava

  Scenario: Registered User is able to login to Automation Testing Page

    Given I navigate to the login page
    When  I enter username and password
    And  I click login button
    Then User Login is successful