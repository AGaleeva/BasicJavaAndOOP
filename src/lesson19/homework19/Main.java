package lesson19.homework19;

public class Main {

    public static void main(String[] args) {

        Article voelklRT165 = new Article("Race skies", "Völkl", "Racetiger RC Red", "2023", "165", 521.69);
        Article voelklRT170 = new Article("Race skies", "Völkl", "Racetiger RC Red", "2023", "170", 549.79);
        Article voelklRT175 = new Article("Race skies", "Völkl", "Racetiger RC Red", "2023", "175", 499.99);
        Article voelklRT180 = new Article("Race skies", "Völkl", "Racetiger RC Red", "2023", "180", 471.99);

        Article voelklAM154 = new Article("All Mountain skies", "Völkl", "Deacon XTD", "2023", "154", 399.99);
        Article voelklAM161 = new Article("All Mountain skies", "Völkl", "Deacon XTD", "2023", "161", 459.79);
        Article voelklAM168 = new Article("All Mountain skies", "Völkl", "Deacon XTD", "2023", "168", 479.99);
        Article voelklAM175 = new Article("All Mountain skies", "Völkl", "Deacon XTD", "2023", "175", 421.69);


        Cart cart1 = new Cart();

        cart1.addArticle(voelklRT165);
        cart1.addArticle(voelklRT175);
        cart1.addArticle(voelklAM168);
        cart1.addArticle(voelklAM161);
        cart1.addArticle(voelklRT180);

        System.out.println(cart1);
        System.out.println();

        cart1.removeArticle(voelklRT165);
        System.out.println(cart1);

        Order order1 = new Order();

        order1.orderToPrint(cart1);
        order1.orderSumToPrint(cart1);





    }
}
