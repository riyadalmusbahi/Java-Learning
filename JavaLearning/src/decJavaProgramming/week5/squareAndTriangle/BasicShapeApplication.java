package decJavaProgramming.week5.squareAndTriangle;

import decJavaProgramming.week5.shapesCirlcles.Circle;
import decJavaProgramming.week5.shapesCirlcles.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicShapeApplication {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());

        Shape square = new Square();
        System.out.println("Shape: " + square.getName());

        Shape triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());

//        List<Circle> circles = new ArrayList<>();
//        circles.add(circle);
//        circles.add(square);
//        circles.add(triangle);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        System.out.println("shapes: " + shapes);

        for (Shape shape : shapes) {
            System.out.println("Shape name: " + shape.getName());
        }




    }
}
