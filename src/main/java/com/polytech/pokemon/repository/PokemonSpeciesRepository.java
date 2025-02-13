package com.polytech.pokemon.repository;

import com.polytech.pokemon.entities.PokemonSpecies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PokemonSpeciesRepository extends JpaRepository<PokemonSpecies, Integer> {
    @Query("SELECT MAX(p.id) FROM PokemonSpecies p")
    Integer findSpecieMaxId();
}
