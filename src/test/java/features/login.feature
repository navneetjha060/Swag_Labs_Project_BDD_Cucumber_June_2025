Feature: Saucedemo login

  @Smoke
  Scenario: Login with valid credentials
    Given I open the Saucedemo login page
    When I enter username standard user
    And I enter password
    And I click the login button
    Then I should see the Products page
    
    
    
    
    Scenario Outline: Check Login Functionality is working as expected for different credentials
    Given I open the Saucedemo login page
    When I enter "<uname>"
    And I enter password
    And I click the login button
    Then I should see the Products page
    
    Examples: 
      | uname   | 
      | standard_user | 
      | problem_user |
      | performance_glitch_user |
      
      
      
    @Smoke  
    Scenario: Login with invalid credentials
    Given I open the Saucedemo login page
    When I enter username locked_out_user
    And I enter password
    And I click the login button
    Then Validate Invalid Login Error
     
