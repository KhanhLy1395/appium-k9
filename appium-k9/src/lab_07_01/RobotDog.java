package lab_07_01;

public class RobotDog {

    public static int getDogID() {
        return dogID;
    }

    protected static int dogID= 0;

    public RobotDog(){
        dogID++;
    }
}
