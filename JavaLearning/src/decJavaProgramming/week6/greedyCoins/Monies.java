package decJavaProgramming.week6.greedyCoins;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Monies {
    protected static List<Money> asList(){
        List<Money> monies = Arrays.asList(
                new Cent50(), new Cent20(), new Cent10(), new Cent5(), new Cent2(), new Cent1()
        );
        return monies;
    }

    protected static Optional<Money> get(Integer cents){
        List<Money> monies = Monies.asList();
        for (Money money : monies) {
            if (money.getValue().equals(cents)){
                return Optional.of(money);
            }

        }return Optional.empty();
    }
}
