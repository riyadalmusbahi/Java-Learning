package NovJavaProgramming.hackersGuideToEncryption;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Encryptor {
    String encrypt(String plainText) {
        Random random = new Random();
        String[] textLetters = plainText.split("");
        List<String> letters = Arrays.asList(textLetters);
        String Rubbish = "!@#$%&*+";
        int random1 = random.nextInt(5);
        String encryptedText = "";



        for (String letter : letters) {
            if (letter.equals("A") || letter.equals("a")) {
                letter.replaceAll("A", "4");
            }

            if (letter.equals("E") || letter.equals("e")) {
                letter.replaceAll("E", "3");
            }
            if (letter.equals("I") || letter.equals("i")) {
                letter.replaceAll("I", "1");
            }

            if (letter.equals("O") || letter.equals("o")) {
                letter.replaceAll("O", "8");
            }
            if (letter.equals("U") || letter.equals("u")) {
                letter.replaceAll("U", "9");
            }
        }

        return encryptedText;



    }
}
