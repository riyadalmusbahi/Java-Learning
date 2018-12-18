package NovJavaProgramming.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {

        List<String> groceriesList = new ArrayList<>();
        System.out.println(groceriesList);
        String milk = "milk";
        String apple = "apple";
        String bread = "bread";
        groceriesList.add(milk);
        groceriesList.add(apple);
        groceriesList.add(bread);
        System.out.println(groceriesList);
        groceriesList.remove("apple");
        System.out.println(groceriesList);
        groceriesList.add(bread);
        groceriesList.add(bread);
        System.out.println(groceriesList);
        groceriesList.remove(2);
        System.out.println(groceriesList);
        Integer size = groceriesList.size();
        System.out.println(size);



    }
}
