package janJavaProgramming.week8.recapExercise;

import NovJavaProgramming.dataStructure.printShop.FileReader;
import decJavaProgramming.week7.reflection.Employee;

import java.util.List;

public class InstructionsReader {

    FileReader fileReader = new FileReader();

    public List<String> asList(String filePath) {
        List<String> lines = fileReader.asList(filePath);
        return (lines);
    }
}
