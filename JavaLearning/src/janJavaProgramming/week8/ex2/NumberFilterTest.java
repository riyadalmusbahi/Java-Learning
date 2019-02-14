package janJavaProgramming.week8.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NumberFilterTest {

    private NumberFilter numberFilter = new NumberFilter();

    @Test
    void getEven() {
        List<Integer> numbers = Arrays.asList(1,4,17,27,34);

        List<Integer> result = numberFilter.getEven(numbers);

        List<Integer> expected = Arrays.asList(4,34);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void getOdd(){
        List<Integer> numbers = Arrays.asList(1,4,17,27,34);

        List<Integer> result = numberFilter.getOdd(numbers);

        List<Integer> expected = Arrays.asList(1, 17,27);
        Assertions.assertEquals(expected, result);

    }
}
