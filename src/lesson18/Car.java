package practicum;

public class Car {


    private String brand;
    private String color;
    private String licensePlate;
    private MyDate registrationDate;
    private Engine engine;

    private boolean isDriving;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        isDriving = false;
    }

    public void ignition() {
        engine.start();
    }

    public String toString() {
        return color + " " + brand + " (" + licensePlate + " " + registrationDate.toString() + ") " + engine.toString() + " (isDriving: " + isDriving + ")";
    }

    public void drive() {
        if (isDriving) {
            System.out.println("The car " + toString() + " is already driving.");
            return;                                             // это заменяет последующий else, который здесь опущен
        }
        engine.start();
        isDriving = true;
        System.out.println("The Car " + toString() + " " + " is driving."); // метод именно этого класса, можно было написать this.toString()
    }

    public void stop() {
        if (!isDriving) {
            System.out.println("The car " + toString() + " is already stopped.");
            return;                                             // это заменяет последующий else, который здесь опущен
        }
        System.out.println("The Car " + toString() + " " + " is stopped."); // метод именно этого класса, можно было написать this.toString()
        isDriving = false;
        engine.stop();
    }
}



