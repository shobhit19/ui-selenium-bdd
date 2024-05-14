Feature: Home page feature

  Scenario: Home page title
    When user gets the title of the page
    Then page title should be "Your Store"


  Scenario: Home Page search
    Then search bar should be displayed

  Scenario: Home Page search enter text
    When user enters text "test"
    Then entered text should be entered in search bar

