package lesson_07;

public class BatteryRobotCat extends RobotCat{

    public BatteryRobotCat() {
    }

    public BatteryRobotCat(String batteryRobotCat, String s) {
    }

    @Override
    public String charge() {
        return super.charge() + "by battery";
    }
}
