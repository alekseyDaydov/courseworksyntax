import java.util.Arrays;

public class Main {

    public static void printEmployees(Employee[] employees) {
        System.out.println(Arrays.toString(employees));
    }

    public static double calculateSalaryEmployees(Employee[] employees) {
        double totalSalary = 0;
        for (Employee salaryEmployee : employees) {
            if (salaryEmployee != null) {
                totalSalary = totalSalary + salaryEmployee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findMinSalaryEmployee(Employee[] employees) {
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

    public static Employee findMaxSalaryEmployee(Employee[] employees) {
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

    public static double calculateAverageSalaryEmployees(Employee[] employees) {
        int count = 0;
        double salaryEmployees = calculateSalaryEmployees(employees);
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

    public static void printFioEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Фамилия: " + employee.getLastName() + " Имя: " + employee.getFirstName() + " Отчество: " + employee.getMiddleName());
            }
        }
    }

    public static boolean isExistDepartment(int department) {
        return department < 1 || department > 5;
    }

    public static boolean isExistEmployee(Employee employee) {
        return employee != null;
    }

    public static void indexSalary(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            if (isExistEmployee(employee)) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent);
            }
        }
    }

    public static Employee findMinSalaryDepartmentEmployee(Employee[] employees, int department) {
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

    public static Employee findMaxSalaryDepartmentEmployee(Employee[] employees, int department) {
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

    public static double calculateSalaryDepartmentEmployees(Employee[] employees, int department) {
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

    public static double calculateAverageSalaryDepartmentEmployees(Employee[] employees, int department) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        int count = 0;
        double salaryEmployees = calculateSalaryDepartmentEmployees(employees, department);
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

    public static void indexSalaryDepartmentEmployee(Employee[] employees, int department, double percent) {
        if (isExistDepartment(department)) {
            throw new IllegalArgumentException("введен не корректный номер отдела");
        }
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent);
            }
        }
    }

    public static void printDepartmentEmployees(Employee[] employees, int department) {
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

    public static void printEmployee(Employee employee) {
        System.out.println("id " + employee.getId() + " Фамилия " + employee.getLastName() +
                " Имя " + employee.getFirstName() + " Отчество " + employee.getMiddleName() +
                " Заплата " + employee.getSalary());

    }

    public static void getMinSalaryByNumber(Employee[] employees, double minSalary) {
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getSalary() < minSalary) {
                printEmployee(employee);
            }
        }
    }

    public static void getMaxSalaryByNumber(Employee[] employees, double maxSalary) {
        for (Employee employee : employees) {
            if (isExistEmployee(employee) && employee.getSalary() > maxSalary) {
                printEmployee(employee);
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        EmployeeBook employeeBook = new EmployeeBook();
        employees[0] = new Employee("Петр", "Петрович", "Петров", 5, 58_259.43);
        employees[1] = new Employee("Иван", "Иванович", "Иванов", 4, 25_000.36);
        employees[2] = new Employee("Андрей", "Андреевич", "Андреев", 2, 23_357.95);
        employees[3] = new Employee("Алексей", "Алексеевич", "Алексеев", 4, 80_000.00);
        employees[4] = new Employee("Виктор", "Викторович", "Викторов", 4, 72_526.64);
        employees[5] = new Employee("Сергей", "Сергеевич", "Сергеев", 5, 61_050.71);

        printEmployees(employees);
        double totalSalary = calculateSalaryEmployees(employees);
        System.out.println("Зарплата всех сотрудников: " + totalSalary);

        Employee minSalaryEmployee = findMinSalaryEmployee(employees);
        System.out.println("Сотрудсник с минимальной зарплатой: " + minSalaryEmployee);

        Employee maxSalaryEmployee = findMaxSalaryEmployee(employees);
        System.out.println("Сотрудник с максимальной зарлатой " + maxSalaryEmployee);

        double averageSalary = calculateAverageSalaryEmployees(employees);
        System.out.println("Средняя зарплата в организации" + averageSalary);
        printFioEmployees(employees);

//        indexSalary(employees, .20);
//        printEmployees(employees);

        System.out.println(findMinSalaryDepartmentEmployee(employees, 4));
        System.out.println(findMaxSalaryDepartmentEmployee(employees, 4));
        System.out.println(calculateSalaryDepartmentEmployees(employees, 4));
        System.out.println(calculateAverageSalaryDepartmentEmployees(employees, 4));
        printDepartmentEmployees(employees, 3);

        getMinSalaryByNumber(employees, 50_000);
        getMaxSalaryByNumber(employees, 50_000);


    }
}