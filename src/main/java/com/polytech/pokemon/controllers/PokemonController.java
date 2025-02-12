package com.polytech.pokemon.controllers;

import com.polytech.pokemon.dtos.PokemonDTO;
import com.polytech.pokemon.entities.Pokemon;
import com.polytech.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping("/api/pokemons")
    public List<PokemonDTO> getPokemons() {
        return pokemonService.getPokemons();
    }

    @GetMapping("/api/pokemons/{id_pokemon}")
    public ResponseEntity<PokemonDTO> getPokemonById(@PathVariable Integer id_pokemon) {
        Optional<PokemonDTO> pokemon = pokemonService.getPokemonById(id_pokemon);

        return pokemon.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/api/pokemons/{id_pokemon}")
    public void deletePokemon(@PathVariable("id_pokemon") Integer idPokemon) {
        pokemonService.deletePokemonById(idPokemon) ; 
    }

    @PostMapping("/api/pokemons") // Ajout d'un Pokémon
    public ResponseEntity<Pokemon> addPokemon(@RequestBody PokemonDTO pokemonDTO) {
        Pokemon savedPokemon = pokemonService.addPokemon(pokemonDTO);
        return ResponseEntity.ok(savedPokemon);
    }


}
