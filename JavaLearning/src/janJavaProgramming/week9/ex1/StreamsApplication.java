package janJavaProgramming.week9.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsApplication {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int number = 1; number < 21; number++) {
            numbers.add(number);
        }
        System.out.println(numbers);



        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven())
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);


        List<Integer> oddNUmbers = numbers.stream()
                .filter(isOdd())
                .collect(Collectors.toList());

        System.out.println("Odd numbers" + oddNUmbers);


        List<Integer> devisibleBy3Biggerthan10 = numbers.stream()
                .filter(isDevisble(3))
                .filter(isBiggerThan(10))
                .collect(Collectors.toList());

        System.out.println("Numbers devisible by three and bigger than ten :" +
                " " + devisibleBy3Biggerthan10);


        List<Integer> smallerthan5MultibliedBy5 = numbers.stream()
                .filter(isSmallerThan(5))
                .map(multiblyBy(3))
                .collect(Collectors.toList());

        List<String> elements = numbers.stream()
                .filter(isBiggerThan(8))
                .filter(isSmallerThan(12))
                .map(number -> number.toString())
                .map(e -> "number " + e + " has " + e.length() +" digits" )
                .collect(Collectors.toList());

        System.out.println("Digits of numbers bigger than 8 and smaller than 12:"
                + elements);
    }

    private static Function<Integer, Integer> multiblyBy(Integer number) {
        return e -> e * number;
    }

    private static Predicate<Integer> isSmallerThan(Integer limit) {
        return e -> e < limit;
    }


    private static Predicate<Integer> isOdd() {
        return number -> number % 2 != 0;
    }

    private static Predicate<Integer> isEven() {
        return number -> number % 2 == 0;
    }

    private static Predicate<Integer> isDevisble(Integer devisionNumber){
        return number -> number % devisionNumber == 0;
    }

    private static Predicate<Integer> isBiggerThan(Integer limit) {
        return number -> number > limit;
    }
}
