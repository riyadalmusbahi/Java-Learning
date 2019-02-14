package febrauaryJavaProgramming.week13.Heroex2;

public abstract class CreditCard {

    protected String name;
    protected Long number;


    public CreditCard(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Long getNumber() {
        return number;
    }
}
