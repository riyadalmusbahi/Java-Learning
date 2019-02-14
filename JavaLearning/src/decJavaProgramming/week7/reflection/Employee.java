package decJavaProgramming.week7.reflection;

public class Employee {

    private String name, bankAccount, department, salary;

    public Employee(String name, String bankAccount, String department, String salary) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
