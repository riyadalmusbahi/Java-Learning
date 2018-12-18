package decJavaProgramming.week7.ex5;

public class PalindromeJudge {

    public Boolean isPalindrome(String word){
        String wordWithNoSpaces = word.replaceAll(" ", "");
        String reversedWordWithNoSpaces = reverse(wordWithNoSpaces);
        if (reversedWordWithNoSpaces.equalsIgnoreCase(wordWithNoSpaces)){
            return true;
        }else return false;


    }

    private String reverse(String wordWithNoSpaces) {
        Integer length = wordWithNoSpaces.length();
        String reversed = "";
        for (int position = length -1 ; position >= 0; position--) {
            reversed = reversed + wordWithNoSpaces.charAt(position);
        }return reversed;
    }
}
