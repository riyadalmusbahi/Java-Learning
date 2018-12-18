package decJavaProgramming.week5.superheroes;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        SuperHeroCaller superHeroCaller = new SuperHeroCaller();
        Joker joker = new Joker();
        for (int times = 1; times < 11  ; times++) {
            SuperHero superHero = superHeroCaller.call();
            superHero.fight(joker);
        }
    }
}
