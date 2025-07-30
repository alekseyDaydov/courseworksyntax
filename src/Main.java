import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        boolean isAdd1 = employeeBook.addEmployee("Петр", "Петрович", "Петров", 5, 58_259.43);
        employeeBook.printEmployees();
        boolean isAdd2 = employeeBook.addEmployee("Иван", "Иванович", "Иванов", 4, 25_000.36);
        boolean isAdd3 = employeeBook.addEmployee("Андрей", "Андреевич", "Андреев", 2, 23_357.95);
        boolean isAdd4 = employeeBook.addEmployee("Алексей", "Алексеевич", "Алексеев", 4, 80_000.00);
        boolean isAdd5 = employeeBook.addEmployee("Виктор", "Викторович", "Викторов", 4, 72_526.64);
        boolean isAdd6 = employeeBook.addEmployee("Сергей", "Сергеевич", "Сергеев", 5, 61_050.71);
        employeeBook.printEmployees();
//        System.out.println(employeeBook.calculateSalaryEmployees());
//
//        employeeBook.deleteEmployee(3);
//        employeeBook.printEmployees();

        //        employees[0] = new Employee("Петр", "Петрович", "Петров", 5, 58_259.43);
//        employees[1] = new Employee("Иван", "Иванович", "Иванов", 4, 25_000.36);
//        employees[2] = new Employee("Андрей", "Андреевич", "Андреев", 2, 23_357.95);
//        employees[3] = new Employee("Алексей", "Алексеевич", "Алексеев", 4, 80_000.00);
//        employees[4] = new Employee("Виктор", "Викторович", "Викторов", 4, 72_526.64);
//        employees[5] = new Employee("Сергей", "Сергеевич", "Сергеев", 5, 61_050.71);
//
//        printEmployees(employees);
//        double totalSalary = calculateSalaryEmployees(employees);
//        System.out.println("Зарплата всех сотрудников: " + totalSalary);
//
//        Employee minSalaryEmployee = findMinSalaryEmployee(employees);
//        System.out.println("Сотрудсник с минимальной зарплатой: " + minSalaryEmployee);
//
//        Employee maxSalaryEmployee = findMaxSalaryEmployee(employees);
//        System.out.println("Сотрудник с максимальной зарлатой " + maxSalaryEmployee);
//
//        double averageSalary = calculateAverageSalaryEmployees(employees);
//        System.out.println("Средняя зарплата в организации" + averageSalary);
//        printFioEmployees(employees);
//
////        indexSalary(employees, .20);
////        printEmployees(employees);
//
//        System.out.println(findMinSalaryDepartmentEmployee(employees, 4));
//        System.out.println(findMaxSalaryDepartmentEmployee(employees, 4));
//        System.out.println(calculateSalaryDepartmentEmployees(employees, 4));
//        System.out.println(calculateAverageSalaryDepartmentEmployees(employees, 4));
//        printDepartmentEmployees(employees, 3);
//
//        getMinSalaryByNumber(employees, 50_000);
//        getMaxSalaryByNumber(employees, 50_000);
//

    }
}