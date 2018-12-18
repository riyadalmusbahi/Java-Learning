package NovJavaProgramming.reflectionPrW2;

public class PostOfficeAssistant {


    public Letter stamp(Letter letter){
        return letter;
    }


    public void send(Letter letter){
        if (letter.isStamped()){
        System.out.println("you can send the letter now");
        }

        else System.out.println("The letter needs to be stamped first");
    }
}
