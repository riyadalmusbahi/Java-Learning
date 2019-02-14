package janJavaProgramming.week8.recapExercise;

public class AndInstruction implements Instruction {
    @Override
    public String getInstruction(String line) {
        String firstStep = line.replaceAll("&", "");
        String decryptedInstruction = "";
        for (int position = firstStep.length() - 1; position >= 0; position--) {
            decryptedInstruction = decryptedInstruction + firstStep.charAt(position);

        }
        return decryptedInstruction;
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("&");
    }
}
