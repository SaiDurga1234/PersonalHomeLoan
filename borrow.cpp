Feature: Homeloan Estimate Borrow
  As a User page :https://www.anz.com.au/personal/home-loans/calculator-tools/much-borrow/
  I want to start over a form with some personal information to Estimate borrow
  And be redirected to a clear form.

  Scenario: Form Clear
    Given I visit "https://www.anz.com.au/personal/home-loans/calculator-tools/much-borrow/"
    And I select "single" on radio "Application type",
    And I select "0" from dropdown "Number of dependants",
    And I select "Home to live in" on radio "Property you would like to buy",
    And I type "$80000" into field "Your annual income",
    And I type "$10000" into field "Your annual other income",
    And I type "$500" into field "Montly living expenses",
    And I type "$0" into field "Current home loan montly repayments",
    And I type "$100" into field "Other loan montly repayments",
    And I type "$0" into field "Other monthly commitments",
    And I type "$10000" into field "Total credit card limits",
    And I type "$479,000" into field "We estimate you could borrow",
   
    When I hit Start over,
    Then should "clear form"


  Scenario Outline: Estimate Borrow
    Given I visit "https://www.anz.com.au/personal/home-loans/calculator-tools/much-borrow/",
    And I select "single" on radio "Application type",
    And I select "0" from dropdown "Number of dependants",
    And I select "Home to live in" on radio "Property you would like to buy",
    And I type "$0" into field "Your annual income",
    And I type "$0" into field "Your annual other income",
    And I type "$1" into field "Montly living expenses",
    And I type "$0" into field "Current home loan montly repayments",
    And I type "$0" into field "Other loan montly repayments",
    And I type "$0" into field "Other monthly commitments",
    And I type "$0" into field "Total credit card limits",
    
    When I hit "Work out how much I could borrow"

    Then I should see "Based on the details you've entered,we're unable to give you an estimate of your borrowing power with this calculator.For questions,call us on 1800 100 641",
   
