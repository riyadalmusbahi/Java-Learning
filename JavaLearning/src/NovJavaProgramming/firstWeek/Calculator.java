package NovJavaProgramming.firstWeek;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Integer number1, number2, sum;
        number1 = getNumber();
        number2 = getNumber();

        sum = number1 + number2;
        System.out.println("the sum of your numbers is:" +sum);

    }


    public static Integer getNumber() {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}

