package decJavaProgramming.week6.coffee;

public abstract class CoffeeMaker {

    public abstract String getName();
    public abstract Integer getBrewingTime();

    public Coffee brew(){
        Coffee coffee = new Coffee(getName(), getBrewingTime());
        return coffee;
    }

}
