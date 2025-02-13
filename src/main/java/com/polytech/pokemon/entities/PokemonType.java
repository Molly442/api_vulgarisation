package com.polytech.pokemon.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon_types")
public class PokemonType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;
    private Integer slot;

    public PokemonType() {}

    public PokemonType(Integer id, Type type, Integer slot) {
        this.id = id;
        this.type = type;
        this.slot = slot;
    }

    // Getters/Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Integer getSlot() {
        return slot;
    }
    public void setSlot(Integer slot) {
        this.slot = slot;
    }
}
