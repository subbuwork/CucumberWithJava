Feature: User can select product from result list
  User go to home page
  Enter search term and click on search button
  then user can select product from result list

  Scenario: User search for products
    Given Go To: http://amazon.com
    Then User enters search term and clicks on search button: Ferrari 458
    And User Select Product From The Result List
    And Verify selected product
    And Add product to the cart
