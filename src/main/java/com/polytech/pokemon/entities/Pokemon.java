package com.polytech.pokemon.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Pokemon {
    @Id
    private int id;

    private String identifier;
    private int height;
    private int weight;
    private int base_experience;
    private int order;
    private boolean is_default;

    @ManyToOne
    @JoinColumn(name = "species_id", referencedColumnName = "id") // Indique la clé étrangère
    private PokemonSpecies species;  // 🔹 Remplace int species_id par un objet PokemonSpecies

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<PokemonTypes> types;

    }
    


