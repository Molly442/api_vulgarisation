package com.polytech.pokemon.controllers;

import com.polytech.pokemon.dtos.PokemonDTO;
import com.polytech.pokemon.dtos.PokemonResponseDTO;
import com.polytech.pokemon.services.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {
    PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/api/pokemons")
    public List<PokemonResponseDTO> getPokemons() {
        return pokemonService.getPokemons();
    }

    @GetMapping("/api/pokemons/{id}")
    public PokemonResponseDTO getPokemonById(@PathVariable Integer id) {
        return pokemonService.getPokemonById(id);
    }

    @PostMapping("/api/pokemons") // Ajout d'un Pokémon
    public PokemonResponseDTO addPokemon(@RequestBody PokemonDTO pokemonDTO) {
        return pokemonService.addPokemon(pokemonDTO);
    }

    @PutMapping("/api/pokemons/{id}")
    public PokemonResponseDTO updatePokemon(@PathVariable Integer id, @RequestBody PokemonDTO pokemonDTO) {
        return pokemonService.updatePokemon(id, pokemonDTO);
    }

    @DeleteMapping("/api/pokemons/{id}")
    public void deletePokemon(@PathVariable("id") Integer idPokemon) {
        pokemonService.deletePokemonById(idPokemon) ;
    }
}
