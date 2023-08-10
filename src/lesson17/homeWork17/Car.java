package lesson17.homeWork17;

public class Car {

    String brand;
    String colour;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car(String brand, String colour, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.colour = colour;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString() {
        return brand + " car"+ ", " + colour + " colour, " + licensePlate + ", first registered at " + registrationDate + ", its " + engine;
    }

    Boolean isDriving = false;
    public void drive() {
        if (!isDriving) {
            engine.start();
            System.out.println("The car is driving.");
            isDriving = true;
        } else {
            System.out.println("The car is already running.");
        }
    }

    public void stop() {
        System.out.println("The car has stopped.");
        engine.stop();
        isDriving = false;
    }
}