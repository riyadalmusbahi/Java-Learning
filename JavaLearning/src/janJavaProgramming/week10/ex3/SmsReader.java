package janJavaProgramming.week10.ex3;

import NovJavaProgramming.dataStructure.printShop.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {

    FileReader fileReader = new FileReader();

    public List<Sms> getSmsStream() {
        return fileReader.asStream("janJavaProgramming/week10/ex3/sms.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Sms(columns[1], columns[0]))
                .collect(Collectors.toList());

    }
}
