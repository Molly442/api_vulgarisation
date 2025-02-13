package com.polytech.pokemon.repository;

import com.polytech.pokemon.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    @Modifying
    @Query(value = "DELETE FROM pokemon_types WHERE id = :pokemonId", nativeQuery = true)
    void deletePokemonTypes(@Param("pokemonId") int pokemonId);

    @Modifying
    @Query(value = "DELETE FROM pokemon WHERE id = :pokemonId", nativeQuery = true)
    void deletePokemon(@Param("pokemonId") int pokemonId);
}
