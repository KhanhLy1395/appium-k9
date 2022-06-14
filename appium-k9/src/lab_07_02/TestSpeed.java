package lab_07_02;

public class TestSpeed {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal horse = new Horse();

       int dogSpeed = dog.getSpeed();
       int horseSpeed = horse.getSpeed();
       int tigerSpeed = tiger.getSpeed();

        System.out.println("Dog: " + dogSpeed);
        System.out.println("Tiger: " + tigerSpeed);
        System.out.println("Horse: " + horseSpeed);
        if (dogSpeed > horseSpeed && dogSpeed > tigerSpeed)
           System.out.println("Dog is winner with speed: " + dogSpeed);
        else if (horseSpeed > dogSpeed && horseSpeed >tigerSpeed)
           System.out.println("Horse is winner with speed: " + horseSpeed);
        else if (tigerSpeed > horseSpeed && tigerSpeed > dogSpeed)
           System.out.println("Tiger is winner with speed: " + tigerSpeed);
        else {
            System.out.println("There are at least 2 animal has the same speed");
        }
    }


}
