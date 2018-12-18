package NovJavaProgramming.firstWeek;

import java.util.Arrays;
import java.util.List;

public class Bingo {

    public static void main(String[] args) {

        List<Integer>bingoBalls = Arrays.asList(2,5,3,7);

        Integer position = 0;
        while(position < bingoBalls.size()){
            Integer ball = bingoBalls.get(position);
            System.out.println("The NovJavaProgramming.firstWeek.Bingo ball you got is: " +ball);
            position++;

        }

        }
    }
