$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddExpenses.feature");
formatter.feature({
  "line": 1,
  "name": "Add expense",
  "description": "As a User of CoCoin, I can add an expense",
  "id": "add-expense",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Add expenses then select a category",
  "description": "",
  "id": "add-expense;add-expenses-then-select-a-category",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@stable"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I\u0027m in the page adding expenses",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add expense",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select a \u003ccategory\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "New \u003cexpense\u003e is added in the specified \u003ccategory\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "add-expense;add-expenses-then-select-a-category;",
  "rows": [
    {
      "cells": [
        "category"
      ],
      "line": 11,
      "id": "add-expense;add-expenses-then-select-a-category;;1"
    },
    {
      "cells": [
        "Breakfast"
      ],
      "line": 12,
      "id": "add-expense;add-expenses-then-select-a-category;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 28938798001,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add expenses then select a category",
  "description": "",
  "id": "add-expense;add-expenses-then-select-a-category;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@stable"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I\u0027m in the page adding expenses",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add expense",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select a Breakfast",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "New \u003cexpense\u003e is added in the specified Breakfast",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddExpenses.i_m_in_the_page_adding_expenses()"
});
formatter.result({
  "duration": 4241855325,
  "status": "passed"
});
formatter.match({
  "location": "AddExpenses.iAddExpense()"
});
formatter.result({
  "duration": 1792175336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Breakfast",
      "offset": 11
    }
  ],
  "location": "AddExpenses.iSelectACategory(String)"
});
formatter.result({
  "duration": 492216404,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cexpense\u003e",
      "offset": 4
    },
    {
      "val": "Breakfast",
      "offset": 40
    }
  ],
  "location": "AddExpenses.ThenNewExpenseIsAddedInTheSpecifiedCategory(String,String)"
});
formatter.result({
  "duration": 464057,
  "status": "passed"
});
formatter.after({
  "duration": 672902,
  "status": "passed"
});
});