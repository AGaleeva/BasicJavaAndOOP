package lesson22.homework22.dogs;

public class Dogs {
    private String breedName;
    private String nickname;
    private String avgSize;

    public Dogs(String nickname, String breedName, String avgSize) {
        this.breedName = breedName;
        this.avgSize = avgSize;
        this.nickname = nickname;
    }

    public String toString() {
        return nickname + " " + breedName + " " + avgSize;
    }
    public String getBreedName() {
        return breedName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAvgSize() {
        return avgSize;
    }

    public void canWalk() {
        System.out.println("I am walking.");
    }

    public void canRun() {
        System.out.println("I am running.");
    }

    public void canBark() {
        System.out.println("I am barking.");
    }
}
