package lesson28.company.employee.employeeModel;

public class EmployeeApplMain {
    public static void main(String[] args) {

        Employee empl1  = new Manager(1000, "John", "Smith", 160, 3000, 5);
        Employee empl2 = empl1;
        Employee empl3  = new Manager(1000, "John", "Smith", 160, 3000, 5);
        boolean check = empl1 == empl2;
        System.out.println(check);
        check = empl1 == empl3;
        System.out.println(check);
        empl1.setFirstName("Johny");
        System.out.println(empl1.getFirstName()); // Johny
        System.out.println(empl2.getFirstName()); // Johny
        System.out.println(empl3.getFirstName()); // John
        check = empl1.equals(empl3);  // false
        System.out.println(check);
    }
}
