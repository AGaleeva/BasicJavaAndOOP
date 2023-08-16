package lesson20.homeworkPrevFromL19.InternetShop;

public class Main {

    /*
    Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
    Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления
    и добавления товара в корзину. Реализовать метод, который распечатает весь заказ. Реализовать метод,
    который вернет сумму заказа.
    */

    public static void main(String[] args) {

        Product[] array = {
                new Product(1,"Product title 1", 0.6),
                new Product(2,"Product title 2", 1.3),
                new Product(3,"Product title 3", 10.5),
                new Product(4,"Product title 4", 1.6),
                new Product(5,"Product title 5", 4.2),
                new Product(6,"Product title 6", 3.6),
                new Product(7,"Product title 7", 4.0),
                new Product(8,"Product title 8", 8.6),
        };

        Cart cart = new Cart();

        cart.addProduct(array[0]);
        cart.addProduct(array[2]);
        cart.addProduct(array[7]);
        System.out.println(cart);

        System.out.println();

        cart.removeById(3);
        System.out.println(cart);

        System.out.println("Quantity " + cart.prodQuantities());
        System.out.println("Amount " + cart.sum());
    }
}
