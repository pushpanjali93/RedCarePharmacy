Feature: verify the product in cart.

  Scenario: search the product and add into cart.
    Given navigate to the application
    When Handle the page cookies
    When select a product
    Then add the product into cart
