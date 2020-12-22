Feature: Time Slot functionality
  As an admin user
  I should be able to add/delete a time slot in STUDENT ENROLMENT section

  Scenario: Add Time Slot
    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click on + button
    Then I should see Time Slot being added







  Scenario: Delete Time Slot

    Given I'm on LoginPage "http://demo.dontonno.com/cms-test-v2/auth/login"
    When I enter Email "admin@coaching.com"
    And I enter Password "22091671"
    And I click Login button
    And I click on Students
    And I click Add New Student
    And I click on + button
    And I click on bin sign
    Then I should see Time Slot being removed

