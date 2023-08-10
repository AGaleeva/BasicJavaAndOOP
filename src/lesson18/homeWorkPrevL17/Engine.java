package homeWorkPrevFromLes17;

public class Engine {
    int power;
    String type;
    boolean isStarted = false;

    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public String toString() {
        return "Engine: " + type + ", " + power + " hv" + " (isStarted: " + isStarted + ")";
    }

    public void start() {
        if (!isStarted) {
            System.out.println("The engine is started.");
            isStarted = true;
        }
    }

    public void stop() {
        if (isStarted) {
            System.out.println("The engine is off.");
            isStarted = false;
        }
    }
}
