Feature: Phone Field  validation
  As an admin user
  I should be able to submit numbers and not able to submit letters

  Scenario: Add valid information
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click inside Phone field
    And I enter valid Phone Field data "7878787878"
    And when data being added I click Enter
    And I click Create Student
    Then I should see Phone Field data being added


  Scenario: Add invalid information
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click inside Phone field
    And I enter invalid Phone Field data "abcdefg"
    And when data being added I click Enter
    And I click Create Student
    Then I should see a Phone Field warning message