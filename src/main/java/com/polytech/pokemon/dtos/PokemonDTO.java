package com.polytech.pokemon.dtos;

public class PokemonDTO {
    private Integer id;
    private String identifier;
    private Integer generationId;
    private Integer evolvesFromSpeciesId;
    private Integer evolutionChainId;
    private Integer colorId;
    private Integer shapeId;
    private Integer habitatId;
    private Integer genderRate;
    private Integer captureRate;
    private Integer baseHappiness;
    private Boolean isBaby;
    private Integer hatchCounter;
    private Boolean hasGenderDifferences;
    private Integer growthRateId;
    private Boolean formsSwitchable;
    private Integer order;
    private Integer conquestOrder;
    private Integer height;
    private Integer weight;
    private Integer baseExperience;
    private Boolean isDefault;

    public PokemonDTO(Integer id, String identifier, Integer generationId, Integer evolvesFromSpeciesId,
                      Integer evolutionChainId, Integer colorId, Integer shapeId, Integer habitatId,
                      Integer genderRate, Integer captureRate, Integer baseHappiness, Boolean isBaby,
                      Integer hatchCounter, Boolean hasGenderDifferences, Integer growthRateId,
                      Boolean formsSwitchable, Integer order, Integer conquestOrder, Integer height,
                      Integer weight, Integer baseExperience, Boolean isDefault) {
        this.id = id;
        this.identifier = identifier;
        this.generationId = generationId;
        this.evolvesFromSpeciesId = evolvesFromSpeciesId;
        this.evolutionChainId = evolutionChainId;
        this.colorId = colorId;
        this.shapeId = shapeId;
        this.habitatId = habitatId;
        this.genderRate = genderRate;
        this.captureRate = captureRate;
        this.baseHappiness = baseHappiness;
        this.isBaby = isBaby;
        this.hatchCounter = hatchCounter;
        this.hasGenderDifferences = hasGenderDifferences;
        this.growthRateId = growthRateId;
        this.formsSwitchable = formsSwitchable;
        this.order = order;
        this.conquestOrder = conquestOrder;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.isDefault = isDefault;
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

    public Integer getGenerationId() {
        return generationId;
    }

    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }

    public Integer getEvolutionChainId() {
        return evolutionChainId;
    }

    public void setEvolutionChainId(Integer evolutionChainId) {
        this.evolutionChainId = evolutionChainId;
    }

    public Integer getEvolvesFromSpeciesId() {
        return evolvesFromSpeciesId;
    }

    public void setEvolvesFromSpeciesId(Integer evolvesFromSpeciesId) {
        this.evolvesFromSpeciesId = evolvesFromSpeciesId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getShapeId() {
        return shapeId;
    }

    public void setShapeId(Integer shapeId) {
        this.shapeId = shapeId;
    }

    public Integer getGenderRate() {
        return genderRate;
    }

    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    public Integer getHabitatId() {
        return habitatId;
    }

    public void setHabitatId(Integer habitatId) {
        this.habitatId = habitatId;
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

    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getConquestOrder() {
        return conquestOrder;
    }

    public void setConquestOrder(Integer conquestOrder) {
        this.conquestOrder = conquestOrder;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}

