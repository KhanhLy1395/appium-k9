package lesson_07;

public class SolarRobotCat extends RobotCat{


    public SolarRobotCat(String solarRobotCat, String s) {
    }

    @Override
    public String charge() {
        return super.charge() + "by solar";
    }
}
