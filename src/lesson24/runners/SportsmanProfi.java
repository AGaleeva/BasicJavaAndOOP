package lesson24.runners;

public class SportsmanProfi extends SportsmanAmateur {
    public SportsmanProfi(int speed, int rest) {
        super(speed, rest);
    }

    public void needRest() {
        System.out.println("I need a 5 min rest after the running.");
    }

    @Override
    public void canRun() {
        super.canRun();
    }
}
