package lesson22.homework22.dogs;

public class WorkingDogs extends Dogs {

    public WorkingDogs(String nickname, String breedName, String avgSize) {
        super(breedName, nickname, avgSize);
    }

    public void canWaterResque() {
        System.out.println("I am performing water rescues.");
    }

    public void beGuard() {
        System.out.println("I am guarding property.");
    }
}
