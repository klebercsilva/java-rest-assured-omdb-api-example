package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SearchMovieSteps {

    private String apiKey;
    private Response response;

    @Given("^I am authenticated with \"([^\"]*)\"$")
    public void iAmAuthenticated(String apiKey) {
        this.apiKey = apiKey;
        response = given().param("apiKey", apiKey).when().get("/");
    }
    
    @Then("the status code is {int}")
    public void theStatusCodeIs(int statusCode) {
        assertEquals(response.getStatusCode(), statusCode);
    }

    @When("^I search movie by id \"([^\"]*)\"$")
    public void iSearchForMovieById(String movieId) {
        response = given().param("apiKey", apiKey).param("i", movieId).when().get("/");
    }

    @When("^I search movie by title \"([^\"]*)\"$")
    public void iSearchForMovieByTitle(String movieTitle) {
        response = given().param("apiKey", apiKey).param("t", movieTitle).when().get("/");
    }

    @When("^I search movie by year released \"([^\"]*)\" and title \"([^\"]*)\"$")
    public void iSearchForMovieByYearAndTitle(String yearReleased, String movieTitle) {
        response = given().param("apiKey", apiKey).param("i", yearReleased).param("t", movieTitle).when().get("/");
    }
}