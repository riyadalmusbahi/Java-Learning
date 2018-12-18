package decJavaProgramming.week6.greedyCoins;

import java.util.*;

public class GreedyAlgorithimTest {
    public static void main(String[] args) {
        GreedyAlgorithim greedyAlgorithim = new GreedyAlgorithim();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount: ");
        Integer cents = scanner.nextInt();
        greedyAlgorithim.change(cents);
        System.out.println("finished ");
    }
}

