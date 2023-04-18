package CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] employeeData = scanner.nextLine().split("\\s+");
            //Peter 120.00 Dev Development peter@abv.bg 28
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];
            Employee employee = null;
            if (employeeData.length == 6) {
                String email = employeeData[4];
                int age = Integer.parseInt(employeeData[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (employeeData.length == 5) {
                String parameterFourth = employeeData[4];
                if (parameterFourth.contains("@")) {
                    String email = parameterFourth;
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(parameterFourth);
                    employee = new Employee(name, salary, position, department, age);
                }
            } else if (employeeData.length == 4) {
                employee = new Employee(name, salary, position, department);
            }
            if (!departments.containsKey(department)) {
                departments.put(department, new Department(department));
            }

            //добавим служителя в списъка със служителите на отдела
            departments.get(department).getEmployees().add(employee);

        }
        Department maxAverageSalaryDepartment = departments.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getName());
        maxAverageSalaryDepartment.getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
}
