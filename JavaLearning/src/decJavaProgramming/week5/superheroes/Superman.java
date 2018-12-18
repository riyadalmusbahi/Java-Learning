package decJavaProgramming.week5.superheroes;

public class Superman implements SuperHero {

    @Override
    public String getName() {
        return "Superman";
    }
    @Override
    public void fight(Villain villain){
        villain.weaken(getName());
    }


    @Override
    public String toString() {
        return "Superman";
    }
}
