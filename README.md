[![Build Status](https://travis-ci.org/klebercsilva/java-rest-assured-omdb-api-example.svg?branch=master)](https://travis-ci.org/klebercsilva/java-rest-assured-omdb-api-example)
<br />
## java-rest-assured-omdb-api-example
 The purpose of this sample project is to demonstrate the implementation of a testing framework using the following technologies: [Java](https://www.oracle.com/technetwork/java/javase), [Cucumber](https://cucumber.io/docs/reference/jvm), [TestNG](http://testng.org/doc/), [RestAssured](http://rest-assured.io/). 
 This is only possible thanks to the free [OMDb API](http://www.omdbapi.com/) which provides a large amount of data, such as: movies, series and even episodes. It is worth mentioning there is currently a limit of 1000/calls/day.
 
### Get the code
 
 Git:
 
     git clone https://github.com/klebercsilva/java-rest-assured-omdb-api-example
     cd java-rest-assured-omdb-api-example
 
### Update the param "apiKey" in the .feature file
### Run with Maven
 
 Open a terminal and run:

     mvn test
     
![Test Run Result](https://i.imgur.com/LTQZN8Y.png)