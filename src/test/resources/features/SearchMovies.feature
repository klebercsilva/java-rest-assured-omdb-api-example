@Regression @SearchMovies
Feature: Search for Movies
  [As a User] I want to search for movies using the OMDb API

  Scenario Outline: Search Movie By Id
    Given I am authenticated with "<apiKey>"
    When I search movie by id "<movieId>"
    Then the status code is 200

    Examples:
      | apiKey   | movieId   |
      | XXXXXXXX | tt0848228 |

  Scenario Outline: Search Movie By Title
    Given I am authenticated with "<apiKey>"
    When I search movie by title "<movieTitle>"
    Then the status code is 200

    Examples:
      | apiKey   | movieTitle |
      | XXXXXXXX | Avengers   |

  Scenario Outline: Search Movie By Year And Title
    Given I am authenticated with "<apiKey>"
    When I search movie by year released "<movieYear>" and title "<movieTitle>"
    Then the status code is 200

    Examples:
      | apiKey   | movieYear | movieTitle |
      | XXXXXXXX | 2012      | Avengers   |