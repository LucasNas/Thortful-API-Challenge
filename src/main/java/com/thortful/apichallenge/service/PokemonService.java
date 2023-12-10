package com.thortful.apichallenge.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class PokemonService {
    @Cacheable("pokemon")
    public String findPokemon(String pokemon) {
        String uri = "https://pokeapi.co/api/v2/pokemon/" + pokemon;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("move")
    public String findMove(String move) {
        String uri = "https://pokeapi.co/api/v2/move/" + move;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("berry")
    public String findBerry(String berry) {
        String uri = "https://pokeapi.co/api/v2/berry/" + berry;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class) ;
    }
    @Cacheable("region")
    public String findRegion(String region) {
        String uri = "https://pokeapi.co/api/v2/region/" + region;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class) ;
    }
}
