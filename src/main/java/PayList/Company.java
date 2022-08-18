package PayList;

import java.util.ArrayList;

public class Company {

    public static ArrayList<Employee> employeesData;

    public static void printEmployeesData(ArrayList<Employee> employeesData) {
        for (Employee allEmpData : employeesData) {
            System.out.println(allEmpData);
        }
    }

    public static void sumOfEmployeesSalary(ArrayList<Employee> employeesData) {
        double sumOfSalaryOfAllEmployees = 0;
        for (Employee allEmpData : employeesData) {
            sumOfSalaryOfAllEmployees += allEmpData.getSalary();
        }
        System.out.print("Sum of salary of all employees is: " + sumOfSalaryOfAllEmployees + "\n\n");
    }
}