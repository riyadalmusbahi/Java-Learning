package NovJavaProgramming.reflictionWeek4;
import NovJavaProgramming.dataStructure.printShop.FileReader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        List<String> robodogEncryptedInstructions = reader.asLines("NovJavaProgramming/reflictionWeek4/robodog.txt");
        System.out.println("Encrypted robodog instructions: " + robodogEncryptedInstructions);
        Set<String> decryptedRobodogInstructions = new HashSet<>();
        for (String robodogEncryptedInstruction : robodogEncryptedInstructions) {
            decryptedRobodogInstructions.add(robodogEncryptedInstruction.replaceAll("!", ""));
        }


        System.out.println("Number of unique instructions: " + decryptedRobodogInstructions.size());
        System.out.println("decrypted robodog instructions " + decryptedRobodogInstructions);


        List<String>robodogDecryptedInstructionsWithTimes = new ArrayList<>();
        for (String robodogEncryptedInstruction : robodogEncryptedInstructions) {
            robodogDecryptedInstructionsWithTimes.add(robodogEncryptedInstruction.replaceAll("!", ""));
        }
        System.out.println("moves with doublication : " + robodogDecryptedInstructionsWithTimes);

        Integer moveRight = 0;
        Integer moveLeft = 0;
        Integer bark = 0;
        Integer stepForward = 0;
        Integer stepBackward = 0;

        for (String robodogDecryptedInstructionsWithTime : robodogDecryptedInstructionsWithTimes) {

            if (robodogDecryptedInstructionsWithTime.equals("move right")){ moveRight = moveRight + 1; }
            if (robodogDecryptedInstructionsWithTime.equals("move left")){ moveLeft = moveLeft + 1; }
            if (robodogDecryptedInstructionsWithTime.equals("bark")){ bark = bark + 1; }
            if (robodogDecryptedInstructionsWithTime.equals("step forward")){ stepForward = stepForward + 1; }
            if (robodogDecryptedInstructionsWithTime.equals("step backwards")){ stepBackward = stepBackward + 1; }
        }

        System.out.println("Moves Counter: " + " move right: " + moveRight + " move left: " + moveLeft + " bark: " +bark + " step forward: " + stepForward + " step backwards: " + stepBackward);

        Integer biggest = 0;

        if (moveRight > biggest){
            biggest = moveRight;
        }
        if (moveLeft > biggest){
            biggest = moveLeft;
        }
        if (bark > biggest){
            biggest = bark;
        }
        if (stepForward > biggest){
            biggest = stepForward;
        }
        if (stepBackward > biggest){
            biggest = stepBackward;
        }
        System.out.println("the most used instruction is used: " + biggest + " times");




    }



}
