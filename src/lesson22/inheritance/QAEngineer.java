package lesson22.inheritance;

public class QAEngineer extends Employee {
    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    public String toString() {
        return "QA engineer " + super.getName() + " " + super.getSalary();
    }

    public void work() {
        System.out.println("I am " + super.getName() + ". I am a QA engineer. I test soft.");
    }

}
