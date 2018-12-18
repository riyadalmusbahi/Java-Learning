package decJavaProgramming.week5.reflectionWeek5;

import decJavaProgramming.week5.ikeaFurniture.AddShelf;
import decJavaProgramming.week5.ikeaFurniture.AddTop;
import decJavaProgramming.week5.ikeaFurniture.Furniture;
import decJavaProgramming.week5.ikeaFurniture.Step;

import java.util.ArrayList;
import java.util.List;

public class TvTableBuilder {

    List<Step>steps = getSteps();

    public Furniture build() {
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }
    private List<Step> getSteps() {
        List<Step> steps = new ArrayList<>();
        steps.add(new AddLeg());
        steps.add(new AddLeg());
        steps.add(new AddLeg());
        steps.add(new AddLeg());
        steps.add(new AddShelf());
        steps.add(new AddTop());
        return steps;
    }
}
