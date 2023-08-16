package lesson22.homework22.dogs;

public class Main {
    public static void main(String[] args) {

        Dogs d1 = new WorkingDogs("Black", "German Shepherd", "big dog");
        Dogs d2 = new Terriers("Terri", "Cairn Terrier", "middle dog");
        Dogs d3 = new ToyDogs("Steffi", "Chihuahua", "small dog");

        System.out.println(d3.toString());
    }
}
