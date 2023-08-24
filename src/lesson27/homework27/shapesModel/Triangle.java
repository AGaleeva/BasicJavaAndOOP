package lesson27.homework27.shapesModel;

public class Triangle extends Shape{
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double s = 0;
        return s = (Math.sqrt(3) / 4) * (Math.pow(getSide(), 2));
    }

    @Override
    public double calcPerimetr() {
        double p = 0;
        return p = getSide() * 3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("triangle with side ");
        sb.append(getSide()).append(" = ");
        return sb.toString();
    }
}
