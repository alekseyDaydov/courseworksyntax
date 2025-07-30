import java.util.Arrays;

public class EmployeeBook {
    public Employee employee;
    private final Employee[] employees = new Employee[10];

    public boolean addEmployee(String firsName, String middleName, String lastName, int department, double salary) {
        boolean isEmpty = false;
        int i = 0;
        while ( i < employees.length)  {
           if (isExistEmployee(employee) && isEmpty) {}
            else {
                employees[i] = new Employee(firsName, middleName, lastName, department, salary);
                isEmpty = true;
            }
        }
        return isEmpty;
    }

    public boolean deleteEmployee(int id) {
        boolean isEmpty = true;
        for (int i = 0; i < employees.length; i++) {
            if (isExistEmployee(employees[i]) && employees[i].getId() == id) {
                employees[i] = null;
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public void printEmployees() {
        System.out.println(Arrays.toString(employees));
    }

    public double calculateSalaryEmployees() {
        double totalSalary = 0;
        for (Employee salaryEmployee : employees) {
            if (salaryEmployee != null) {
                totalSalary = totalSalary + salaryEmployee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = employees[0];
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null) && (employees[i].getSalary() < minSalary)) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = employees[0];
        double maxSalary = -1.00;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAverageSalaryEmployees() {
        int count = 0;
        double salaryEmployees = calculateSalaryEmployees();
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("Нельзя посчитать среднюю зарплату! Нет сотрудников в комании!");
        }
        return salaryEmployees / count;
    }

    public void printFioEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Фамилия: " + employee.getLastName() + " Имя: " + employee.getFirstName() + " Отчество: " + employee.getMiddleName());
            }
        }
    }

    public static boolean isExistDepartment(int department) {
        return department < 1 || department > 5;
    }

    public boolean isExistEmployee(Employee employee) {
        return employee != null;
    }

    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (isExistEmployee(employee)) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent);
            }
        }
    }

    public Employee findMinSalaryDepartmentEmployee(int department) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        Employee minSalaryEmployee = employees[0];
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (isExistEmployee(employees[i]) && employees[i].getDepartment() == department && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
            }
        }
        if (minSalary == Double.MAX_VALUE) {
            throw new IllegalArgumentException("Нет отдела в организации");
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryDepartmentEmployee(int department) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        Employee maxSalaryEmployee = employees[0];
        double maxSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (isExistEmployee(employees[i]) && employees[i].getDepartment() == department && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        if (maxSalary == -1) {
            throw new IllegalArgumentException("Нет отдела в организации");
        }
        return maxSalaryEmployee;
    }

    public double calculateSalaryDepartmentEmployees(int department) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        double totalSalary = 0;
        for (Employee salaryEmployee : employees) {
            if (isExistEmployee(salaryEmployee) && salaryEmployee.getDepartment() == department) {
                totalSalary = totalSalary + salaryEmployee.getSalary();
            }
        }
        return totalSalary;
    }

    public double calculateAverageSalaryDepartmentEmployees(int department) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        int count = 0;
        double salaryEmployees = calculateSalaryDepartmentEmployees(department);
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getDepartment() == department) {
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("Нельзя посчитать среднюю зарплату! Нет сотрудников в комании!");
        }
        return salaryEmployees / count;
    }

    public void indexSalaryDepartmentEmployee(int department, double percent) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent);
            }
        }
    }

    public void printDepartmentEmployees(int department) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getDepartment() == department) {
                System.out.println("id " + employee.getId() + "Фамилия " + employee.getLastName() +
                        " Имя " + employee.getFirstName() + " Отчество " + employee.getMiddleName() +
                        " Заплата " + employee.getSalary());
            }
        }
    }

    public void printEmployee() {
        System.out.println("id " + employee.getId() + " Фамилия " + employee.getLastName() +
                " Имя " + employee.getFirstName() + " Отчество " + employee.getMiddleName() +
                " Заплата " + employee.getSalary());

    }

    public void getMinSalaryByNumber(double minSalary) {
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getSalary() < minSalary) {
                printEmployee();
            }
        }
    }

    public void getMaxSalaryByNumber(double maxSalary) {
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getSalary() > maxSalary) {
                printEmployee();
            }
        }
    }
}
