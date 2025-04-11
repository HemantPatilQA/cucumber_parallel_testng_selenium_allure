Feature: Dashboard Functionality

  Scenario: Verify dashboard widgets
    Given I open the OrangeHRM login page
    When I login with username "Admin" and password "admin123"
    Then I should see some widgets on dashboard
