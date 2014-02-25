#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
Feature: Adding two numbers together
   As a calculator
   In order sum things
   I want learn how to add

   Scenario Outline: Adding numbers together
      Given two integers <a> and <b>
      When you add them together
      Then the total should be <total>

      Examples:
         |a|b|total|
         |1|2|3|
         |4|5|9|
