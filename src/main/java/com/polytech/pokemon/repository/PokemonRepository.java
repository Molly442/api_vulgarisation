package com.polytech.pokemon.repository;

import com.polytech.pokemon.entities.Pokemon;
import com.polytech.pokemon.dtos.PokemonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    @Query("""
        SELECT new com.polytech.pokemon.dtos.PokemonDTO(
            p.id, p.identifier, ps.generation_id, ps.evolves_from_species_id, ps.evolution_chain_id, 
            ps.color_id, ps.shape_id, ps.habitat_id, ps.gender_rate, ps.capture_rate, ps.base_happiness, 
            ps.is_baby, ps.hatch_counter, ps.has_gender_differences, ps.growth_rate_id, ps.forms_switchable, 
            ps.order, ps.conquest_order, p.height, p.weight, p.base_experience, p.is_default
        )
        FROM Pokemon p
        JOIN p.species ps
    """)
    List<PokemonDTO> findAllPokemons();

    @Query("""
        SELECT new com.polytech.pokemon.dtos.PokemonDTO(
            p.id, p.identifier, ps.generation_id, ps.evolves_from_species_id, ps.evolution_chain_id, 
            ps.color_id, ps.shape_id, ps.habitat_id, ps.gender_rate, ps.capture_rate, ps.base_happiness, 
            ps.is_baby, ps.hatch_counter, ps.has_gender_differences, ps.growth_rate_id, ps.forms_switchable, 
            ps.order, ps.conquest_order, p.height, p.weight, p.base_experience, p.is_default
        )
        FROM Pokemon p
        JOIN p.species ps
        WHERE p.id = :id
    """)
    Optional<PokemonDTO> findPokemonById(@Param("id") Integer id);

    void deletePokemonById(Integer id); 
}
