package lesson22.inheritance;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void paidSalary() {
        System.out.println("I am " + name + ". I get salary " + salary);
    }

    public void work() {}

   /*
   public void writeCode() {                       // Это идейно неправильно, это метод только программера, там и надо его создавать.
      System.out.println("I can not write code");
    }
    */

}
