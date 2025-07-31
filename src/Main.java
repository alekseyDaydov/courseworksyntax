import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        boolean isAdd1 = employeeBook.addEmployee("Петр", "Петрович", "Петров", 5, 58_259.43);
        if (isAdd1) {
            System.out.println("Сотрудник 1 добавлен");
        }
        employeeBook.printEmployees();
        boolean isAdd2 = employeeBook.addEmployee("Иван", "Иванович", "Иванов", 4, 25_000.36);
        if (isAdd2) {
            System.out.println("Сотрудник 2 добавлен");
        }
        boolean isAdd3 = employeeBook.addEmployee("Андрей", "Андреевич", "Андреев", 2, 23_357.95);
        if (isAdd3) {
            System.out.println("Сотрудник 3 добавлен");
        }
        boolean isAdd4 = employeeBook.addEmployee("Алексей", "Алексеевич", "Алексеев", 4, 80_000.00);
        if (isAdd4) {
            System.out.println("Сотрудник 4 добавлен");
        }
        boolean isAdd5 = employeeBook.addEmployee("Виктор", "Викторович", "Викторов", 4, 72_526.64);
        if (isAdd5) {
            System.out.println("Сотрудник 5 добавлен");
        }
        boolean isAdd6 = employeeBook.addEmployee("Сергей", "Сергеевич", "Сергеев", 5, 61_050.71);
        if (isAdd6) {
            System.out.println("Сотрудник 6 добавлен");
        }
        employeeBook.printEmployees();

        boolean isDeleteEmployeeId3 = employeeBook.deleteEmployee(3);
        if (isDeleteEmployeeId3) {
            System.out.println("сотрудник id = 3 удален");
        }
        employeeBook.printEmployees();
        System.out.println("добавление 7 сотрудника");
        boolean isAdd7Cop6 = employeeBook.addEmployee("Сергей", "Сергеевич", "Сергеев", 5, 61_050.71);
        if (isAdd7Cop6) {
            System.out.println("Сотрудник 7 добавлен, вместо id =3 ");
        }
        employeeBook.printEmployees();

        employeeBook.printEmployee(employeeBook.getIdEmployee(4));

        employeeBook.indexSalary(.3);
        employeeBook.printEmployees();

        System.out.println(employeeBook.findMinSalaryDepartmentEmployee(4));
        System.out.println(employeeBook.findMaxSalaryDepartmentEmployee(4));

        System.out.println("Зарплата по отделу 4" + employeeBook.calculateSalaryDepartmentEmployees(4));
        System.out.println("Средняя зарплата по отделу " + employeeBook.calculateAverageSalaryDepartmentEmployees(4));
        employeeBook.indexSalaryDepartmentEmployee(4, .5);
        employeeBook.printEmployees();
        employeeBook.printFioEmployees();

        employeeBook.getMaxSalaryByNumber(100_000);
        employeeBook.getMinSalaryByNumber(50_000);

        System.out.println("Зарплата в месяц всех сотрудников " + employeeBook.calculateSalaryEmployees());
        System.out.println("Средняя зарплата в организации " + employeeBook.calculateAverageSalaryEmployees());

        System.out.println("Минимальная зарплата в организации " + employeeBook.findMinSalaryEmployee());
        System.out.println("Максимальная зарплата в организации " + employeeBook.findMaxSalaryEmployee());
        employeeBook.printFioEmployees();
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