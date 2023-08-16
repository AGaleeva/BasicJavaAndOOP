package lesson22.homework22.eShop;

public class Main {

    private static Cart cart = new Cart();
    public static void main(String[] args) {

    Product pr1 = new Aliment("yoghurt, 550 gr.", 4.5, 6.5);
    Product pr2 = new Aliment("butter, 500 gr.", 5.5, 6.5);
    Product pr3 = new Aliment("sausage, 1000 gr.", 13.5, 6.5);
    Product pr4 = new Aliment("bread, 750 gr.", 2.5, 6.5);
    Product pr5 = new Aliment("beer, 24 cans", 20.5, 6.5);
    Product pr6 = new Clothes("socks, 6 pair, size 35-38", 7.5);
    Product pr7 = new Clothes("socks, 6 pair, size 39-42", 8.5);
    Product pr8 = new Clothes("T-shirt, size S", 7.0);
    Product pr9 = new Clothes("T-shirt, size M", 7.0);
    Product pr10 = new Clothes("T-shirt, size L", 7.5);
    Product pr11 = new Clothes("T-shirt, size XL", 7.5);
    Product pr12 = new Electronics("Electric Kettle", 35.9);
    Product pr13 = new Electronics("Milk Frother ", 19.9);
    Product pr14 = new Electronics("Filter Coffee Maker Machine ", 24.9);


    cart.addProduct(pr5);
    cart.addProduct(pr7);
    cart.addProduct(pr12);

    System.out.println(cart.toString());

        System.out.println("===============================================");
    pr5.buy();
        System.out.println("===============================================");
    pr7.buy();
        System.out.println("===============================================");
    pr12.buy();

    }
}
