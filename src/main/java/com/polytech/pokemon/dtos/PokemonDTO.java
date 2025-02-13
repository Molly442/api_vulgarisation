package com.polytech.pokemon.dtos;

public class PokemonDTO {
    private Integer id;
    private String identifier;
    private Integer generation_id;
    private Integer evolves_from_species_id;
    private Integer evolution_chain_id;
    private Integer color_id;
    private Integer shape_id;
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


    public PokemonDTO() {
    }

    public PokemonDTO(Integer id, String identifier, Integer generation_id, Integer evolves_from_species_id, Integer evolution_chain_id, Integer color_id, Integer shape_id, Integer habitat_id, Integer gender_rate, Integer capture_rate, Integer base_happiness, Boolean is_baby, Integer hatch_counter, Boolean has_gender_differences, Integer growth_rate_id, Boolean forms_switchable, Integer order, Integer conquest_order, Integer height, Integer weight, Integer base_experience, Boolean is_default) {
        this.id = id;
        this.identifier = identifier;
        this.generation_id = generation_id;
        this.evolves_from_species_id = evolves_from_species_id;
        this.evolution_chain_id = evolution_chain_id;
        this.color_id = color_id;
        this.shape_id = shape_id;
        this.habitat_id = habitat_id;
        this.gender_rate = gender_rate;
        this.capture_rate = capture_rate;
        this.base_happiness = base_happiness;
        this.is_baby = is_baby;
        this.hatch_counter = hatch_counter;
        this.has_gender_differences = has_gender_differences;
        this.growth_rate_id = growth_rate_id;
        this.forms_switchable = forms_switchable;
        this.order = order;
        this.conquest_order = conquest_order;
        this.height = height;
        this.weight = weight;
        this.base_experience = base_experience;
        this.is_default = is_default;
    }

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

    public Integer getGeneration_id() {
        return generation_id;
    }

    public void setGeneration_id(Integer generation_id) {
        this.generation_id = generation_id;
    }

    public Integer getEvolves_from_species_id() {
        return evolves_from_species_id;
    }

    public void setEvolves_from_species_id(Integer evolves_from_species_id) {
        this.evolves_from_species_id = evolves_from_species_id;
    }

    public Integer getEvolution_chain_id() {
        return evolution_chain_id;
    }

    public void setEvolution_chain_id(Integer evolution_chain_id) {
        this.evolution_chain_id = evolution_chain_id;
    }

    public Integer getColor_id() {
        return color_id;
    }

    public void setColor_id(Integer color_id) {
        this.color_id = color_id;
    }

    public Integer getShape_id() {
        return shape_id;
    }

    public void setShape_id(Integer shape_id) {
        this.shape_id = shape_id;
    }

    public Integer getHabitat_id() {
        return habitat_id;
    }

    public void setHabitat_id(Integer habitat_id) {
        this.habitat_id = habitat_id;
    }

    public Integer getGender_rate() {
        return gender_rate;
    }

    public void setGender_rate(Integer gender_rate) {
        this.gender_rate = gender_rate;
    }

    public Integer getCapture_rate() {
        return capture_rate;
    }

    public void setCapture_rate(Integer capture_rate) {
        this.capture_rate = capture_rate;
    }

    public Integer getBase_happiness() {
        return base_happiness;
    }

    public void setBase_happiness(Integer base_happiness) {
        this.base_happiness = base_happiness;
    }

    public Boolean getIs_baby() {
        return is_baby;
    }

    public void setIs_baby(Boolean is_baby) {
        this.is_baby = is_baby;
    }

    public Integer getHatch_counter() {
        return hatch_counter;
    }

    public void setHatch_counter(Integer hatch_counter) {
        this.hatch_counter = hatch_counter;
    }

    public Boolean getHas_gender_differences() {
        return has_gender_differences;
    }

    public void setHas_gender_differences(Boolean has_gender_differences) {
        this.has_gender_differences = has_gender_differences;
    }

    public Integer getGrowth_rate_id() {
        return growth_rate_id;
    }

    public void setGrowth_rate_id(Integer growth_rate_id) {
        this.growth_rate_id = growth_rate_id;
    }

    public Boolean getForms_switchable() {
        return forms_switchable;
    }

    public void setForms_switchable(Boolean forms_switchable) {
        this.forms_switchable = forms_switchable;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getConquest_order() {
        return conquest_order;
    }

    public void setConquest_order(Integer conquest_order) {
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

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public Boolean getIs_default() {
        return is_default;
    }

    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }
}
