#Author: Alexandre Lunkes
#Feature: List of scenarios to calculator.

@calculator
Feature: Title of your feature
  I want to use this template for my feature file

  @functional
  Scenario Outline: Test plus function
    Given I launch the calculator
    When I press number "<first>"
    And I press key plus
    And I press number "<second>"
    And I press key equal
    Then The calculator will display "<result>" 
    
 		Examples:
  	|first|second|result|
  	|4    |5     |9     | 
  	|10   |15    |25    | 
  	|234  |54    |288   | 
  	|1467 |32145 |33612 | 
  	
  	
  @functional
  Scenario Outline: Test minus function
    Given I launch the calculator
    When I press number "<first>"
    And I press key minus
    And I press number "<second>"
    And I press key equal
    Then The calculator will display "<result>" 
    
 		Examples:
  	|first|second|result|
  	|4    |5     |-1    | 
  	|10   |4     |6     | 
  	|234  |54    |80    | 
  	|1467 |467   |1000  | 
  	  
  
  