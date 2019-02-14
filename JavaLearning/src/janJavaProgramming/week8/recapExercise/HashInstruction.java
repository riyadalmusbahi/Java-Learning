package janJavaProgramming.week8.recapExercise;

public class HashInstruction implements Instruction {



    @Override
    public String getInstruction(String line) {
        String decryptedInstruction = line.replaceAll("#", "");
        decryptedInstruction= decryptedInstruction.replaceAll("robomime", "");
        return decryptedInstruction;


    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("#");
    }
}
