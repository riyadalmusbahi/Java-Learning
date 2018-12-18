package NovJavaProgramming.dataStructure.shoppingList;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {



        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);

        Grocery grocery1 = new Grocery("bananas");
        Grocery grocery2 = new Grocery("oranges");
        Grocery grocery3 = new Grocery("potato");

        groceries.add(grocery1);
        groceries.add(grocery2);
        groceries.add(grocery3);

        System.out.println("Groceries: " + groceries);

        Grocery grocery4 = new Grocery("potato");
        groceries.remove(grocery4);
        System.out.println("Groceries: " + groceries);
        Grocery grocery5 = new Grocery("oranges");
        Grocery grocery6 = new Grocery("oranges");
        groceries.add(grocery5);
        groceries.add(grocery6);

        System.out.println("Groceries: " + groceries);

        groceries.remove(2);

        System.out.println("The size of Groceries is: " + groceries.size());

    }
}
