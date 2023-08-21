package lesson24.shapes;

public class Round extends Shape{

    private double radius;
    private static final double PI = 3.1415;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        double square = PI * radius * radius;
        System.out.println("Square of round " + square);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Peremeter of round " + perimeter);
    }
}
