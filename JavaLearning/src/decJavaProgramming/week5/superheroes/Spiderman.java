package decJavaProgramming.week5.superheroes;

public class Spiderman implements SuperHero{


    @Override
    public String getName() {
        return "Spiderman";
    }
    @Override
    public void fight(Villain villain){
        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "Spiderman";
    }
}
