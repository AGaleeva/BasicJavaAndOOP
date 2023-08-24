package lesson27.homework27.shapesModel;

public class Square extends Shape{
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcPerimetr() {
        double p = 0;
        return p = 4 * getSide();
    }

    @Override
    public double calcArea() {
        double s = 0;
        return s = getSide() * getSide();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("square with side ");
        sb.append(getSide()).append(" = ");
        return sb.toString();
    }
}
