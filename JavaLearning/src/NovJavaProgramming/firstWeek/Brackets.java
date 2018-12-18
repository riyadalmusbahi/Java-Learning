package NovJavaProgramming.firstWeek;

import java.util.Scanner;



//doesn't work well//


public class Brackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");

        String word = scanner.nextLine();
        word = formatToBrackets(word);

        System.out.println("Here is your transformed word: " + word);



    }


    public static String formatToBrackets(String word){
        Integer length = word.length();
        String firstLetter = word.substring(0, 1);
        firstLetter.toUpperCase();

        String lastLetter = word.substring(length-1, length);
        lastLetter.toUpperCase();

        String middle = word.substring(1,length-2);
        middle.toLowerCase();

        String transformedWord = firstLetter + middle + lastLetter;
        return transformedWord;

    }
}
