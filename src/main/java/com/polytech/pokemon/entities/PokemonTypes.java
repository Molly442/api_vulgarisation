package com.polytech.pokemon.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon_types")
@IdClass(PokemonTypesId.class) // Définit une clé composite
public class PokemonTypes {

    @Id
    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Pokemon pokemon;

    @Id
    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private Types type;

    private Integer slot;
}
