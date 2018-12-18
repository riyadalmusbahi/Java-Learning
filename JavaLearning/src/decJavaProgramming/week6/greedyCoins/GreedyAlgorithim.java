package decJavaProgramming.week6.greedyCoins;

import java.util.*;

public class GreedyAlgorithim {

    public Optional<List<Money>> change(Integer cents){

        List<Money> monies = Monies.asList();
        List<Money> coinsToPay = new ArrayList<>();

        while (cents > 0){
            for (Money money : monies) {
                if (Monies.get(money.getValue()).isPresent()) {
                    if (cents >= money.getValue()) {
                        cents -= money.getValue();
                        coinsToPay.add(money);
                        break;
                    }

                } else { return Optional.empty(); }
            }
        }
        System.out.println("coins you should pay:" + coinsToPay + " Size: " + coinsToPay.size());
        Set<Money> moneySet = new HashSet<>(coinsToPay);
        for (Money money : moneySet) {
            System.out.println( money + " :" + Collections.frequency(coinsToPay, money));
        }
        return Optional.of(coinsToPay);
    }
}
