package com.thortful.apichallenge.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PokemonService {
    public String findPokemonById(int id) {
        return "Pokemon with id: " + id + " found" ;
    }

    public String findPokemonByName(String pokemon) {
        return "Pokemon with name: " + pokemon + " found" ;
    }
}
