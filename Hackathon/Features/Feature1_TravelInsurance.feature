@tag
Feature: Travel Insurance

  Scenario: Selection of destination page
    Given Navigate to travel insurance page
    When click on any european country as destination (country="Germany")
    And click on next and navigate to Date page
    And select the Date and click on Next
    And select the number of travellers and enter the age and click on next
    And verify your Medical History and click on next(condition="NO")
    And Enter your Mobile Number
    And click on View plans and navigate to the plans page
    Then display three lowest international  travel insurance plan
