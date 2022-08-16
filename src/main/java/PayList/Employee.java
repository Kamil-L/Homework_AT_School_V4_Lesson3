package PayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Employee {

    public String name;
    public String surname;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + ", Salary: " + salary;
    }

    public static void allEmployeesData(Company company) {
        ArrayList<Employee> gEmployee = company.getEmployeeAll();
        for (Employee allEmpData : gEmployee) {
            System.out.println(allEmpData);
        }
    }

    public static void sumOfEmployeesSalary(Company company) {
        ArrayList<Employee> gEmployee = company.getEmployeeAll();
        double sumOfSalaryOfAllEmployees = 0;
        for (Employee allEmpData : gEmployee) {
            sumOfSalaryOfAllEmployees += allEmpData.getSalary();
        }
        System.out.print("Sum of salary of all employees is: " + sumOfSalaryOfAllEmployees + "\n\n");
    }

    public static Employee addingNewEmployeeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Input Salary: ");
        double salary = scanner.nextDouble();

        return new Employee(name, surname, salary);
    }

    public static void creatingEmployeeAndAddToList(Company company) {
        System.out.println("Please add new employee: ");
        company.employeesData.add(addingNewEmployeeData());
    }

    public static int validationForCorrectMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        String chosenNumber = scanner.nextLine();
        String[] correctMenuChoice = new String[]{"1", "2", "3", "4"};
        List<String> correctChoice = new ArrayList<>(Arrays.asList(correctMenuChoice));
        while (!correctChoice.contains(chosenNumber)) {
            System.out.println("Please insert option from the following range: 1, 2, 3 or 4: ");
            chosenNumber = scanner.nextLine();
        }
        return Integer.parseInt(chosenNumber);
    }
}