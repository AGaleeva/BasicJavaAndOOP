package lesson22.homework22.dogs;

public class ToyDogs extends Dogs {
    public ToyDogs(String nickname, String breedName, String avgSize) {
        super(breedName, nickname, avgSize);
    }

    public void beCompanion() {
        System.out.println("I am an attentive and affectionate companion.");
    }
}
