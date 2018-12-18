package NovJavaProgramming.supermarket;

public class SupermarketApplication {

    public static void main(String[] args) {
        Double wrongNumber = new Double(-17.7);
        NumberCorrector corrector = new NumberCorrector();
        System.out.println("the wrong number is : " + wrongNumber );
        Integer x = corrector.correct(wrongNumber);
        System.out.println("the new weight :" + x);
    }

}
