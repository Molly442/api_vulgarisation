package com.polytech.pokemon.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {
    @Id
    private Integer id;
    @Column
    private String identifier;
    @ManyToOne
    @JoinColumn(name = "species_id", referencedColumnName = "id")
    private PokemonSpecies species;
    @Column
    private Integer height;
    @Column
    private Integer weight;
    @Column(name="base_experience")
    private Integer baseExperience;
    @Column(name = "`order`")
    private Integer order;
    @Column(name = "is_default")
    private Boolean isDefault;

    public Pokemon() {}

    public Pokemon(Integer id, String identifier, PokemonSpecies species, Integer height, Integer weight, Integer baseExperience, Integer order, Boolean isDefault) {
        this.id = id;
        this.identifier = identifier;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.order = order;
        this.isDefault = isDefault;
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
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Integer getBaseExperience() {
        return baseExperience;
    }
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }
    public Integer getOrder() {
        return order;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }
    public Boolean getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    public void setSpecies(PokemonSpecies species) {
        this.species = species;
    }
    public PokemonSpecies getSpecies() {
        return species;
    }
    public Boolean getDefault() {
        return isDefault;
    }
    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
