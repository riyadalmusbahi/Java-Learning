package decJavaProgramming.week5.paintingsColors;

import decJavaProgramming.week5.shapesCirlcles.Shape;

public class Rectangle implements Colored, Shape{
    @Override
    public String getColor() {
        return "Blue";
    }


    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor() + " " + getName();
    }
}
