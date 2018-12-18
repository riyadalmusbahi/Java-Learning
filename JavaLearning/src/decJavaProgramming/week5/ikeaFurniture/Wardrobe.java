package decJavaProgramming.week5.ikeaFurniture;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture{

    List<String>parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "parts=" + parts +
                '}';
    }
}
