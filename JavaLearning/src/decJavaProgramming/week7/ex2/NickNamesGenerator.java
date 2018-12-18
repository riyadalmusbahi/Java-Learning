package decJavaProgramming.week7.ex2;

import java.util.Arrays;
import java.util.List;

public class NickNamesGenerator {

    public String makeHalfWord(String word){

        Integer legnth = word.length();
        Integer newLength = legnth/2;
        String newNickName = word.substring(0, newLength);
        return newNickName;



    }
}
