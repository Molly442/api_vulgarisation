package com.polytech.pokemon.repository;

import com.polytech.pokemon.entities.PokemonShape;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonShapeRepository extends JpaRepository<PokemonShape, Integer> {
}
