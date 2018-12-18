package NovJavaProgramming.firstWeek;

import java.util.Scanner;


public class changeCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to our store, how much do you have to pay?");
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();

        System.out.println("how much are you going to pay?");
        double moneyPaid = scanner.nextDouble();

        double change = moneyPaid - price;
        int euro = (int)Math.round(change);
        int cent = (int)Math.round(change * 100) % 100;


        System.out.println("Here you are, "+ euro +" Euro and "+ cent +  " cents");



    }
}

