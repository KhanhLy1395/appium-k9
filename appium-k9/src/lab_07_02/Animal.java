package lab_07_02;

import java.security.SecureRandom;

public class Animal {

    private int speed;
    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return randomSpeed;
    }
    int randomSpeed = new SecureRandom().nextInt(50);

}
