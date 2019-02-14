package janJavaProgramming.week8.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> find(String words, Predicate<String> condition) {
        List<String> found = new ArrayList<>();
        String[] splittedWords = words.split(" ");
        for (String word : splittedWords) {
            if (condition.test(word)) {
                found.add(word);
            }
        }
        return found;

    }

    public List<String> findElegant(String words) {
        return find(words, word -> word.startsWith("ele"));
    }

    public List<String> findPlayful(String words) {
        return find(words, word -> word.endsWith("ful"));
    }
}