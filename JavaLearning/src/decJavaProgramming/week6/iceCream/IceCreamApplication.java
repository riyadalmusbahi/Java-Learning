package decJavaProgramming.week6.iceCream;

public class IceCreamApplication {

    public static void main(String[] args) {

        IceCream cone = new ConeIceCream("Vanilla", "Strawberry");
        System.out.println("--Cone--");
        System.out.println(cone.eat());

        IceCream cup = new CupIceCream("Jougurt", "Chocolate");
        System.out.println("--Cup--");
        System.out.println(cup.eat());



    }
}
