package decJavaProgramming.week6.iceCream;

public abstract class IceCream {

    private String flavor, topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }

    protected String getFlavor() {
        return flavor;
    }

    protected String getTopping() {
        return topping;
    }

    public abstract String eat();
}
