package lesson28.company.employee.employeeModel.test;

import lesson28.company.employee.employeeModel.Employee;
import lesson28.company.employee.employeeModel.Manager;
import lesson28.company.employee.employeeModel.SalesManager;
import lesson28.company.employee.employeeModel.WageEmployee;
import lesson28.company.employee.employeeModel.dao.Company;
import lesson28.company.employee.employeeModel.dao.CompanyImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1]));
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new SalesManager(6000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    @Test
    void removeEmployee() {
        Employee removedEmployee = company.removeEmployee(2000);
        assertNotNull(removedEmployee);
        assertEquals(employees[1], removedEmployee);
        assertEquals(3, company.quantity());
    }

    @Test
    void findEmployee() {
        Employee foundEmployee = company.findEmployee(3000);
        assertNotNull(foundEmployee);
        assertEquals(employees[2], foundEmployee);
    }

    @Test
    void quantity() {
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        company.addEmployee(employee);
        assertEquals(5, company.quantity());
        company.removeEmployee(5000);
        assertEquals(4,company.quantity());
    }

    @Test
    void totalSalary() {
        assertEquals(11200.0, company.totalSalary());
    }

    @Test
    void avgSalary() {
        assertEquals(2800.0, company.avgSalary());
    }

    @Test
    void totalSales() {
        assertEquals(50000, company.totalSales());
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }

    @Test
    void quantityByLastName() {
        assertEquals(0, company.quantityByLastName("Doe"));
        assertEquals(1, company.quantityByLastName("Smith"));
    }
}