package PayList;

import java.util.ArrayList;

public class Company {

    private final ArrayList<Employee> employeesData;

    public Company() {
        this.employeesData = new ArrayList<>();
    }

    public void printEmployeesData() {
        for (Employee allEmpData : employeesData) {
            System.out.println(allEmpData);
        }
    }

    public void sumOfEmployeesSalary() {
        double sumOfSalaryOfAllEmployees = 0;
        for (Employee allEmpData : employeesData) {
            sumOfSalaryOfAllEmployees += allEmpData.getSalary();
        }
        System.out.print("Sum of salary of all employees is: " + sumOfSalaryOfAllEmployees + "\n\n");
    }

    public void addEmployee(Employee employee) {
        employeesData.add(employee);

    }
}