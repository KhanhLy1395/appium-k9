package lab_7;

import javax.xml.namespace.QName;

public class Employee {

    private int salary;

    public Employee() {
    }

    public Employee(int salary, String name) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
