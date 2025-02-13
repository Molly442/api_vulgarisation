package com.polytech.pokemon.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon_shapes")
public class PokemonShape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identifier;

    public PokemonShape() {}

    public PokemonShape(Integer id, String identifier) {
        this.id = id;
        this.identifier = identifier;
    }

    // Getters/Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
