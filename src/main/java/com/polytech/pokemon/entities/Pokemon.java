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

    public void setId(int id) { this.id = id; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setBase_experience(int base_experience) { this.base_experience = base_experience; }
    public void setOrder(int order) { this.order = order; }
    public void setDefault(boolean is_default) { this.is_default = is_default; }
    public void setSpecies(PokemonSpecies species) { this.species = species; }

    public int getId() { return id; }
    public String getIdentifier() { return identifier; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public int getBase_experience() { return base_experience; }
    public int getOrder() { return order; }
    public boolean isDefault() { return is_default; }
    public PokemonSpecies getSpecies() { return species; }

    public Pokemon() {}

    public Pokemon(int id, String identifier, int height, int weight, int base_experience,
                   int order, boolean is_default, PokemonSpecies species) {
        this.id = id;
        this.identifier = identifier;
        this.height = height;
        this.weight = weight;
        this.base_experience = base_experience;
        this.order = order;
        this.is_default = is_default;
        this.species = species;
    }

    @ManyToOne
    @JoinColumn(name = "species_id", referencedColumnName = "id") // Indique la clé étrangère
    private PokemonSpecies species;  // 🔹 Remplace int species_id par un objet PokemonSpecies

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<PokemonTypes> types;

}
    


