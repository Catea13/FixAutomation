Feature: Search

  Scenario: search
    When  fill Search field with 'QA'
    And  click  "Google Search" button
    Then appear page with text "QA"