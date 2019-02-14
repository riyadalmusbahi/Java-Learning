package janJavaProgramming.week10.ex3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsManager {

    SmsReader smsReader = new SmsReader();

    List<Sms> smsList = smsReader.getSmsStream();

    protected Boolean isHamSMS(Sms sms){
        sms.getType().equalsIgnoreCase("ham");
        return true;
    }

    protected Boolean isSpamSMS(Sms sms) {
        sms.getType().equalsIgnoreCase("spam");
        return true;
    }

    protected String getRatio(List<Sms>sms){
        return sms.stream()
                .map(e->e.getType())
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2)-> e2.getValue().compareTo(e1.getValue()))
                .map(e->e.getKey() + " Messages are the total of: " + e.getValue()*100 / sms.size() + " % ")
                .collect(Collectors.joining());
    }
    //Most used Ham word : --------------------"
    protected String getMostUsedWord(List<Sms> sms){
        return sms.stream()
                .filter(e-> e.getType().equalsIgnoreCase("ham"))
                .map(e->e.getText())
                .map(e-> e.split(" "))
                .flatMap(e-> Stream.of(e))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2)-> e2.getValue().compareTo(e1.getValue()))
                .map( e->e.getKey() + ": is the most used word, and it was used "+ e.getValue() + " times")
                .limit(1)
                .collect(Collectors.joining());
    }

    protected String getMostUsedLetter(List<Sms> sms){
        return sms.stream()
                .filter(e-> e.getType().equalsIgnoreCase("ham"))
                .map(e->e.getText())
                .map(e-> e.split(" "))
                .flatMap(e-> Stream.of(e))
                .map(e-> e.split(""))
                .flatMap(e->Stream.of(e))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2)-> e2.getValue().compareTo(e1.getValue()))
                .map( e->e.getKey() + ": is the most used letter, and it was used "+ e.getValue() + " times")
                .limit(1)
                .collect(Collectors.joining());

    }

    protected Optional<Integer> getLongestSpamSms(List<Sms> sms){
        return sms.stream()
                .filter(e->e.getType().equalsIgnoreCase("spam"))
                .map(e-> e.getText())
                .map(e->e.length())
                .sorted((e1,e2)-> e2.compareTo(e1))
                .findFirst();
    }




}
