package NovJavaProgramming.supermarket;

public class NumberCorrector {
    public Integer correct(Double messedUpNumber){

        messedUpNumber = Math.abs(messedUpNumber);
        Integer correctNumber = (int)Math.floor(messedUpNumber);

        return correctNumber;
    }
}
