//package janJavaProgramming.week9.ex3;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Caesar {
//
//
//    public static final int startOfAscii = 97;
//
//    public String cipher(String text, Integer key) {
//        return Stream.of(text.split(""))
//                .map(letter -> cipherLetter(letter, key))
//                .collect(Collectors.joining());
//    }
//
//    private String cipherLetter(String letter, Integer key) {
//        if (isNotAlphapatic(letter)){
//            return letter;
//        }
//        Boolean wasUpperCase = isUpperCase(letter);
//        int ascii = letter.toLowerCase().charAt(0);
//        int newAscii = (ascii + key - startOfAscii) % 26 + startOfAscii;
//
//
//    }
//
//    private Boolean isUpperCase(String letter) {
//        return Character.isUpperCase(letter.charAt(0));
//    }
//
//    private boolean isNotAlphapatic(String letter) {
//        return !Character.isAlphabetic(letter.charAt(0));
//    }
//
//
//}
