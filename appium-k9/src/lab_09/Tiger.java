package lab_09;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private static int TIGER_MAX_SPEED = 100;

    public Tiger() {
        super(TIGER_MAX_SPEED);
    }

    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
