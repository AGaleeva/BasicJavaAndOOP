package lesson19.homework19;

public class Article {
    private String category;
    private String brand;
    private String model;
    private String modelYear;
    private String size;
    private double price;

    public Article(String category, String brand, String model, String modelYear, String size, double price) {
        this.brand = brand;
        this.category = category;
        this.model = model;
        this.modelYear = modelYear;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return category + ": " + brand + ", " + model + ", " + modelYear + ", " + size + " cm, " + price + " Eur.";
    }

}
