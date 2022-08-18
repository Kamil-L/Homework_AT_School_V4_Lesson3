package PayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new Company();
        Company.employeesData = new ArrayList<>();
        boolean quitFromProgram = false;

        System.out.println("Please input 5 new employees data: ");
        for (int i = 1; i <= 2; i++) {
            System.out.println("The " + i + " employee data: ");
            Company.employeesData.add(addingNewEmployeeData());
        }

        while (!quitFromProgram) {
            System.out.println("Menu:");
            System.out.println(
                    """
                            1 - Print sum of all employees salary\s
                            2 - Display all employees data\s
                            3 - Add new employee\s
                            4 - End program\s
                            
                            Select option from menu:""");

            int menuChoice = validationForCorrectMenuChoice();
            switch (menuChoice) {
                case 1 -> Company.sumOfEmployeesSalary(Company.employeesData);
                case 2 -> Company.printEmployeesData(Company.employeesData);
                case 3 -> {
                    System.out.println("Please add new employee: ");
                    Company.employeesData.add(addingNewEmployeeData());
                }
                case 4 -> {
                    System.out.println("Program ended!");
                    quitFromProgram = true;
                }
                default -> System.out.println("Undefined error! Please restart program.");
            }
        }
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

    public static int validationForCorrectMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        String chosenNumber = scanner.nextLine();
        List<String> correctChoice = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        while (!correctChoice.contains(chosenNumber)) {
            System.out.println("Please insert option from the following range: 1, 2, 3 or 4: ");
            chosenNumber = scanner.nextLine();
        }
        return Integer.parseInt(chosenNumber);
    }
}
