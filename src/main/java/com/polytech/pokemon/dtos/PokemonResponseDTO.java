package com.polytech.pokemon.dtos;

public class PokemonResponseDTO {
    private Integer id;
    private String identifier;
    private Integer generation_id;
    private Integer evolves_from_species_id;
    private Integer evolution_chain_id;
    private String color;
    private String shape_id;
    private Integer habitat_id;
    private Integer gender_rate;
    private Integer capture_rate;
    private Integer base_happiness;
    private Boolean is_baby;
    private Integer hatch_counter;
    private Boolean has_gender_differences;
    private Integer growth_rate_id;
    private Boolean forms_switchable;
    private Integer order;
    private Integer conquest_order;
    private Integer height;
    private Integer weight;
    private Integer base_experience;
    private Boolean is_default;

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
    public Integer getGenerationId() {
        return generation_id;
    }
    public void setGenerationId(Integer generation_id) {
        this.generation_id = generation_id;
    }
    public Integer getEvolvesFromSpeciesId() {
        return evolves_from_species_id;
    }
    public void setEvolvesFromSpeciesId(Integer evolves_from_species_id) {this.evolves_from_species_id = evolves_from_species_id;}
    public Integer getEvolutionChainId() {
        return evolution_chain_id;
    }
    public void setEvolutionChainId(Integer evolution_chain_id) {
        this.evolution_chain_id = evolution_chain_id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {this.color = color;}
    public String getShapeId() {
        return shape_id;
    }
    public void setShapeId(String shape_id) {
        this.shape_id = shape_id;
    }
    public Integer getHabitatId() {
        return habitat_id;
    }
    public void setHabitatId(Integer habitat_id) {
        this.habitat_id = habitat_id;
    }
    public Integer getGenderRate() {
        return gender_rate;
    }
    public void setGenderRate(Integer gender_rate) {
        this.gender_rate = gender_rate;
    }
    public Integer getCaptureRate() {
        return capture_rate;
    }
    public void setCaptureRate(Integer capture_rate) {
        this.capture_rate = capture_rate;
    }
    public Integer getBaseHappiness() {
        return base_happiness;
    }
    public void setBaseHappiness(Integer base_happiness) {
        this.base_happiness = base_happiness;
    }
    public Boolean getIsBaby() {
        return is_baby;
    }
    public void setIsBaby(Boolean is_baby) {
        this.is_baby = is_baby;
    }
    public Integer getHatchCounter() {
        return hatch_counter;
    }
    public void setHatchCounter(Integer hatch_counter) {
        this.hatch_counter = hatch_counter;
    }
    public Boolean getHasGenderDifferences() {
        return has_gender_differences;
    }
    public void setHasGenderDifferences(Boolean has_gender_differences) {this.has_gender_differences = has_gender_differences;}
    public Integer getGrowthRateId() {
        return growth_rate_id;
    }
    public void setGrowthRateId(Integer growth_rate_id) {
        this.growth_rate_id = growth_rate_id;
    }
    public Boolean getFormsSwitchable() {
        return forms_switchable;
    }
    public void setFormsSwitchable(Boolean forms_switchable) {
        this.forms_switchable = forms_switchable;
    }
    public Integer getOrder() {
        return order;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }
    public Integer getConquestOrder() {
        return conquest_order;
    }
    public void setConquestOrder(Integer conquest_order) {
        this.conquest_order = conquest_order;
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
        return base_experience;
    }
    public void setBaseExperience(Integer base_experience) {
        this.base_experience = base_experience;
    }
    public Boolean getIsDefault() {
        return is_default;
    }
    public void setIsDefault(Boolean is_default) {
        this.is_default = is_default;
    }
}

