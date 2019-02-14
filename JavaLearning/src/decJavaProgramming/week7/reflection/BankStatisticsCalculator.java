package decJavaProgramming.week7.reflection;

import java.util.ArrayList;
import java.util.List;

public class BankStatisticsCalculator {

    public Integer calculateTotal(List<Employee> employees) {
        Integer totalPaid = 0;
        for (Employee employee : employees) {
            Integer salary = Integer.valueOf(employee.getSalary());
            totalPaid = totalPaid + salary;
        }
        return totalPaid;
    }

//    public String findHighestSalary(List<Employee> employees) {
//
//        List<Integer> salaries = new ArrayList<>();
//        for (Employee employee : employees) {
//            Integer salary = Integer.valueOf(employee.getSalary());
//            salaries.add(salary);
//        }
//        Integer highest = 0;
//        for (Integer salary : salaries) {
//            if (salary>highest){
//                highest = salary;
//            }
//
//        }
//    }


}
