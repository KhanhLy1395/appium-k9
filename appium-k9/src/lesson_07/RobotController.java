package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat bat = new BatteryRobotCat("batteryRobotCat", "");
        RobotCat solar = new SolarRobotCat("solarRobotCat", "");

        robotController.charge(Arrays.asList(bat, solar));
    }
    // Controller | IS-A relationship
    public void charge(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            robotCat.charge();
        }
    }
}
