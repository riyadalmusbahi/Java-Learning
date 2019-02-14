package decJavaProgramming.week7.reflection;

import NovJavaProgramming.dataStructure.printShop.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeReader {

    FileReader reader = new FileReader();

    public List<Employee> asList(String filePath) {
        List<String> lines = reader.asList(filePath);
        removeHeader(lines);
        return toEmployees(lines);
    }
    private void removeHeader(List<String> employeeLines) {
        employeeLines.remove(0);
    }


    private List<Employee> toEmployees(List<String> employeeLines) {
        List<Employee> employees = new ArrayList<>();
        for (String line : employeeLines) {
            employees.add(toEmployee(line));
        }
        return employees;
    }

    private Employee toEmployee(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String department = columns.get(3);
        String salary = columns.get(1);
        String account = columns.get(2);
        return new Employee(name, department, salary, account);

    }
}
