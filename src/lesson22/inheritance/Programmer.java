package lesson22.inheritance;

public class Programmer extends Employee {

    public Programmer(String name, int salary) {
        super(name, salary);                        // super refer to the parent class (Employee)
    }

    public String toString() {
        return "Programmer " + super.getName() + " " + super.getSalary();
    }

    public void work() {
        System.out.println("I am " + super.getName() + ". I am a developer. I write soft.");
    }

    public void writeCode() {
        System.out.println("writeCode....writeCode");
    }

}
