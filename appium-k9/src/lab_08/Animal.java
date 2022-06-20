package lab_08;

public class Animal {

    private String name;
    private int speed;
    private boolean flyable;

    protected Animal(Builder builder){
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder {
        private String name = "";
        private int speed = 0;
        private boolean flyable = false;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder withFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
