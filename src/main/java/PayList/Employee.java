package PayList;

public record Employee(String name, String surname, double salary) {

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