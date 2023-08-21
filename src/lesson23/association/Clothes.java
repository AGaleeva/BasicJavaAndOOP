package lesson23.association;

// Тип отношений "ассоциация" по-английски называется "HAS A...", т.е. каждая одежда имеет продукт.
// Т.е. один класс имеет полем другой класс.
// Агрегация. Пример: есть работники и у работников есть поле "должность". Но некоторые работники могут существовать без должности.
// Композиция: противоположный тип отношений (внешний объект не может существовать без внутреннего).
// Здесь - это композиция: одежда может существовать без продукта.

public class Clothes  {
    private Product product;
    private int id;
    private String size;
    private int packQty;



    public Clothes (Product product, int id, String size, int packQty) {
        this.product = product;
        this.id = id;
        this.size = size;
        this.packQty = packQty;
    }


    public void buy() {
        product.buy();
    }

    @Override
    public String toString() {
        return "Clothes (" +
                "product=" + product +
                ", id=" + id +
                ", size='" + size + '\'' +
                ", packQty=" + packQty +
                ')';
    }
}
