package NovJavaProgramming.carBuying;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car car1 = new Car("BMW");
        Car car2 = new Car("VOLVO");
        Car car3 = new Car("Mitsubishi");
        seller.describe(car1);
        seller.describe(car2);
        seller.describe(car3);

    }


}
