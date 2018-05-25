Feature: Working with search https://www.sputnik.ru
  Scenario: Use searching
    Given user opens the site
    When user search for 'Maven'
    Then user see table result
