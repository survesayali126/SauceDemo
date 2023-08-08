Feature: Test Sauce Demo Application

  Scenario: Test Login Page Functionality
    Given User opens sauce demo application with required URL with "chrome" browser
    Then User enters user name and password and login button

  Scenario: Add Items to Cart and checkout
    When user select items and add to cart
    Then user click on cart button
