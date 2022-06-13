package lab_7;

public class ContractEmployee extends Employee{

    private int salary = 40000;

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
