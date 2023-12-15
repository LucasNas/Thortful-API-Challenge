package com.thortful.apichallenge.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thortful.apichallenge.model.generated.BerryInput;
import com.thortful.apichallenge.model.generated.MoveInput;
import com.thortful.apichallenge.model.generated.PokemonInput;
import com.thortful.apichallenge.model.generated.RegionInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class PokemonService {
    private final RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    ObjectMapper objectMapper = new ObjectMapper();

    @Cacheable("pokemon")
    public String findPokemon(String pokemon) throws JsonProcessingException {
        String uri = "https://pokeapi.co/api/v2/pokemon/" + pokemon;
        String pokemonData = restTemplate.getForObject(uri, String.class);
        PokemonInput pokemonInput = objectMapper.readValue(pokemonData, PokemonInput.class);
        System.out.println(pokemonInput);
        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("move")
    public String findMove(String move) throws JsonProcessingException {
        String uri = "https://pokeapi.co/api/v2/move/" + move;
        String pokemonData = restTemplate.getForObject(uri, String.class);
        MoveInput moveInput = objectMapper.readValue(pokemonData, MoveInput.class);
        System.out.println(moveInput);
        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("berry")
    public String findBerry(String berry) throws JsonProcessingException {
        String uri = "https://pokeapi.co/api/v2/berry/" + berry;
        String pokemonData = restTemplate.getForObject(uri, String.class);
        BerryInput berryInput = objectMapper.readValue(pokemonData, BerryInput.class);
        System.out.println(berryInput);
        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("region")
    public String findRegion(String region) throws JsonProcessingException {
        String uri = "https://pokeapi.co/api/v2/region/" + region;
        String regionData = restTemplate.getForObject(uri, String.class);
        RegionInput regionInput = objectMapper.readValue(regionData, RegionInput.class);
        System.out.println(regionInput);
        return restTemplate.getForObject(uri, String.class) ;
    }
}
