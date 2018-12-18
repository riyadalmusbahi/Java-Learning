package NovJavaProgramming.firstWeek;

import java.util.Scanner;


// Khajag's version.

public class Invitation {


    public static void main(String[] args) {

        System.out.println(" How much money I have in mein wallet");
        Integer money = getNumber();

        System.out.println("How many friends are having dinner with me.?");
        Integer friend = getNumber();
        Integer total = 0;
        Integer friendx = 1;
        friendx = friendx + 1;
        for (int i = friend; i > 0; i--) {

            System.out.println("How much money friend number " + friendx + " have to pay?");
            Integer price = getNumber();
            total = total + price;
            friendx = friendx + 1;
        }


        if (isBiger(money, total)) {
            System.out.println(" You can inviat them ,but !!!!!!!1");
            System.out.println("How much should I pay?");
            Integer payment = getNumber();
            total = total + payment;
            if (isBiger(money, total)) {
                System.out.println(("Enjoy the meal :D"));
            } else
                System.out.println("Sorry till next time");
        } else
            System.out.println("Sorry till next time ");
    }


    public static Integer getNumber() {
        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();
        return number;
    }

    public static Boolean isBiger(Integer number1, Integer number2) {
        return number1 >= number2;
    }


}
