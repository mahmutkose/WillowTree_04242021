Feature: Name Game landing page verifications

  I want to be able to see page title and verify counters are incrementing

  Background:
    Given User on Landing page
@TC001
  Scenario: Verify page title and counters
    When User able to see page title : name game
    Then User able to see current numbers on counters

@TC002
    Scenario: Verify the Counters functionality
     When verify Streak Counters incrementing After four Streak
      And Verify that correct counter is four
      And Verify that tries counter is four
       Then Click on every wrong picture in one session
       And Verify that correct counter is became four
        And Verify that tries counter is became eight
        And Verify that incorrect answers reset Streak counter

@TC003
  Scenario: Verify the opening of new session after correct answer
     Given Verify names and photos not duplicated on Landing page
     Then Verify that photos changed




