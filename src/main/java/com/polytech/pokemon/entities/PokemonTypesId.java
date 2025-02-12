package com.polytech.pokemon.entities;

import java.io.Serializable;
import java.util.Objects;

public class PokemonTypesId implements Serializable {
    private Integer pokemon;
    private Integer type;

    public PokemonTypesId() {}

    public PokemonTypesId(Integer pokemon, Integer type) {
        this.pokemon = pokemon;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonTypesId that = (PokemonTypesId) o;
        return Objects.equals(pokemon, that.pokemon) &&
               Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemon, type);
    }
}
