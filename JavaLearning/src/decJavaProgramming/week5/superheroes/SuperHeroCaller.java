package decJavaProgramming.week5.superheroes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperHeroCaller {

    List<SuperHero> superHeroes = Arrays.asList(new Batman(), new Superman(), new Spiderman());
    Random random = new Random();



    public SuperHero call(){
        int position = random.nextInt(3);
        SuperHero superHero = superHeroes.get(position);
        return superHero;

    }
}
