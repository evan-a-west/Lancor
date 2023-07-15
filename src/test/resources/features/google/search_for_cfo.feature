Feature: Search by keyword

  Scenario: Searching for a CFO of a company
    Given User is searching for the CFO of a company on google.com
    When they look up CFO info for "Duck Creek Technologies"
    Then they should see CFO info about "Duck Creek Technologies"
