package lesson22.inheritance;

public class SupportEngineer extends Employee {
    public SupportEngineer(String name, int salary) {
        super(name, salary);
    }

    public String toString() {
        return "Support engineer " + super.getName() + " " + super.getSalary();
    }

    public void work() {
        System.out.println("I am " + super.getName() + ". I am a support engineer. I work with clients.");
    }
}
