package NovJavaProgramming.dataStructure;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main(String[] args) {
        Set<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String laptop = "laptop";
        String waterBottle = "waterBottle";
        String notebad = "notebad";
        backpack.add(laptop);
        backpack.add(waterBottle);
        backpack.add(notebad);
        System.out.println("Backpack: " + backpack);
        if (backpack.contains(waterBottle)){
            System.out.println("the backpack contains waterbottle");
        }
        backpack.remove(waterBottle);
        System.out.println("Backpack: " + backpack);
        if (!backpack.contains(waterBottle)){
            System.out.println("the backpack no longer contains the waterbottle");
        }
        backpack.add(laptop);
        System.out.println("Backpack: " + backpack);
        backpack.add(laptop);
        System.out.println("Backpack: " + backpack);
        Integer backpackSize = backpack.size();
        System.out.println("Backpack size: " + backpackSize);







    }
}
