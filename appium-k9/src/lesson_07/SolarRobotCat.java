package lesson_07;

public class SolarRobotCat extends RobotCat{

    @Override
    public String charge(){
       return super.charge() + " by Solar";
    }
}
