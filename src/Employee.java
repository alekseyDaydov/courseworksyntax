import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;

    private static int countId;

    private int incrementId() {
        return countId = countId + 1;
    }

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        if (firstName == null || middleName == null || lastName == null || department < -1 || salary < 0) {
            throw new IllegalArgumentException("Поле обязательно для заполнения");
        }
        id = incrementId();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("Поле не может быть пустым");
        }
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        if (middleName == null) {
            throw new IllegalArgumentException("Поле не может быть пустым");
        }
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Поле не может быть пустым");
        }
        this.lastName = lastName;
    }

    public void setDepartment(int department) {
        if (department < 0) {
            throw new IllegalArgumentException("Поле не может быть пустым");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Поле не может быть пустым");
        }
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department, salary);
    }

    @Override
    public String toString() {
        return "id: " + id + " Имя: " + firstName + " Отчество: " + middleName + " Фамилия: " + lastName +
                " отдел: " + department + " зарплата " + salary;
    }
}
