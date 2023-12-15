package com.thortful.apichallenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PokemonServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private PokemonService pokemonService;



    @Test
    void findPokemon() throws JsonProcessingException {
        String pokemonName = "pikachu";
        String expectedResponse = "Pikachu data from PokeAPI";


        when(restTemplate.getForObject(any(String.class), any())).thenReturn(expectedResponse);


        String result = pokemonService.findPokemon(pokemonName);


        assertEquals(expectedResponse, result);
    }

    @Test
    void findMove() throws JsonProcessingException {
        String moveName = "thunderbolt";
        String expectedResponse = "Thunderbolt data from PokeAPI";


        when(restTemplate.getForObject(any(String.class), any())).thenReturn(expectedResponse);


        String result = pokemonService.findMove(moveName);


        assertEquals(expectedResponse, result);
    }

    @Test
    void findBerry() throws JsonProcessingException {
        String berryName = "oran";
        String expectedResponse = "Oran Berry data from PokeAPI";


        when(restTemplate.getForObject(any(String.class), any())).thenReturn(expectedResponse);


        String result = pokemonService.findBerry(berryName);

        assertEquals(expectedResponse, result);
    }

    @Test
    void findRegion() throws JsonProcessingException {
        String regionName = "kanto";
        String expectedResponse = "Kanto region data from PokeAPI";


        when(restTemplate.getForObject(any(String.class), any())).thenReturn(expectedResponse);


        String result = pokemonService.findRegion(regionName);


        assertEquals(expectedResponse, result);
    }
}
