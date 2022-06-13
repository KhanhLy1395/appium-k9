package lab_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSalary {



    public static void main(String[] args) {
        Employee employee1 = new ContractEmployee();
        Employee employee2 = new ContractEmployee();
        Employee employee3 = new ContractEmployee();
        Employee employee4 = new FullTimeEmployee();
        Employee employee5 = new FullTimeEmployee();

        SalaryController totalSalary = new SalaryController();
        System.out.println(totalSalary.getTotalSalary(Arrays.asList(employee1, employee2, employee3, employee4, employee5)));

    }
}
