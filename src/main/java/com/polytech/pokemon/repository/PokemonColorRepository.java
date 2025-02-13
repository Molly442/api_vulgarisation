package com.polytech.pokemon.repository;

import com.polytech.pokemon.entities.PokemonColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonColorRepository extends JpaRepository<PokemonColor, Integer> {
}
