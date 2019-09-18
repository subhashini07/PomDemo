Feature: Choosing Tariff Plans

  Scenario Outline: 
   # Given User should be in  Homepage
    And User should click AddTariff
    When User Enters all the details "<Rental>","<LocMin>","<InterMin>","<SMS>","<LocCharg>","<InterCharg>","<SMSCharg>"
    And User clicks Submit
    Then User Should get displayed Congratulation message

    Examples: 
      | 6995 | 120 | 400 | 100 | 1 | 2 | 3 |
      |  500 |  50 | 300 |  58 | 2 | 3 | 4 |
      |  200 |  90 |  80 |  40 | 4 | 5 | 6 |
      |  300 | 100 |  20 |  70 | 6 | 7 | 8 |
