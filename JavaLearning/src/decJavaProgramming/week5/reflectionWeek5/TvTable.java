package decJavaProgramming.week5.reflectionWeek5;

import decJavaProgramming.week5.ikeaFurniture.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {

    List<String> parts = new ArrayList<>();

    List<String> getParts(){
        List<String>stringParts = new ArrayList<>();
        stringParts.add("Leg");
        stringParts.add("Leg");
        stringParts.add("Leg");
        stringParts.add("Leg");
        stringParts.add("Shelf");
        stringParts.add("Top");
        return stringParts;
    }



    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "TV Table{" +
                "parts=" + parts +
                '}';
    }
}
