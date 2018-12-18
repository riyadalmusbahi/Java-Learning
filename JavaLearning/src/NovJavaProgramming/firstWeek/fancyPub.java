package NovJavaProgramming.firstWeek;

import java.util.Scanner;

public class fancyPub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What's your name ?");
        String name = scanner.nextLine();

        System.out.println("Please Tell me your order number.");
        Integer orderNumber = scanner.nextInt();

        Integer result = orderNumber % 3;
        Integer price = result * 4;
        System.out.println("Here you are " + name + ", it's " + price + " Euro.");
    }

}
