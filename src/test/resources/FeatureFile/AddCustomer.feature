Feature: Adding Customer details

  Scenario Outline: 
   # Given User Should be in home page
    And User Should click Addcustomer
    When User Enters all the details "<Fname>","<Lname>","<Email>","<Address>","<MobileNo>"
    And User clicks on submit
    Then User Should get Customer Id Displayed

    Examples: 
      | Subha  | Suresh | gksubhashini@gmail.com | Chennai   | 6789567895 |
      | Suresh | Gopal  | suresh@gmail.com       | Chennai   | 9087090870 |
      | Kavin  | Raj    | kavin@gmail.com        | Salem     | 6578465784 |
      | Saran  | Karthi | Saran@gmail.com        | Hyderabad | 7860978690 |
