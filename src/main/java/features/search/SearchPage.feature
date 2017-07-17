Feature: Search for items from Top Nav
  Scenario: User can search products from top nav
    Given Go To: http://amazon.com
    When Enter Search Term And Click On Search Button: Ferrari 458, Lomborghini
    Then Close Browser


