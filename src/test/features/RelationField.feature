Feature: Relation Field  validation
  As an admin user
  I should be able to submit letters and not able to submit numeric data

  Scenario: Add valid information
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click on Relation
    And I enter valid data "Brother"
    And I click Enter
    And I click Create Student
    Then I should see data being added


  Scenario: Add invalid information
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click on Relation
    And I enter invalid data "123456789"
    And I click Enter
    And I click Create Student
    Then I should see a warning message
