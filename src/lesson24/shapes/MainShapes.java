package lesson24.shapes;

public class MainShapes {
    public static void main(String[] args) {
        Shape round = new Round(10);
        Shape rectangle = new Rectangle(5, 4);


//        round.calculateSquare();
//        rectangle.calculateSquare();

        Shape[] shapes = new Shape[2];
        shapes[0] = round;
        shapes[1] = rectangle;

        for (Shape shape : shapes) {
            shape.calculateSquare();
            shape.calculatePerimeter();
        }

    }
}
