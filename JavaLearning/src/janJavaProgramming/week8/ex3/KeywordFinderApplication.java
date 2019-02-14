package janJavaProgramming.week8.ex3;

import java.util.Arrays;
import java.util.List;

public class KeywordFinderApplication {

    public static void main(String[] args) {
        KeywordFinder keywordFinder = new KeywordFinder();



        String beforeElegantWords = "The elephant is lifted eleven " +
                "floors easily with the help of an electricity elevator";
        System.out.println("Input for elegant words: " + beforeElegantWords);

        List<String> elegantWords = keywordFinder.findElegant(beforeElegantWords);
        System.out.println("the elegant words are: " + elegantWords);


        String beforePlayfulWords = "The rightful heir of the powerful king" +
                " had an awful accident playing with a colorful bear";
        System.out.println("Input for playful words: " + beforePlayfulWords);

        List<String> playfulWords = keywordFinder.findPlayful(beforePlayfulWords);
        System.out.println("the playful words are: " + playfulWords);

        List<String> testWords = Arrays.asList("waterful stuff", "beautiful rain");

    }
}
