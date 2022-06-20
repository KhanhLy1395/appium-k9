package lab_09;

import java.security.SecureRandom;

public abstract class Animal {

    private String name;
    private int speed;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public abstract int getSpeed();

}
