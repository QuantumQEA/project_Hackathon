Feature: Car Insurance page
  Scenario: Capturing Error Message By Invalid Login Credentials
    Given Navigate to Car insurance page
    When  Proceed without providing car number
    And   Select city and RTO
    And   Select Car Brand
    And   Select Car Model
    And   Select Car Variant
    And   Fill Details with Invalid Phone number and E-mail "<row_index>"
    Then  Print the error message displayed
    Examples: 
      | row_index |
      |      1    |
     