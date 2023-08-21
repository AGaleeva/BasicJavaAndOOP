package lesson24.runners;

public class SportsmanAmateur extends Person{

    public SportsmanAmateur(int speed, int rest) {
        super(speed, rest);
    }

    @Override
    public void canRun() {
        super.canRun();
    }
    public void needRest() {
        System.out.println("I need a 10 min rest after the running.");
    }
}
