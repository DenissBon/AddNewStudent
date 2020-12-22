Feature: Email field
  As an admin user
  I should be able to add valid email, when adding invalid/blank email address I should receive a message

  Scenario: Add valid email address
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I type in valid email address "Georgecane@gmail.com"
    And I click Create Student
    Then Email should be added


  Scenario: Add invalid email address
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I type in invalid email address "Georgecanegmail.com"
    And I click Create Student
    Then Should receive a warning message

  Scenario: Add blank email address
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click Create Student
    Then Should receive a warning message