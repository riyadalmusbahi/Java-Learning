package NovJavaProgramming.firstWeek;

import java.util.Scanner;

public class powerTwo {

    public static void main(String[] args) {

        Integer number = getNumber();
        Integer powerTwo = number * number;
        System.out.println("the power two of your number is: " +powerTwo);

    }

    public static Integer getNumber() {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
