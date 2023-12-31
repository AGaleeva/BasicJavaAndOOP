package lesson22.homework22.eShop;

public class Electronics extends Product {

    public Electronics(String title, double price) {
        super(title, price);    }

    @Override
    public void buy() {
        super.buy();
        makeWarranty();
    }

    private void makeWarranty() {
        System.out.println("The product includes the official warranty. Please, fill the form.");
    }
}
