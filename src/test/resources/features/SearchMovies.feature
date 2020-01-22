Feature: Search for movies
  [As a user] I want to search for movies using the OMDb API

  Scenario: Authenticate User
    Given I authenticate with valid api key ""
    Then the status code is 200

  Scenario: Search For Movie By Id
    Given I am authenticated
    When I search for movie by id "tt0848228"
    Then the status code is 200

  Scenario: Search For Movie By Name
    Given I am authenticated
    When I search for movie by name "Avengers"
    Then the status code is 200

  Scenario: Search For Movie By Id And Name
    Given I am authenticated
    When I search for movie by id "tt0848228" and name "Avengers"
    Then the status code is 200