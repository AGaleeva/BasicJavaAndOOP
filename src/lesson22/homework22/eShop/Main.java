package lesson22.homework22.eShop;

public class Main {

    /*
    #1
    Допустим, у нас есть магазин. В нашем магазине есть товары трёх категорий: продукты, электроника, одежда.
    У каждого товара есть цена и наименование . У каждого товара есть метод купить:
    при покупки продуктов должна появиться дополнительная цена за срочность доставки;
    при покупке электроники, покупателю оформляют гарантию
    (т.е. при покупке должен выполнятся метод “Оформить гарантию”).

    Необходимо создать соответствующую структуру классов метод покупки товара.
    Вы можете использовать класс “корзина” реализованный ранее.

    */

    public static void main(String[] args) {

        Cart cart = new Cart();

        /*
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
        */


//        cart.addProduct(new Aliment("yoghurt, 550 gr.", 4.5, 6.5));
//        cart.addProduct(new Aliment("butter, 500 gr.", 5.5, 6.5));
        cart.addProduct(new Aliment("sausage, 1000 gr.", 13.5, 6.5));
        cart.addProduct(new Aliment("bread, 750 gr.", 2.5, 6.5));
        cart.addProduct(new Aliment("beer, 24 cans", 20.5, 6.5));
        cart.addProduct(new Clothes("socks, 6 pair, size 35-38", 7.5));
//        cart.addProduct(new Clothes("socks, 6 pair, size 39-42", 8.5));
        cart.addProduct(new Clothes("T-shirt, size S", 7.0));
//        cart.addProduct(new Clothes("T-shirt, size M", 7.0));
//        cart.addProduct(new Clothes("T-shirt, size L", 7.5));
        cart.addProduct(new Clothes("T-shirt, size XL", 7.5));
        cart.addProduct(new Electronics("Electric Kettle", 35.9));
//        cart.addProduct(new Electronics("Milk Frother ", 19.9));
//        cart.addProduct(new Electronics("Filter Coffee Maker Machine ", 24.9));


        /*System.out.println(cart.toString());

        System.out.println("===============================================");
        pr5.buy();
        System.out.println("===============================================");
        pr7.buy();
        System.out.println("===============================================");
        pr12.buy();*/

        cart.placeOrder();

    }
}
