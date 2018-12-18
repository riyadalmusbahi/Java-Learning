package NovJavaProgramming.firstWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseTest {
    public static void main(String[] args) {
        List<Integer>numbers = getSeveralNumbers();
        numbers = reverse(numbers);
        System.out.println("here are your reversed numbers: " + numbers);

    }

    public static List<Integer> reverse(List<Integer>numbers) {
        Integer size = numbers.size();
        List<Integer>reversedNumbers = new ArrayList<>();
        for (int position = size - 1; position >= 0; position--) {
            Integer number = numbers.get(position);
            reversedNumbers.add(number);
        }
        return reversedNumbers;
    }

    public static List<Integer> getSeveralNumbers() {

            Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter ? ");
        Integer numberOfNumbers = scanner.nextInt();

        List<Integer>severalNumbers = new ArrayList<>();
        for (int position = 0; position < numberOfNumbers ; position++) {
            System.out.println("Enter a number :");
            Integer number = scanner.nextInt();
            severalNumbers.add(number);
        }
        return severalNumbers;

    }
}

