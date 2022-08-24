package PayList;

public class Employee {

    private final String name;
    private final String surname;
    private final double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + "Name: " + getName() + ", Surname: " + getSurname() + ", Salary: " + getSalary();
    }

}