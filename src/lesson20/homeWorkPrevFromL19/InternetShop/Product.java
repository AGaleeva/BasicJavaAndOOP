package lesson20.homeWorkPrevFromL19.InternetShop;

public class Product {
    public static int temp;
    private int id;
    private String title;
    private double price;

    public Product(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return id + "." + title + " " + price;  // + " static temp " + temp;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

}
