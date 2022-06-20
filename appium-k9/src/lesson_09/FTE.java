package lesson_09;

public class FTE extends Employee{

    private static int FTE_SALARY = 50000;

    public FTE(String name) {
        super(name, FTE_SALARY);
    }

    public int supportMoney(){
        return 5000;
    }
}
