package lesson29.abstractClass;

public class Dog extends Pet {
    private String name;
    private String breed;

    public Dog(String kind, int age, double weight, boolean gender, String name, String breed) {
        super(kind, age, weight, gender);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("I need a porige and meet.");
    }

    @Override
    public void go() {
        System.out.println("I am walkin, sniffing around and go to a toilet.");
    }

    @Override
    public void voice() {
        System.out.println("Hou-hou!");
    }
}
