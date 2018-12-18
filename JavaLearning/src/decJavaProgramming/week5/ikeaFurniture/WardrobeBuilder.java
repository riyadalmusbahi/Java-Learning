package decJavaProgramming.week5.ikeaFurniture;

import java.util.ArrayList;
import java.util.List;

public class WardrobeBuilder {

    List<Step> steps = getSteps();

    public Furniture build() {
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }


    private List<Step> getSteps() {
        List<Step> steps = new ArrayList<>();
        steps.add(new AddBottom());
        steps.add(new AddSide());
        steps.add(new AddSide());
        steps.add(new AddBack());
        steps.add(new AddTop());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddShelf());
        steps.add(new AddDoor());
        steps.add(new AddDoor());
        return steps;

    }


}
