package lesson22.homework22.dogs;

public class Terriers extends Dogs {

    public Terriers(String nickname, String breedName, String avgSize) {
        super(breedName, nickname, avgSize);
    }


    public void canChaseRodents() {
        System.out.println("I am going undergrounds and chasing rodents.");
    }
}
