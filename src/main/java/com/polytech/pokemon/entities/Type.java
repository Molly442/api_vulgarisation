package com.polytech.pokemon.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "types")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identifier;
    @Column(name = "generation_id")
    private Integer generationId;
    @Column(name = "damage_class_id")
    private Integer damageClassId;

    public Type() {}

    public Type(Integer id, String identifier, Integer generationId, Integer damageClassId) {
        this.id = id;
        this.identifier = identifier;
        this.generationId = generationId;
        this.damageClassId = damageClassId;
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
    public Integer getGenerationId() {
        return generationId;
    }
    public void setGenerationId(Integer generationId) {
        this.generationId = generationId;
    }
    public Integer getDamageClassId() {
        return damageClassId;
    }
    public void setDamageClassId(Integer damageClassId) {
        this.damageClassId = damageClassId;
    }
}
