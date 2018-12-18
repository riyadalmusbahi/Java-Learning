package decJavaProgramming.week5.superheroes;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {

        SuperHeroCaller superHeroCaller = new SuperHeroCaller();
        SuperHero superHero = superHeroCaller.call();
        System.out.println("Superhero: " + superHero.getName());
        List<SuperHero> superHeroes = new ArrayList<>();
        for (int times = 1; times < 7; times++) {
            SuperHero superHero1 = superHeroCaller.call();
            System.out.println("Superhero " + times + ": " + superHero1);
            superHeroes.add(superHero1);
        }
        System.out.println("Number of superheroes: " + superHeroes.size());


    }
}
