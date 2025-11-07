Feature: login related scenarios


  Scenario: user is able to login using valid username and password
    Given user is able to access login page
    When user enters valid username
    And user enters valid password
    And user clicks on log in button
    Then user is successfully logged in

  Scenario: user is unable to login using invalid username and password
    Given user is able to access login page
    When user enters invalid username
    And user enters invalid password
    And user clicks on log in button
    Then user sees login error message
