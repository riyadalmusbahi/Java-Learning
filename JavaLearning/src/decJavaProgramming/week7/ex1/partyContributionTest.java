package decJavaProgramming.week7.ex1;

import java.util.List;

public class partyContributionTest {
    public static void main(String[] args) {
        MoneyCollector moneyCollector = new MoneyCollector();
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        List<Integer> moneyCollected = moneyCollector.collectAsList();
        System.out.println("The collected money is: " + moneyCollected);
        Integer accumilatedMoney = moneyCalculator.accumilate(moneyCollected);
        System.out.println("the contribution for the party in total is: " + accumilatedMoney + " Euro!");

    }
}
