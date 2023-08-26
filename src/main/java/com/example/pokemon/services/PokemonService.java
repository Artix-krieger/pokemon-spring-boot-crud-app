package com.example.pokemon.services;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public void createPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    public Pokemon getPokemonByID(int val) {
        return pokemonRepository.findById(val).get();
    }

    public void updatePokemonByType(Pokemon pokemon, @RequestParam(name = "id") int id) {
        Pokemon pokemonToBeUpdated = getPokemonByID(id);
        pokemonToBeUpdated.setPokemonType(pokemon.getPokemonType());
        pokemonRepository.save(pokemonToBeUpdated);
    }

    public void deletePokemon(int id) {
        pokemonRepository.deleteById(id);
    }

}

