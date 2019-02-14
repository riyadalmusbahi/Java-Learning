package janJavaProgramming.week8.recapExercise;

public class ExclamationInstruction implements Instruction {
    @Override
    public String getInstruction(String line) {
        return line.replaceAll("!", "");
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("!");
    }
}
