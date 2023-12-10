package com.thortful.apichallenge.controller;

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
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("/{pokemon}")
    public ResponseEntity<String> findPokemonById(@PathVariable(value = "pokemon") String pokemon) {
        try {
            int id = Integer.parseInt(pokemon);
            return ResponseEntity.ok(pokemonService.findPokemonById(id));
        } catch (NumberFormatException nfe) {
            return ResponseEntity.ok(pokemonService.findPokemonByName(pokemon));
        }
    }
}
