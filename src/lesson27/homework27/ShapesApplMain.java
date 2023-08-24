package lesson27.homework27;

import lesson27.homework27.shapesModel.Circle;
import lesson27.homework27.shapesModel.Shape;
import lesson27.homework27.shapesModel.Square;
import lesson27.homework27.shapesModel.Triangle;

public class ShapesApplMain {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(20);
        shapes[1] = new Circle(15);
        shapes[2] = new Triangle(5);
        shapes[3] = new Square(10);

        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                sum += circle.calcArea();
            }
            System.out.println("The perimeter of " + shapes[i].toString() + shapes[i].calcPerimetr());
            System.out.println("The area of " + shapes[i].toString() + shapes[i].calcArea());
        }
        System.out.println("===============================================================");
        System.out.println("The total area of circles = " + sum);
    }
}
