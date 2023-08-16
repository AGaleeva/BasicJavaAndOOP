package lesson19.homework19;

public class Order {

    String name;

    public void orderToPrint(Cart cart) {
        System.out.println("Your order contains: \n" + cart);
    }

    public void orderSumToPrint(Cart cart) {
        System.out.println("The total amount of your order is " + cart.countPrice() + " Eur.");
    }
    public static void main(String[] args) {

    }
}
