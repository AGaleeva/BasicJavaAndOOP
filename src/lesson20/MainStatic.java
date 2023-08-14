package lesson20;

public class MainStatic {
    public static void main(String[] args) {
        ProductStaticVariable[] array = {
        new ProductStaticVariable("Product title 1", 0.6),
        new ProductStaticVariable("Product title 2", 1.3),
        new ProductStaticVariable("Product title 3", 10.5),
        new ProductStaticVariable("Product title 4", 1.6),
        new ProductStaticVariable("Product title 5", 4.2),
        new ProductStaticVariable("Product title 6", 3.6),
        new ProductStaticVariable("Product title 7", 4.0),
        new ProductStaticVariable("Product title 8", 8.6),
        };

        CartSt cart = new CartSt();
        cart.addProduct(array[0]);
        cart.addProduct(array[2]);
        cart.addProduct(array[7]);
        System.out.println(cart);

        System.out.println();

        cart.removeById(3);
        System.out.println(cart);

        System.out.println("Quantity " + cart.prodQuantities());
        System.out.println("Amount " + cart.sum());


        System.out.println("========================================================");

        ProductStaticVariable p1 = new ProductStaticVariable("Product title 2", 1.3);
        ProductStaticVariable p2 = new ProductStaticVariable("Product title 3", 10.5);

        p1.temp = 10; // такое обращение неправильно

        System.out.println(p1);
        System.out.println(p2);

        ProductStaticVariable.temp = 20; // правильное обращение

        System.out.println("=============================================================");

        ProductStaticVariable.print();

        StaticDemo.printMsg("this is message"); // метод static принадлежит всему классу, не надо создавать объект

        StaticDemo obj = new StaticDemo(); // если метод не static,то надо сперва создать объект, а потом уже обращаться к методу
        obj.prntMsg("this is message");
    }
}
