package janJavaProgramming.week8.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

public class KeywordFinderTest {

    private KeywordFinder keywordFinder = new KeywordFinder();

    @Test
    void findElegant(){
        String words = "The elephant is lifted eleven " +
                "floors easily with the help of an electricity elevator";
        List<String> expected = keywordFinder.findElegant(words);

        List<String> result = Arrays.asList("elephant", "eleven",
                "electricity", "elevator");

        Assertions.assertEquals(expected, result);

    }

    @Test
    void findPlayful(){
        String words = "The rightful heir of the powerful king" +
                " had an awful accident playing with a colorful bear";
        List<String> expected = keywordFinder.findPlayful(words);

        List<String> result = Arrays.asList("rightful", "powerful",
                "awful", "colorful");

        Assertions.assertEquals(expected, result);

    }
}
