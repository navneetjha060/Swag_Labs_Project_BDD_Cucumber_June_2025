Feature: Saucedemo login

  Scenario: Login with valid credentials
    Given I open the Saucedemo login page
    When I enter username
    And I enter password
    And I click the login button
    Then I should see the Products page
