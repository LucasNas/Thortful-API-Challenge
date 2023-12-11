package com.thortful.apichallenge.service;

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

    @Cacheable("pokemon")
    public String findPokemon(String pokemon) {
        String uri = "https://pokeapi.co/api/v2/pokemon/" + pokemon;

        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("move")
    public String findMove(String move) {
        String uri = "https://pokeapi.co/api/v2/move/" + move;

        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("berry")
    public String findBerry(String berry) {
        String uri = "https://pokeapi.co/api/v2/berry/" + berry;

        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("region")
    public String findRegion(String region) {
        String uri = "https://pokeapi.co/api/v2/region/" + region;

        return restTemplate.getForObject(uri, String.class) ;
    }
}
