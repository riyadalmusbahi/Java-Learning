package janJavaProgramming.week10.ex1;

import java.util.List;
import java.util.Set;

public class PokemonApplication {
    public static void main(String[] args) {


        PokemonManager pokemonManager = new PokemonManager();

        List<Pokemon> allPokemons = pokemonManager.getAllPokemons();
        System.out.println(allPokemons);

        List<String> grassPokemons = pokemonManager.getGrassPokemons(allPokemons);
        System.out.println(grassPokemons);

        Set<Pokemon> pokemonsSet = pokemonManager.getPokemonsSet(allPokemons);
        System.out.println(pokemonsSet);

        Long numberOfPokemons = pokemonManager.getNumberOfTotaPokemons(allPokemons);
        System.out.println("the amount of all Pokemons: " + numberOfPokemons);

        Long numberOftype2PoisonPokemon = pokemonManager.getPoisonPokemonType2(allPokemons);
        System.out.println(numberOftype2PoisonPokemon);
    }
}
