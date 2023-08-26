package com.example.pokemon.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private @Setter int pokemonId;

    private @Setter String pokemonName;

    private @Setter String pokemonType;

}
