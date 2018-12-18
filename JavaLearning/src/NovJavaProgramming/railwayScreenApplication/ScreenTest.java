package NovJavaProgramming.railwayScreenApplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenTest {
    Screen screen = new Screen();

    @Test
    void testBusinessCustomer() {
        Customer customer = new Customer("Mohamed Alhamoud", "Business");
        String name = screen.modifyName(customer);
        Assertions.assertEquals("MOHAMED ALHAMOUD", name);
    }

    @Test
    void testEconomicCustomer() {
        Customer customer = new Customer("Mohamed Alhamoud", "Economic");
        screen.display(customer);
    }

    @Test
    void testOtherCustomer() {
        Customer customer = new Customer("Mohamed Alhamoud", " ");
        screen.display(customer);
    }


}