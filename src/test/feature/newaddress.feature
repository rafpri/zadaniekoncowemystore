Feature: MyStore new address
  ​
  Scenario Outline: user can add a new address
    Given an open website https://prod-kurs.coderslab.pl/index.php?controller=address
    When a keyword <alias> is entered in input field
    Then create new address with <alias>, <address>, <city>, <zip>, <country>, <phone>
    And close website

    Examples:

      | alias | address   | city     | zip    | country | phone     |
      | Kowal | Testowa 1 | Katowice | 40-141 | Poland  | 555544225 |