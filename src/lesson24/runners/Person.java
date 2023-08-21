package lesson24.runners;

public class Person {

    int speed;
    int rest;
    public Person(int speed, int rest) {
        this.speed = speed;
        this.rest = rest;
    }

    public void canRun() {
        System.out.println("I am running at the speed " + speed + " km/h.");
        needRest();
    }

    public void needRest() {
        System.out.println("I need a " + rest + " min rest after the running.");
    }
}
