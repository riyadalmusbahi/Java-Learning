package decJavaProgramming.week7.ex3Andex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Number {

    Random random = new Random();

    public Integer getSoloNumber(){
        Integer number = 1 + random.nextInt(100);
        return number;
    }

    public List<Integer> getList(){
        List<Integer> numbers = new ArrayList<>();
        for (int times = 0; times < 10 ; times++) {
            numbers.add(getSoloNumber());
        }
        return numbers;
    }

    public Integer getBigNumber(){
        Integer bigNumber = 1000 + random.nextInt(5000);
        return bigNumber;
    }

}
