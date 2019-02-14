package janJavaProgramming.week10.ex1;


import java.util.*;
import java.util.stream.Collectors;

public class PokemonManager {

    PokemonReader pokemonReader = new PokemonReader();

    public List<Pokemon> getAllPokemons() {
        return pokemonReader.allPokemons;
    }

    public List<String> getGrassPokemons(List<Pokemon> allPokemon) {
        List<String> grassPokemon = allPokemon.stream()
                .filter(e -> e.getType1().equalsIgnoreCase("grass"))
                .map(e -> e.getName())
                .collect(Collectors.toList());
        return grassPokemon;
    }

    public Set<Pokemon> getPokemonsSet(List<Pokemon> allPokemon) {
        Set<Pokemon> pokemonsSet = allPokemon.stream()
                .collect(Collectors.toSet());
        return pokemonsSet;
    }

    public Long getNumberOfTotaPokemons(List<Pokemon> allPokemon) {
        Long numberOfPokemons = allPokemon.stream()
                .count();
        return numberOfPokemons;
    }

    public Long getPoisonPokemonType2(List<Pokemon>allPokemon){
        return allPokemon.stream()
                .filter(e->e.getType2().equalsIgnoreCase("poison"))
                .count();
    }


}

