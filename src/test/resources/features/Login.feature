Feature:Login
  As user,I want to be able to login to homepage
@Login
  Scenario:user login
    Given user is on the login page
    And user logs in
    Then user verifies sub title is "Web Orders"

