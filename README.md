[![Build Status](https://travis-ci.org/klebercsilva/java-rest-assured-omdb-api-example.svg?branch=master)](https://travis-ci.org/klebercsilva/java-rest-assured-omdb-api-example)
<br />
## java-rest-assured-omdb-api-example
 The purpose of this project is to demonstrate the implementation of a testing framework using the following technologies: [Java](https://www.oracle.com/technetwork/java/javase), [Cucumber](https://cucumber.io/docs/reference/jvm), [TestNG](http://testng.org/doc/), [RestAssured](http://rest-assured.io/), [Allure Test Report](http://allure.qatools.ru/). 
 This is only possible thanks to the free [OMDb API](http://www.omdbapi.com/) which provides a large amount of data, such as: movies, series and even episodes. It is worth mentioning there is currently a limit of 1000/calls/day.
 
### Get the code
 
 Git:
 
     git clone https://github.com/klebercsilva/java-rest-assured-omdb-api-example
     cd java-rest-assured-omdb-api-example
 
### Update the param "apiKey" in the .feature file
### How to run these tests?
 
 Open a terminal window and run:

     gradle test
![Allure Report Overview](https://i.imgur.com/Puugm7p.png)     
![Allure Report Graphs](https://i.imgur.com/8H8So5U.png)     
![Allure Report Behaviors](https://i.imgur.com/My5VwRi.png)