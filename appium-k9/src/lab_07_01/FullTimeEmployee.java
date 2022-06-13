package lab_07_01;

public class FullTimeEmployee extends Employee {

    private int salary = 50000;

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
