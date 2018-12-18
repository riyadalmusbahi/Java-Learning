package decJavaProgramming.week7.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {

    public List<Integer> collectAsList(){
        List<Integer> moneyCollected = new ArrayList<>();
        for (int times = 0; times < 10; times++) {
            moneyCollected.add(getRandomMoney());
        }
        return moneyCollected;

    }

    private Integer getRandomMoney() {
        Random random = new Random();
        Integer randomMoney = 1 + random.nextInt(5);
        return randomMoney;

    }
}
