package com.polytech.pokemon.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon_species")
public class PokemonSpecies {
    @Id
    private Integer id;
    @Column(name = "identifier")
    private String identifier;
    @Column(name = "generation_id")
    private Integer generationId;
    @ManyToOne
    @JoinColumn(name = "evolves_from_species_id", referencedColumnName = "id", insertable = false, updatable = false)
    private PokemonSpecies evolvesFromSpecies;
    @Column(name = "evolution_chain_id")
    private Integer evolutionChainId;
    @ManyToOne
    @JoinColumn(name = "color_id")
    private PokemonColor color;
    @ManyToOne
    @JoinColumn(name = "shape_id")
    private PokemonShape shape;
    @Column(name = "habitat_id")
    private Integer habitatId;
    @Column(name = "gender_rate")
    private Integer genderRate;
    @Column(name = "capture_rate")
    private Integer captureRate;
    @Column(name = "base_happiness")
    private Integer baseHappiness;
    @Column(name = "is_baby")
    private Boolean isBaby;
    @Column(name = "hatch_counter")
    private Integer hatchCounter;
    @Column(name = "has_gender_differences")
    private Boolean hasGenderDifferences;
    @Column(name = "growth_rate_id")
    private Integer growthRateId;
    @Column(name = "forms_switchable")
    private Boolean formsSwitchable;
    @Column(name = "`order`")
    private Integer order;
    @Column(name = "conquest_order")
    private Integer conquestOrder;

    public PokemonSpecies() {}

    public PokemonSpecies(Integer id, String identifier, Integer growthRateId, Integer generationId, PokemonSpecies evolvesFromSpecies, Integer evolutionChainId, PokemonColor color, PokemonShape shape, Integer habitatId, Integer genderRate, Integer captureRate, Integer baseHappiness, Boolean isBaby, Integer hatchCounter, Boolean hasGenderDifferences, Boolean formsSwitchable, Integer order, Integer conquestOrder) {
        this.id = id;
        this.identifier = identifier;
        this.growthRateId = growthRateId;
        this.generationId = generationId;
        this.evolvesFromSpecies = evolvesFromSpecies;
        this.evolutionChainId = evolutionChainId;
        this.color = color;
        this.shape = shape;
        this.habitatId = habitatId;
        this.genderRate = genderRate;
        this.captureRate = captureRate;
        this.baseHappiness = baseHappiness;
        this.isBaby = isBaby;
        this.hatchCounter = hatchCounter;
        this.hasGenderDifferences = hasGenderDifferences;
        this.formsSwitchable = formsSwitchable;
        this.order = order;
        this.conquestOrder = conquestOrder;
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
    public PokemonColor getColor() {
        return color;
    }
    public void setColor(PokemonColor color) {
        this.color = color;
    }
    public PokemonShape getShape() {
        return shape;
    }
    public void setShape(PokemonShape shape) {
        this.shape = shape;
    }
    public Integer getOrder() {
        return order;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }
    public Integer getGenerationId() {
        return generationId;
    }
    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }
    public PokemonSpecies getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }
    public void setEvolvesFromSpecies(PokemonSpecies evolvesFromSpecies) {this.evolvesFromSpecies = evolvesFromSpecies;}
    public Integer getEvolutionChainId() {
        return evolutionChainId;
    }
    public void setEvolutionChainId(Integer evolutionChainId) {
        this.evolutionChainId = evolutionChainId;
    }
    public Integer getHabitatId() {
        return habitatId;
    }
    public void setHabitatId(Integer habitatId) {
        this.habitatId = habitatId;
    }
    public Integer getGenderRate() {
        return genderRate;
    }
    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }
    public Integer getCaptureRate() {
        return captureRate;
    }
    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }
    public Integer getBaseHappiness() {
        return baseHappiness;
    }
    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }
    public Boolean getBaby() {
        return isBaby;
    }
    public void setBaby(Boolean baby) {
        isBaby = baby;
    }
    public Integer getHatchCounter() {
        return hatchCounter;
    }
    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }
    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }
    public void setHasGenderDifferences(Boolean hasGenderDifferences) {this.hasGenderDifferences = hasGenderDifferences;}
    public Integer getGrowthRateId() {
        return growthRateId;
    }
    public void setGrowthRateId(Integer growthRateId) {
        this.growthRateId = growthRateId;
    }
    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }
    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }
    public Integer getConquestOrder() {
        return conquestOrder;
    }
    public void setConquestOrder(Integer conquestOrder) {
        this.conquestOrder = conquestOrder;
    }
}
