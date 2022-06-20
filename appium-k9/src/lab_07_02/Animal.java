package lab_07_02;

import java.security.PrivilegedAction;
import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isFlyable() {
        return flyable;
    }


}
