package lesson28.company.employee.employeeModel.dao;

import lesson28.company.employee.employeeModel.Employee;

public interface Company {
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee (int id);

    int quantity();

    double totalSalary();

    double avgSalary();

    double totalSales();

    void printEmployees();

    int quantityByLastName (String lastName);
}
