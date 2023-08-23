package lesson27.employee;

import lesson27.employee.employeeModel.Employee;
import lesson27.employee.employeeModel.Manager;
import lesson27.employee.employeeModel.SalesManager;
import lesson27.employee.employeeModel.WageEmployee;

public class EmployeeApplMain {
    public static void main(String[] args) {
//        int a = 15;
//        long x = a; // Это восходящее приведение типов (upper casting), это автоматическое приведение типов.
//        byte b = (byte) a; // Это низходящее приведение (down casting), это явное приведение типов.
        Object obj = "Hello";
        obj = new Manager(1000, "John", "Smith", 160, 3000, 5);

        Employee[] employees = new Employee[6];
        System.out.println(employees.toString());
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
//        employees[4] = new Employee(5000, "Ivan", "Balda", 160);

        printArray(employees);

        double total = totalSalary(employees);
        System.out.println("Total salary = " + total);
        total = totalSales(employees);
        System.out.println("Total sales = " + total);

    }

    private static double totalSales(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof SalesManager) { // employees != null && ) { в данном случае проверку на null
                // можно опустить, потому что если employees[i] будет null, то пустота не может быть объектом никакого класса.
                SalesManager sm = (SalesManager) employees[i];
                sum += sm.getSalesValue();
//                sum += ((SalesManager) employees[i]).getSalesValue();
            }
        }
        return sum;
    }

    private static double totalSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].calcSalary();
            }
        }
        return sum;
    }
    private static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
}
