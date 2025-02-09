package com.polytech.pokemon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PokemonTypes {
    @Id
    private int id;

    private int type_id;
    private int slot;
}
