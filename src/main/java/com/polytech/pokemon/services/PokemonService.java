package com.polytech.pokemon.services;

import com.polytech.pokemon.dtos.PokemonDTO;
import com.polytech.pokemon.repository.PokemonRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<PokemonDTO> getPokemons() {
        return pokemonRepository.findAllPokemons();
    }

    public Optional<PokemonDTO> getPokemonById(Integer id) {
        return pokemonRepository.findPokemonById(id);
    }

    @Transactional
    public void deletePokemonById (Integer id){
        pokemonRepository.deletePokemonById(id);
    }
}
