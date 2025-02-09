package com.polytech.pokemon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PokemonSpecies {
    @Id
    private int id;

    private String identifier;
    private int generation_id;
    private int evolves_from_species_id;
    private int evolution_chain_id;
    private int color_id;
    private int shape_id;
    private int habitat_id;
    private int gender_rate;
    private int capture_rate;
    private int base_happiness;
    private boolean is_baby;
    private int hatch_counter;
    private boolean has_gender_differences;
    private int growth_rate_id;
    private boolean forms_switchable;
    private int order;
    private boolean conquest_order;
}
