package NovJavaProgramming.firstWeek;

import java.util.Scanner;


public class Reflection {
    public static void main(String[] args) {

        Integer moneyInWallet = checkDerekMoney();
        Integer totalDinnerCost = askFriends();

        if (totalDinnerCost<=moneyInWallet) {
            System.out.println("Come on guys, lets celebrate my new job with a dinner on my treat ");

            Integer dereksCost = includeDerekBill();
            totalDinnerCost = totalDinnerCost + dereksCost;

            if (totalDinnerCost>moneyInWallet){
                System.out.println("Oh, sorry guys i made a mistake in the calculations, i can't pay for the dinner");

            }
        }
        else {
            System.out.println("Oh i don't have enough money for this, will do it on the first month's salary ;)");
        }

    }

    private static Integer includeDerekBill() {
        System.out.println("but how much Derek has to pay : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static Integer askFriends() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many friends are coming ? ");
        Integer NumberFriendsComing = scanner.nextInt();
        Integer totalDinnerCost = 0;

        for (int position = 0; position < NumberFriendsComing; position++) {
            System.out.println("hey Friend, How much do you have to pay");
            Integer indivisualCost = scanner.nextInt();
            totalDinnerCost = totalDinnerCost + indivisualCost;
        }
        return totalDinnerCost;
    }


    private static Integer checkDerekMoney() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hello Derek, please Enter how much money do you have in wallet : ");
        return scanner.nextInt();

    }


}
