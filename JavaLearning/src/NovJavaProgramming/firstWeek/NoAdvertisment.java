package NovJavaProgramming.firstWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// changed the concept where it asks for words puts them in a collection
// then changes the first and the last letter of each word toUpperCase
// not yet finished

public class NoAdvertisment {

    public static void main(String[] args) {

        List<String> words = getSeveralWords();
        System.out.println("your words are : " +words);

    }

    private static List<String> getSeveralWords() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words do you wanna enter ? ");
        Integer numberOfWords = scanner.nextInt();

        List<String>severalWords = new ArrayList<>();
        for (int position = 0; position < numberOfWords; position++) {

            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            severalWords.add(word);
        }
        return severalWords;


    }


}
