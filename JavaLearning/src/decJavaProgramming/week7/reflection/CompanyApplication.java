package decJavaProgramming.week7.reflection;

import java.util.List;

public class CompanyApplication {

    public static void main(String[] args) {


        EmployeeReader employeeReader = new EmployeeReader();
        BankStatisticsCalculator bank = new BankStatisticsCalculator();

        List<Employee> employees = employeeReader.asList("decJavaProgramming/week7/reflection/employees.csv");
//        System.out.println(employees);

        for (Employee employee : employees) {
            System.out.println("Transfer successful: " + employee.getSalary() + " to the account:" + employee.getBankAccount());
        }

        System.out.println("the total amount paid to all employees is: " + bank.calculateTotal(employees));
        }

    }

