Feature: Saucedemo Logout Functionality Check

  Scenario: Logout functionality check 
    Given I open the Saucedemo login page
    When I enter username standard user
    And I enter password
    And I click the login button
    Then I should see the Products page
    And I click on Hamburger Menu
    And I click on Logout
    Then Validate I logged out successfully