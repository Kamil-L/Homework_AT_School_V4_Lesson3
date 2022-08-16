package PayList;

import java.util.ArrayList;

import static PayList.Employee.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Company company = new Company(employees);

        System.out.println("Please input 5 new employees data: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println("The " + i + " employee data: ");
            company.employeesData.add(addingNewEmployeeData());
        }

        boolean quitFromProgram = false;

        while (!quitFromProgram) {
            System.out.println("Menu:");
            System.out.println(
                    """
                            1 - Print sum of all employees salary\s
                            2 - Display all employees data\s
                            3 - Add new employee\s
                            4 - End program\s
                            """);
            int menuChoice = validationForCorrectMenuChoice();
            switch (menuChoice) {
                case 1 -> Employee.sumOfEmployeesSalary(new Company());
                case 2 -> Employee.allEmployeesData(new Company());
                case 3 -> creatingEmployeeAndAddToList(new Company());
                case 4 -> {
                    System.out.println("Program ended!");
                    quitFromProgram = true;
                }
                default -> System.out.println("Undefined error! Please restart program.");
            }
        }
    }
}
