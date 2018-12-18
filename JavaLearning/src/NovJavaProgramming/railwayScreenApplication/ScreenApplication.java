package NovJavaProgramming.railwayScreenApplication;

public class ScreenApplication {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Norbert", "Business");
        Customer customer2 = new Customer("Aizhana", "Economic");

        Screen screen = new Screen();
        screen.display(customer1);
        screen.display(customer2);
    }
}
