package com.thortful.apichallenge.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.thortful.apichallenge.service.PokemonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("pokemon/{pokemon}")
    public ResponseEntity<String> findPokemon(@PathVariable(value = "pokemon") String pokemon) throws JsonProcessingException {

        return ResponseEntity.ok(pokemonService.findPokemon(pokemon));

    }

    @GetMapping("move/{move}")
    public ResponseEntity<String> findPokemonMoves(@PathVariable(value = "move") String move) throws JsonProcessingException {

        return ResponseEntity.ok(pokemonService.findMove(move));

    }


    @GetMapping("berry/{berry}")
    public ResponseEntity<String> findPokemonBerries(@PathVariable(value = "berry") String berry) throws JsonProcessingException {

        return ResponseEntity.ok(pokemonService.findBerry(berry));

    }

    @GetMapping("region/{region}")
    public ResponseEntity<String> findPokemonRegion(@PathVariable(value = "region") String region) throws JsonProcessingException {

        return ResponseEntity.ok(pokemonService.findRegion(region));

    }
}
