package com.polytech.pokemon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id
    private int id;

    private String identifier;
    private int species_id;
    private int height;
    private int weight;
    private int base_experience;
    private int order;
    private boolean is_default;
}
