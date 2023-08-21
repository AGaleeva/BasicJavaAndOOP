package lesson24.shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void calculateSquare() {
        int square = height * width;
        System.out.println("Square of rectangle " + square);
    }

    public void calculateSquare(int z) {  // перегрузка метода
        int square = height * width;
        System.out.println("Square of rectangle " + square);
    }

    @Override
    public void calculatePerimeter(){  // переопределение методы
        int perimeter = 2 * (height + width);
        System.out.println("Peremeter of rectangle " + perimeter);
    }
}
