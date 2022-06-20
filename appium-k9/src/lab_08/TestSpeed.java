package lab_08;
import lab_08.Animal.Builder;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestSpeed {

    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().withName("Tiger").withSpeed(new SecureRandom().nextInt(100)).withFlyable(false).build();
        Animal eagle = new Animal.Builder().withName("Eagle").withSpeed(new SecureRandom().nextInt(90)).withFlyable(true).build();
        Animal horse = new Animal.Builder().withName("Horse").withSpeed(new SecureRandom().nextInt(75)).withFlyable(false).build();
        Animal dog = new Animal.Builder().withName("Dog").withSpeed(new SecureRandom().nextInt(60)).withFlyable(false).build();
        Animal falcon = new Animal.Builder().withName("Falcon").withSpeed(new SecureRandom().nextInt(85)).withFlyable(true).build();


        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(falcon);
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(eagle);
        Animal winner = animalList.get(0);


        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).isFlyable()) {
                animalList.remove(i);
            } else if (animalList.get(i).getSpeed() > winner.getSpeed()) {
                winner = animalList.get(i);
            }
        }
        System.out.println("Winner is " + winner.getName() + " with speed " + winner.getSpeed());
    }

}
