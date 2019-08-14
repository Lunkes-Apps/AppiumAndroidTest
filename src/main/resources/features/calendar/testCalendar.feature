#Author: Alexandre Lunkes
#Feature: List of scenarios to calculator.

@calendar
Feature: Test of calendar
  I want to use this template for my feature file

  @functional
  Scenario: Test add event
    Given I launch the calendar
    When I press in today number
    And I press button add event
    And I press in new event
    And I fill out the title of event
    And I press done    
    And I press save
    Then The title should be displayed in event area
    And The title shoudl be displayed in main page 
    
 