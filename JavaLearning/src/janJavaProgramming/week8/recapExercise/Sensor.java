package janJavaProgramming.week8.recapExercise;

import java.util.Arrays;
import java.util.List;

public class Sensor {


    List<Instruction> instructions = Arrays.asList(new HashInstruction(), new AndInstruction(), new ExclamationInstruction());

    public String getInstruction(String line) {
        String decryptedShit = "";

        for (Instruction instruction : instructions) {
            if (instruction.isThere(line)) {
                decryptedShit = instruction.getInstruction(line);
            }
        }return decryptedShit;
    }
}