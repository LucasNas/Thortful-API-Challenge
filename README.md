# Thortful-API-Challenge
This project is a simple API that retrieves and displays information about Pokémon from the PokéAPI: https://pokeapi.co/. It uses the Spring Boot framework and the RestTemplate library to make HTTP requests to the PokéAPI.


Building the Project<br />
Open a terminal window and navigate to the project's root directory.
Execute the following command to build the project:<br />
mvn clean install<br />
This will compile the code, run the tests, and package it into a JAR file.

Running the Project<br />
Once the project is built, start the Spring Boot application using the command:<br />
mvn spring-boot:run<br />
This will launch the Spring Boot application, exposing the API at http://localhost:8080/.

API Endpoints
The API provides access to the following endpoints:

GET /pokemon/{name or id}: Retrieves information about a specific Pokémon based on its name or id.<br />
GET /moves/{name or id}: Fetches details about a specific move identified by its name or id.<br />
GET /berries/{name or id}: Extracts information about a specific berry specified by its name or id.<br />
GET /regions/{name or id}: Accesses data related to a particular region identified by its name or id.<br />

To utilize these endpoints, replace {name or id} with the actual name or id of the Pokémon, move, berry, or region you're interested in.



Example usage

The following example shows how to get information about the Pokémon Bulbasaur:

curl http://localhost:8080/pokemon/bulbasaur<br />
This will return a JSON response containing information about Bulbasaur, such as its name, type, and base stats.
