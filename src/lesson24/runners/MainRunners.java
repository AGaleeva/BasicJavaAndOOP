package lesson24.runners;

public class MainRunners {
    public static void main(String[] args) {

        SportsmanAmateur sportsmanAmateur = new SportsmanAmateur(15, 10);
        SportsmanProfi sportsmanProfi = new SportsmanProfi(25, 5);
        Person person = new SportsmanAmateur(12, 12);
        Person person1 = new Person(10, 15);
        Person person2 = new SportsmanProfi(24, 7);

        sportsmanAmateur.canRun();
        sportsmanProfi.canRun();
        person.canRun();
        person1.canRun();
        person2.canRun();

    }
}
