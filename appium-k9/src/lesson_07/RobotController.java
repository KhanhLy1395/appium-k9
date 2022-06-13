package lesson_07;

import java.util.List;

public class RobotController {

    public void charge(List<RobotCat> robotCatlist) {
        for (RobotCat robotCat : robotCatlist) {
            robotCat.charge();
        }
    }
}

