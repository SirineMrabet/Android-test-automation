Feature: Add expense
  As a User of CoCoin, I can add an expense

  @stable
  Scenario Outline: Add expenses then select a category
    Given I'm in the page adding expenses
    When I add expense
    And I select a <category>
    Then New <expense> is added in the specified <category>
    Examples:
    | category  |
    | Breakfast |
    #| Lunch     |
    #| Dinner    |