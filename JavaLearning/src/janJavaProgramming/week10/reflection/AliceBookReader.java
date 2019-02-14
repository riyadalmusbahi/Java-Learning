package janJavaProgramming.week10.reflection;

import NovJavaProgramming.dataStructure.printShop.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceBookReader {

    FileReader fileReader = new FileReader();

    public List<String> getAliceBookListWords() {
        return fileReader.asList("janJavaProgramming/week10/reflection/alice.txt").stream()
                .map(e-> e.replaceAll("'", " "))
                .map(e-> e.replaceAll(":", " "))
                .map(e-> e.replaceAll("'s", " "))
                .map(e-> e.replaceAll("’", " "))
                .map(e-> e.replaceAll("‘", " "))
                .map(e-> e.replaceAll(":", " "))
                .map(e-> e.replaceAll("#", " "))
                .map(e-> e.replaceAll("/", " "))
                .map(e-> e.replaceAll("-", " "))
                .map(e-> e.replaceAll( "\\.", " "))
                .map(e-> e.replaceAll( "\\*", " "))
                .map(e-> e.replaceAll( "\\(", " "))
                .map(e-> e.replaceAll( "\\)", " "))
                .map(e-> e.replaceAll( "\\[", " "))
                .map(e-> e.replaceAll( "\\]", " "))
                .map(e-> e.split(" "))
                .flatMap(e-> Stream.of(e))
                .collect(Collectors.toList());



    }
}
