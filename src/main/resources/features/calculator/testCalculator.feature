#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@calculator
Feature: Title of your feature
  I want to use this template for my feature file

  @functional
  Scenario: Test plus numbers
    Given I launch the calculator
    When I press number "4"
    And I press key plus
    And I press number "5"
    And I press key equal
    Then The calculator will display "9" 
    
  @functional
  Scenario: Test plus numbers2
    Given I launch the calculator
    When I press number "53"
    And I press key plus
    And I press number "445"
    And I press key equal
    Then The calculator will display "498" 

  