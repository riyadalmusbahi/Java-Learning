package decJavaProgramming.week5.reflectionWeek5;

import decJavaProgramming.week5.ikeaFurniture.Furniture;
import decJavaProgramming.week5.ikeaFurniture.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture) { furniture.add("Leg");

    }
}
