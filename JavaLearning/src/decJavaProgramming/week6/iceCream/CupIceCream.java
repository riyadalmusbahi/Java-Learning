package decJavaProgramming.week6.iceCream;

public class CupIceCream extends IceCream {


    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "the " + getFlavor() +" ice cream with " + getTopping() + "is eaten with a spoon";
    }
}
