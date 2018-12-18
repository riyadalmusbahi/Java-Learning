package decJavaProgramming.week5.paintingsColors;


import decJavaProgramming.week5.shapesCirlcles.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Name: " + rectangle.getName());

        Colored colored = (Colored) rectangle;
        System.out.println("Colored: " + colored.getColor());

        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape.getName());

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle);
        List<Colored> coloreds = new ArrayList<>();
        coloreds.add(rectangle);
        coloreds.add(colored);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(shape);

        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);
    }
}
