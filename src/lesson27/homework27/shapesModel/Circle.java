package lesson27.homework27.shapesModel;

public class Circle extends Shape {

    public Circle(double side, double radius) {
        super(side);
    }

    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcPerimetr() {
        return getSide();
    }

    @Override
    public double calcArea() {
        double s = 0;
        return s = Math.pow(getSide(), 2) / (4 * Math.PI);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("circle with circumference ");
        sb.append(getSide()).append(" = ");
        return sb.toString();
    }
}
