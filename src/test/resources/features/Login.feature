Feature:  User wants to test the login scenarios with valid and invalid credentials;

  @loginvalid
  Scenario: Verify Login with valid credentials
    Given User is on parabank login page
    When User logs in with username "seleniumuser" and password "seleniumuser"
    Then User should be redirected to the Dashboard


