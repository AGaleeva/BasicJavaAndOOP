package lesson17.homeWork17;

public class Engine {

    String engineType;
    int power;

    public Engine(String engineType, int power) {
        this.engineType = engineType;
        this.power = power;
    }

    public String toString() {
        return "engine type is " + engineType + " and its power is " + power + " kW.";
    }

    public void start() {
        System.out.println("The engine is running.");
    }

    public void stop() {
        System.out.println("The engine is off.");
    }
}
