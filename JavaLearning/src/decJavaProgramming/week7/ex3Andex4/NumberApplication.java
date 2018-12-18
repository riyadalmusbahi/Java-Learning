package decJavaProgramming.week7.ex3Andex4;

import java.util.List;

public class NumberApplication {
    public static void main(String[] args) {
        Number number = new Number();
        NumberOperator numberOperator = new NumberOperator();

        List<Integer> numbers = number.getList();
        System.out.println("The numbers are: " + numbers);
        System.out.println("The biggest Number of them is: " + numberOperator.getBiggest(numbers));
        System.out.println("The smallest Number of them is: " + numberOperator.getSmallest(numbers));


        Integer bigNumber = number.getBigNumber();
        System.out.println("The big number is: " + bigNumber);
        System.out.println("The number splitted into digits are: " + numberOperator.splitDigits(bigNumber));
    }
}
