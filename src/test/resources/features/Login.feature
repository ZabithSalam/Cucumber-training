Feature: User Login

  Scenario: User is able to login with valid credentials.

    Given user enters valid username in username field
    And user enters valid password in the password field
    When user clicks on the login button
    Then user is logged in successfully

    Scenario: user id able to login with invalid credentails.

      Given user enters invalid username in username field
      And User enters invalid password in password field
      When user clicks on the login button
      Then user is not logged in to thr application



