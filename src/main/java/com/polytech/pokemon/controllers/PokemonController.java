package com.polytech.pokemon.controllers;

import com.polytech.pokemon.dtos.PokemonDTO;
import com.polytech.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping("/api/pokemons")
    public List<PokemonDTO> getPokemons() {
        return pokemonService.getPokemons();
    }

    @GetMapping("/api/pokemons/{id}")
    public PokemonDTO getPokemon(//Add id) {
        return 
    }
}
