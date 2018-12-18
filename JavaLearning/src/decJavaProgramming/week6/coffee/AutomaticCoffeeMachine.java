package decJavaProgramming.week6.coffee;

public class AutomaticCoffeeMachine extends CoffeeMaker {
    @Override
    public String getName() {
        return "Automatic Coffee Machine";
    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }

    @Override
    public String toString() {
        return "Automatic Coffee Machine";
    }
}
