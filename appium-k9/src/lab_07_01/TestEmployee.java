package lab_07_01;

public class TestEmployee {

    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee();
        Employee partTimeEmployee = new ContractEmployee();

        System.out.println(fullTimeEmployee.chargeSalary());
        System.out.println(partTimeEmployee.chargeSalary());
    }




}
