package decJavaProgramming.week7.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Word {

    public String getScannedWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        return word;
    }

    public List<String> getWordsAsList(){
        List<String> words = Arrays.asList(
                "House", "Tree", "Theater", "Somewhere", "Botttle");
        return words;
    }



}
