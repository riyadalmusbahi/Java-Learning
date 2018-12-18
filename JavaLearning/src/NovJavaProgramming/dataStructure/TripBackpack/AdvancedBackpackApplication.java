package NovJavaProgramming.dataStructure.TripBackpack;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {


        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        Item item1 = new Item("Toothbrush");
        Item item2 = new Item("Towel");
        Item item3 = new Item("Underwear");

        if (backpack.contains(item3)){
            System.out.println("the backpack contains underwear");
        }

        backpack.add(item1);
        backpack.add(item2);
        backpack.add(item3);
        System.out.println("Backpack: " + backpack);

        Item item = new Item("Underwear");
        backpack.remove(item);
        System.out.println("Backpack: " + backpack);

        if (!backpack.contains(item)){
            System.out.println("the underwear is no longer in the backpack");
        }

        Item item4 = new Item("Towel");
        Item item5 = new Item("Towel");
        System.out.println("Backpack: " + backpack);

        System.out.println("Backpack size: " + backpack.size());
    }
}
