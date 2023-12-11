package com.thortful.apichallenge.controller;

import com.thortful.apichallenge.service.PokemonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PokemonControllerTest {

    @Mock
    private PokemonService pokemonService;

    @InjectMocks
    private PokemonController pokemonController;

    @Test
    void findPokemon() {

        String pokemonName = "pikachu";
        String expectedResponse = "Pikachu data from PokeAPI";
        when(pokemonService.findPokemon(pokemonName)).thenReturn(expectedResponse);


        ResponseEntity<String> responseEntity = pokemonController.findPokemon(pokemonName);


        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(expectedResponse);
    }

    @Test
    void findPokemonMoves() {

        String moveName = "thunderbolt";
        String expectedMoveResponse = "Thunderbolt data from PokeAPI";
        when(pokemonService.findMove(moveName)).thenReturn(expectedMoveResponse);

        ResponseEntity<String> responseEntity = pokemonController.findPokemonMoves(moveName);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(expectedMoveResponse);
    }

    @Test
    void findPokemonBerries() {
        String berryName = "oran";
        String expectedResponse = "Oran Berry data from PokeAPI";


        when(pokemonService.findBerry(berryName)).thenReturn(expectedResponse);

        ResponseEntity<String> responseEntity = pokemonController.findPokemonBerries(berryName);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(expectedResponse);
    }

    @Test
    void findPokemonRegion() {
        String regionName = "kanto";
        String expectedResponse = "Kanto region data from PokeAPI";


        when(pokemonService.findRegion(regionName)).thenReturn(expectedResponse);

        ResponseEntity<String> responseEntity = pokemonController.findPokemonRegion(regionName);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(expectedResponse);
    }
}



