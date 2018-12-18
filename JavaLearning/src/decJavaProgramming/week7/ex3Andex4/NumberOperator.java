package decJavaProgramming.week7.ex3Andex4;

import java.util.ArrayList;
import java.util.List;

public class NumberOperator {

    public Integer getBiggest(List<Integer> numbers){
        Integer biggest = 0;
        for (Integer number : numbers) {
            if (number > biggest){
                biggest = number;
            }

        }return biggest;
    }

    public Integer getSmallest(List<Integer> numbers) {
        Integer smallest = 100;
        for (Integer number : numbers) {
            if (number < smallest) {
                smallest = number;
            }

        }
        return smallest;

    }

    public List<Integer> splitDigits(Integer number){
        List<Integer> reversedSplittedDigits = new ArrayList<>();
        while (number > 0 ){
            reversedSplittedDigits.add(number % 10);
            number = number /10;
        }

        Integer size = reversedSplittedDigits.size();
        List<Integer> splittedDigits = new ArrayList<>();
        for (int position = size -1; position >= 0 ; position--) {
            Integer digit = reversedSplittedDigits.get(position);
            splittedDigits.add(digit);
        }
        return splittedDigits;
    }
}
