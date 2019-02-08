Feature: www.amazon.com Applications Test

  Scenario: Validate to user on www.amazon.com Home Page Test

    Given User is already on Home Page
    When go to the login page
    Then user enters username and password and click button
    And user is on home page
