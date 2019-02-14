package janJavaProgramming.week10.reflection;

import java.util.List;

public class AliceApplication {

    public static void main(String[] args) {

        AliceBookReader aliceBookReader = new AliceBookReader();

        List<String> aliceBookWords = aliceBookReader.getAliceBookListWords();
        System.out.println(aliceBookWords.size());
    }
}
