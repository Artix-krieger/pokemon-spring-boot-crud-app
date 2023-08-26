package com.example.pokemon.controllers;

import com.example.pokemon.models.Pokemon;
import com.example.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @PostMapping("create")
    public void createPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.createPokemon(pokemon);
    }

    //localhost:8080/find?id=1
    @GetMapping("find")
    public Pokemon getPokemonById(@RequestParam(name = "id") int val) {
        return pokemonService.getPokemonByID(val);
    }

    @PutMapping("update")
    public void updatePokemonType(@RequestBody Pokemon pokemon, int id) {
        pokemonService.updatePokemonByType(pokemon, id);
    }

    @DeleteMapping("delete")
    public void deletePokemon(@RequestParam(name = "id") int id) {
        pokemonService.deletePokemon(id);
    }
}

