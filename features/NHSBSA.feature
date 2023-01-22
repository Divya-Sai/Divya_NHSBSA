Feature: Uk Citizen to check the help for paying NHS Cost

  Scenario: Uk Citizen
    Given User launch "Chrome" driver
    When User enter NHS Paying Cost "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    Then User click on Accept Cookies
    And User click on start Now button
    Then User landed on Country Page and selects "England" as Country
    And User click on Next
    Then User landed on GP Practise Page and slects "No"
    And User click on Next
    Then User clicks on dental practise country and selects "England"
    And User click on Next
    Then User enter DOB enter day 12
    Then User enter DOB enter month 10
    Then User enter DOB enter Year 1992
    And User click on Next
    Then User landed on partner page and select "Yes"
    And User click on Next
    Then User landed on tax credits page and selects "No"
    And User click on Next
    Then User landed on pregnant page and selects "NO"
    And User click on Next
    Then User landed on injury or illness page and selects "NO"
    And User click on Next
    Then User landed on Diabetes and selects "NO"
    And User click on Next
    Then User landed on affected conditions and selects "No"
    And User click on Next
    Then User landed on glaucoma Page and selects "No"
    And User click on Next
    Then user is on carhome Page and selects "No"
    And User click on Next
    Then user is on saving,investment Page and selects "No"
    And User click on Next
    Then User gets result for NHS cost
    And Close the browser

