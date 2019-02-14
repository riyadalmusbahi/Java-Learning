package janJavaProgramming.week9.ex2;

import NovJavaProgramming.dataStructure.printShop.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    FileReader fileReader = new FileReader();
    List<String> names = fileReader.asList("janJavaProgramming/week9/ex2/names.txt");



    @Test

    void setNamesLessThan4Letters() {

        List<String> namesTest = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, namesTest);
    }

    @Test
    void setNamesEndWithM(){
        List<String> namesTest = names.stream()
                .filter(e -> e.endsWith("m"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Hosam", "Tammam");
        Assertions.assertEquals(expected, namesTest);

    }

    @Test
    void setNamesContainEandI(){
        List<String> namesTest = names.stream()
                .filter(e -> e.contains("e"))
                .filter(e-> e.contains("r"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, namesTest);
    }

    @Test
    void SetNames4Letters(){
        List<String> namesTest = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e-> e.contains("a"))
                .filter(e -> e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected, namesTest);

    }

}
