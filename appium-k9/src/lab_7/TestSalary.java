package lab_7;

import java.util.Arrays;

public class TestSalary {



    public static void main(String[] args) {
        Employee Employee1 = new ContractEmployee();
        Employee Employee2 = new ContractEmployee();
        Employee Employee3 = new ContractEmployee();
        Employee Employee4 = new FullTimeEmployee();
        Employee Employee5 = new FullTimeEmployee();

        Employee1.getSalary();
        Employee2.getSalary();
        Employee3.getSalary();
        Employee4.getSalary();
        Employee5.getSalary();

        SalaryController totalSalary = new SalaryController();
        System.out.println(totalSalary.getTotalSalary(Arrays.asList(Employee1, Employee2, Employee3, Employee4, Employee5)));
    }
}
