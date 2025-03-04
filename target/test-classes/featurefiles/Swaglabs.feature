Feature: Test SwagLab Application

  Scenario: Test login with valid credentials
    Given I open the SwagLab application
    When I enter a valid username and password
    And I click on the SwagLab login button
    Then I should be able to log in and navigate to the inventory page
