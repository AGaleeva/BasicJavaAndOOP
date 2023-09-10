package lesson28.company.dao;

import lesson28.company.employeeModel.Employee;

public interface Company {
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee (int id);

    int quantity();

    double totalSalary();

    double avgSalary();

    double totalSales();

    void printEmployees();
    Employee[] findEmployeesHoursGreeterThan(int hours);
    Employee[] findEnployeesSalaryRange(int minSalary, int maxSalary);
}
