package decJavaProgramming.week6.coffee;

public class FrenchPress extends CoffeeMaker {
    @Override
    public String getName() {
        return "French press";
    }

    @Override
    public Integer getBrewingTime() {
        return 10;

    }

    @Override
    public String toString() {
        return "French Press";
    }
}
