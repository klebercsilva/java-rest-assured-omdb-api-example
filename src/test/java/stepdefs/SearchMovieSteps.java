package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SearchMovieSteps {

    String apiKey;
    Response response;

    @Given("I authenticate with valid api key {string}")
    public void iAuthenticateWithValidApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Given("I am authenticated")
    public void iAmAuthenticated() {
        response = given().param("apiKey",apiKey).when().get("/");
    }
    
    @Then("the status code is {int}")
    public void theStatusCodeIs(int statusCode) {
        assertEquals(response.getStatusCode(), statusCode);
    }

    @When("I search for movie by id {string}")
    public void iSearchForMovieById(String movieId) {
        response = given().param("apiKey", apiKey).param("i", movieId).when().get("/");
    }

    @When("I search for movie by name {string}")
    public void iSearchForMovieByName(String movieName) {
        response = given().param("apiKey", apiKey).param("t", movieName).when().get("/");
    }

    @When("I search for movie by id {string} and name {string}")
    public void iSearchForMovieByIdAndName(String movieId, String movieName) {
        response = given().param("apiKey", apiKey).param("i", movieId).param("t", movieName).when().get("/");
    }
}