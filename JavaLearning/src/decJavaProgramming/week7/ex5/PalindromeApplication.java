package decJavaProgramming.week7.ex5;

import java.util.Arrays;
import java.util.List;

public class PalindromeApplication {
    public static void main(String[] args) {
        PalindromeJudge palindromeJudge = new PalindromeJudge();
        List<String> words = Arrays.asList("Madam", "nurses run", "patayinkita putang inamo");
        for (String word : words) {
            if (palindromeJudge.isPalindrome(word)){
                System.out.println("the word you entered is: " + word + " and it's a palindrome word");
            }else System.out.println("the word you entered is: " + word + " and its not a palindrome word");
        }
    }
}
