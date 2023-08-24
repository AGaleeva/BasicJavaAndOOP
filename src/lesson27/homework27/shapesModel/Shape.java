package lesson27.homework27.shapesModel;

public abstract class Shape {
    private double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public abstract double calcPerimetr();
    public abstract double calcArea();


}
