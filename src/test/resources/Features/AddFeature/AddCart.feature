#Author
#Date
#Description
@smoketest
Feature: Feauture add to cart

  @smoketest
  Scenario Outline: Add to cart
    Given navigate to url
    When select a category
    And add a product
    Then verify product

  