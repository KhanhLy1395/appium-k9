package lesson_09;

import java.util.List;

public class SalaryCaculator {

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            // NOT RECOMMEND | Bad practice
            if (employee instanceof FTE){
                totalSalary = totalSalary + employee.getSalary() + ((FTE) employee).supportMoney();
            }
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
