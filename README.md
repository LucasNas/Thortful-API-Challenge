# Thortful-API-Challenge

About the project

This project is a simple API that retrieves and displays information about Pokémon from the PokéAPI: https://pokeapi.co/. It uses the Spring Boot framework and the RestTemplate library to make HTTP requests to the PokéAPI.


Building the project

Open a terminal window and navigate to the root directory of the project.
Use the following command to build the project:
mvn clean install
This will compile the project's code, run the tests, and package the project into a JAR file.

Running the project

Once the project has been built, you can run it using the following command:
mvn spring-boot:run
This will start the Spring Boot application and the API will be available at http://localhost:8080/.

Accessing the API

You can access the API using the following endpoints:

GET /pokemon/{name}: Get information about a specific Pokémon by name.
GET /moves/{name}: Get information about a specific move by name.
GET /berries/{name}: Get information about a specific berry by name.
GET /regions/{name}: Get information about a specific region by name.
Replace {name} with the name of the Pokémon, move, berry, or region you want to retrieve information about.

Example usage

The following example shows how to get information about the Pokémon Bulbasaur:

curl http://localhost:8080/pokemon/bulbasaur
This will return a JSON response containing information about Bulbasaur, such as its name, type, and base stats.
