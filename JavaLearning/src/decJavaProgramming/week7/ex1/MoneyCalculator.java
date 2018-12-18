package decJavaProgramming.week7.ex1;

import java.util.List;

public class MoneyCalculator {
    MoneyCollector moneyCollector = new MoneyCollector();

    public Integer accumilate(List<Integer> moneyAsList){
        Integer accumilatedMoney = 0;

        for (Integer money : moneyAsList) {
            accumilatedMoney = accumilatedMoney + money;
        }return accumilatedMoney;
    }
}
