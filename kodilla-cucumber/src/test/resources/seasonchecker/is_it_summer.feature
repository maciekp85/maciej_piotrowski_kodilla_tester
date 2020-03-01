Feature: Is it Summer?
   Everybody likes Summer

   Scenario: Winter isn't Summer
      Given today is last day of December
      When I ask whether it's Summer
      Then I should be told "Nope"

   Scenario: Summer is Summer
      Given today is first day of August
      When I ask whether it's Summer
      Then I should be told "Yes! Summer!"
