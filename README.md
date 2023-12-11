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


Sure, here is a README file in a more formatted way:

PokéAPI Data Retriever
This project provides a simple API for retrieving and displaying information about Pokémon from the PokéAPI. It utilizes the Spring Boot framework and the RestTemplate library to interact with the PokéAPI.

Prerequisites
To build and run the project, you'll need the following:

Java 11 or higher
Maven 3.6 or higher
Building the Project
Open a terminal window and navigate to the project's root directory.
Execute the following command to build the project:
mvn clean install
This will compile the code, run the tests, and package it into a JAR file.

Running the Project
Once the project is built, start the Spring Boot application using the command:
mvn spring-boot:run
This will launch the Spring Boot application, exposing the API at http://localhost:8080/.

API Endpoints
The API provides access to the following endpoints:

GET /pokemon/{name or id}: Retrieves information about a specific Pokémon based on its name.
GET /moves/{name or id}: Fetches details about a specific move identified by its name.
GET /berries/{name or id}: Extracts information about a specific berry specified by its name.
GET /regions/{name or id}: Accesses data related to a particular region identified by its name.

To utilize these endpoints, replace {name or id} with the actual name of the Pokémon, move, berry, or region you're interested in.



Example usage

The following example shows how to get information about the Pokémon Bulbasaur:

curl http://localhost:8080/pokemon/bulbasaur
This will return a JSON response containing information about Bulbasaur, such as its name, type, and base stats.
