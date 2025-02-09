package com.polytech.pokemon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Types {
    @Id
    private int id;

    private String identifier;
    private int generation_id;
    private int damage_class_id;
}
