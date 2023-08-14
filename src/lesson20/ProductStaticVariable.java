package lesson20;

public class ProductStaticVariable {
    public static int temp;

    private static int counter = 0;
    private int id;
    private String title;
    private double price;

    public ProductStaticVariable(String title, double price) {
        counter++;
        this.id = counter;
        this.title = title;
        this.price = price;
    }

    public static void print() {
        System.out.println("I'am a product.");
    }

    public String toString() {
        return id + "." + title + " " + price + " static temp " + temp;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
