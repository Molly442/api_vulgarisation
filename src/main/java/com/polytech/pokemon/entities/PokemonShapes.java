package com.polytech.pokemon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PokemonShapes {
    @Id
    private int id;

    private String identifier;
}
