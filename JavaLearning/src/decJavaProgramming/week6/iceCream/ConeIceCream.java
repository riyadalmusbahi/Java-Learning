package decJavaProgramming.week6.iceCream;

public class ConeIceCream extends IceCream {


    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "Ice-Cream " + getFlavor() + " flavor and with" + getTopping() +" topping is licked";
    }
}
