package decJavaProgramming.week7.ex2;

import java.util.List;

public class NickNamesApplication {

    public static void main(String[] args) {
        Word word = new Word();
        NickNamesGenerator nickNamesGenerator = new NickNamesGenerator();
        List<String> words = word.getWordsAsList();
        System.out.println("the original words are: " + words);

        for (String iWord : words) {
            String newWord = nickNamesGenerator.makeHalfWord(iWord);
            System.out.println("the new Nick names are: " + newWord);
        }
        String i2Word = word.getScannedWord();
        System.out.println("the word you want to make a Nickname of is: " + i2Word);
        System.out.println("the Nickname of your chosen word is: " + nickNamesGenerator.makeHalfWord(i2Word));

    }

}
