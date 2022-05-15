Feature: Login
  Scenario: ETSTUR Login
    Given goto site
    And enter username "muzafferanil@gmail.com"
    And enter password "123aqwe"
    When click login button
    Then login is success