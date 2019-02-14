package janJavaProgramming.week10.ex3;

import java.util.Optional;

public class SmsApplication {
    public static void main(String[] args) {

        SmsManager smsManager = new SmsManager();
        Long numberOfSms = smsManager.smsList
                .stream()
                .count();
        System.out.println("the total amount of SMS's is: " + numberOfSms);

        String ratio = smsManager.getRatio(smsManager.smsList);
        System.out.println(ratio);

        String mostUsedWord = smsManager.getMostUsedWord(smsManager.smsList);
        System.out.println(mostUsedWord);

        String mostUsedLetter = smsManager.getMostUsedLetter(smsManager.smsList);
        System.out.println(mostUsedLetter);

        Optional<Integer> longestSpamSms = smsManager.getLongestSpamSms(smsManager.smsList);
        System.out.println(longestSpamSms);


    }
}
