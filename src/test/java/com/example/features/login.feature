Feature: Login Functionality

  Scenario: Successful login
    Given I open the OrangeHRM login page
    When I login with username "Admin" and password "admin123"
    Then I should see the dashboard
