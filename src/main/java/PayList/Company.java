package PayList;

import java.util.ArrayList;

public class Company {

    public static ArrayList<Employee> employeesData;

    public Company(ArrayList<Employee> employeesData) {
        this.employeesData = employeesData;
    }

    public Company() {
    }

    public ArrayList<Employee> getEmployeeAll() {
        return employeesData;
    }
}