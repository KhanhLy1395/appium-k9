package lesson_09_01;

public abstract class Employee {

    private String name;
    private int salary;
    private int supportMoney;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract int getSalary();

    public abstract int getSupportMoney();
}


