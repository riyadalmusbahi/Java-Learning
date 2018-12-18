package decJavaProgramming.week5.superheroes;

public class Batman implements SuperHero {

    @Override
    public String getName() {
        return "Batman";
    }
    @Override
    public void fight(Villain villain){
        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "Batman";
    }
}
