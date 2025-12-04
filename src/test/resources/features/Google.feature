Feature: Login Test

  @Login
  Scenario: Verify google page title
    Given I open Google
    Then Page title should be displayed

  @GoogleSearch
  Scenario: Verify Google search functionality
    Given User opens Google
    Then Google title should be displayed
    When User searches for "Selenium WebDriver"
    Then Search results should be displayed
